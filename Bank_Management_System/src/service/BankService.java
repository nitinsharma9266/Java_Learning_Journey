package service;
import util.FileUtil;
import util.ValidationUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.Account;

public class BankService {
    private final Scanner sc = new Scanner(System.in);

    private boolean isLoggedIn = false;

    private String currentAccountNumber = null;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void createAccount() {
        
        
        try(BufferedReader br=new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))) {
    
            String accountNumber;

            while (true) {

                System.out.print("Enter Account Number : ");
                accountNumber = sc.nextLine();

                if (ValidationUtil.isValidAccountNumber(accountNumber)) {
                    break;
                }

                System.out.println("Invalid Account Number. Please try again.");
            }

            System.out.println();

            String line;
            boolean accountExists = false;
    
            while ((line = br.readLine()) != null) {
    
                String[] parts = line.split(",");
    
                if (parts[0].equals(accountNumber)) {
                    accountExists = true;
                    break;
                }
            }
    
            if (accountExists) {
                System.out.println("Account Number Already Exists!");
                return;
            }
    
            String accountHolderName;

            while (true) {

                System.out.print("Enter Account Holder Name : ");
                accountHolderName = sc.nextLine();

                if (ValidationUtil.isValidName(accountHolderName)) {
                    break;
                }

                System.out.println("Invalid Name. Please try again.");
            }
            System.out.println();

            String pin;

            while (true) {

                System.out.print("Enter PIN : ");
                pin = sc.nextLine();

                if (ValidationUtil.isValidPin(pin)) {
                    break;
                }

                System.out.println("PIN must be exactly 4 digits.");
            }
            System.out.println();

            double balance;

            while (true) {

                System.out.print("Enter Opening Balance : ");
                balance = sc.nextDouble();
                sc.nextLine();

                if (ValidationUtil.isValidOpeningBalance(balance)) {
                    break;
                }

                System.out.println("Minimum Opening Balance is 1000.");
            }

            System.out.println();

            Account account = new Account(accountNumber, accountHolderName, pin, balance,"ACTIVE");
    
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(FileUtil.getAccountFilePath(), true))){

            bw.write(account.toString());

            bw.newLine();
    
            }
    
            System.out.println("Account Created Successfully.");
    
        } catch (IOException e) {
    
            System.out.println(e.getMessage());
    
        }
    }
    

    public void viewAllAccounts() {

        try(BufferedReader br = new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))) {
    
            String line;
            boolean found = false;
    
            while ((line = br.readLine()) != null) {
    
                found = true;
    
                String[] parts = line.split(",");

                Account account = new Account(
                    parts[0],
                    parts[1],
                    parts[2],
                    Double.parseDouble(parts[3]),
                    parts[4]
                );
    
                System.out.println("----------------------------------");
                System.out.println("Account Number      : " + account.getAccountNumber());
                System.out.println("Account Holder Name : " + account.getAccountHolderName());
                System.out.println("Balance             : " + account.getBalance());
                System.out.println("Status              : " + account.getStatus());
                System.out.println("----------------------------------");
                System.out.println();
    
            }
    
            if (!found) {
                System.out.println("No Accounts Found.");
            }
    
        } catch (IOException e) {
    
            System.out.println("Unable to read account records.");
    
        }
    }

    public void searchAccount() {

        String searchId;

        while (true) {

            System.out.print("Enter  Account Number to be search : ");
            searchId = sc.nextLine();

            if (ValidationUtil.isValidAccountNumber(searchId)) {
                break;
            }

            System.out.println("Invalid Account Number. Please try again.");
        }
        System.out.println();

        boolean found = false;
    
        try(BufferedReader br = new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))) {
    
    
            String line;
    
            while ((line = br.readLine()) != null) {
    
                String[] parts = line.split(",");
    
                if (parts[0].trim().equals(searchId)) {
    
                    found = true;
    
                    Account account = new Account(
                            parts[0],
                            parts[1],
                            parts[2],
                            Double.parseDouble(parts[3]),
                            parts[4]
                    );
    
                    System.out.println("----------------------------------");
                    System.out.println("Account Number      : " + account.getAccountNumber());
                    System.out.println("Account Holder Name : " + account.getAccountHolderName());
                    System.out.println("Balance             : " + account.getBalance());
                    System.out.println("Status              : " + account.getStatus());
                    System.out.println("----------------------------------");
    
                    break;
                }
    
            }
    
            if (!found) {
                System.out.println("Account Not Found.");
            }
    
        } catch (IOException e) {
    
            System.out.println("Unable to search account records.");
    
        }
    }

    public boolean loginAccount(){

        if (isLoggedIn) {
            System.out.println("Already logged in.");
            return true;
        }
        String accountNumber;

        while (true) {

            System.out.print("Enter Account Number : ");
            accountNumber = sc.nextLine();

            if (ValidationUtil.isValidAccountNumber(accountNumber)) {
                break;
            }

            System.out.println("Invalid Account Number. Please try again.");
        }
        System.out.println();

        try(BufferedReader br=new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))){
            
            String line;
            boolean accountExists=false;
            while ((line=br.readLine())!=null) {
                String[] parts=line.split(",");
                if(parts[0].trim().equals(accountNumber.trim())){
                    accountExists = true;

                    if(parts[4].trim().equals("ACTIVE")){
                        Account account = new Account(
                            parts[0],
                            parts[1],
                            parts[2],
                            Double.parseDouble(parts[3]),
                            parts[4]);
                        int attempts = 3;
                        while (attempts > 0){
                            String pin;

                            while (true) {

                                System.out.print("Enter PIN : ");
                                pin = sc.nextLine();

                                if (ValidationUtil.isValidPin(pin)) {
                                    break;
                                }

                                System.out.println("PIN must be exactly 4 digits.");
                            }
                            System.out.println();
                            
                            if (account.checkPin(pin)) {

                                isLoggedIn = true;

                                currentAccountNumber = account.getAccountNumber();

                                System.out.println("Welcome, "+account.getAccountHolderName());
                                System.out.println("Login successfully..");
                                return true;
                                
                            }
                        
                            else{
                                attempts--;
                                System.out.println("Invalid PIN");
                                System.out.println("Attempts Left : " + attempts);    
                            }
                        }
                        System.out.println("Maximum Login Attempts Reached.");
                        return false;
                    }
                    else{
                        System.out.println("Account Inactive");
                        return false;
                        
                    }
                }
            }
            
            if(!accountExists){
                System.out.println("Account Not Found...."); 
                return false; 
            } 
        } 
        catch(IOException e)
        { System.out.println("Unable to login."); 
        return false; } return false; 
    }

    
    public void deposit(){ 
        double updatedBalance = 0;
        boolean found = false; 
        if (!isLoggedIn) {
            System.out.println("Please login first.");
            return;
        }
        else{ 
            try(BufferedReader br=new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))){  
                StringBuilder data=new StringBuilder(); 

                double depositAmount;

                while (true) {

                    System.out.print("Enter Deposit Amount : ");
                    depositAmount = sc.nextDouble();
                    sc.nextLine();

                    if (ValidationUtil.isValidDeposit(depositAmount)) {
                        break;
                    }

                    System.out.println("Invalid Deposit Amount.");
                }
                String line; 
                while((line=br.readLine())!=null){ 

                    String parts[]=line.split(",");

                    if(parts[0].trim().equals(currentAccountNumber.trim())){
                        found=true; 
                        
                        
                        double balance = Double.parseDouble(parts[3]);
                        
                        balance=balance+depositAmount;
                        updatedBalance =balance; 

                        line = parts[0] + "," +
                            parts[1] + "," +
                            parts[2] + "," +
                            balance + "," +
                            parts[4];
                         
                    } 
                    data.append(line).append("\n"); 
                } 
                
                // Ab puri file dobara likhi gayi 
                try (BufferedWriter wr = new BufferedWriter(new FileWriter(FileUtil.getAccountFilePath()))) {
            
                wr.write(data.toString());
            
                }

                if(found){
                    System.out.println("Deposit Successful.");
                    System.out.println("Current balance : "+updatedBalance);
                }
                else{
                    System.out.println("Account Not Found.");
                }
            } 
            catch(Exception e){ 
                System.out.println(e.getMessage()); 
            } 
        } 
    }
    public void withdraw(){
        double updatedBalance = 0;

        boolean found = false; 
        if (!isLoggedIn){
            System.out.println("Please login first.");
            return;
        }
        else{ 
            try(BufferedReader br=new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))){  
                StringBuilder data=new StringBuilder(); 

                double withdrawAmount;

                while (true) {

                    System.out.print("Enter Withdraw Amount : ");
                    withdrawAmount = sc.nextDouble();
                    sc.nextLine();

                    if (ValidationUtil.isValidWithdraw(withdrawAmount)) {
                        break;
                    }

                    System.out.println("Invalid Withdraw Amount.");
                }
                String line; 
                while((line=br.readLine())!=null){ 

                    String parts[]=line.split(",");

                    if(parts[0].trim().equals(currentAccountNumber.trim())){
                        found=true; 
                        
                        
                        double balance = Double.parseDouble(parts[3]);
                        
                        if (balance >= withdrawAmount) {
                            balance = balance - withdrawAmount;
                            updatedBalance=balance;
                        }
                        else {
                            System.out.println("Insufficient Balance.");
                            return;
                        }

                        line = parts[0] + "," +
                            parts[1] + "," +
                            parts[2] + "," +
                            balance + "," +
                            parts[4];
                        
                    data.append(line).append("\n"); 
                } 
                
                // Ab puri file dobara likhi gayi 
                try (BufferedWriter wr = new BufferedWriter(
                    new FileWriter(FileUtil.getAccountFilePath()))) {
            
                wr.write(data.toString());
            
                }

                if(found){
                    System.out.println("Withdraw Successful.");
                    System.out.println("Remaining Balance : ₹" + updatedBalance);
                }
                else{
                    System.out.println("Account Not Found.");
                }
            
                }
            }
            catch(Exception e){ 
                System.out.println(e.getMessage()); 
            } 
        } 
    
    }

    public void checkBalance(){
        if(!isLoggedIn){
            System.out.println("Please login first.");
            return;
        }
        try( BufferedReader br = new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))){
            
            String line;
            boolean found = false;
            while((line = br.readLine()) != null){
                
                String[] parts = line.split(",");
                if(parts[0].trim().equals(currentAccountNumber.trim())){
                    found=true;
                    System.out.println("----------------");
                    System.out.println("Account Number : "+parts[0]);
                    System.out.println("Account Holder Name : "+parts[1]);
                    System.out.println("Balance : "+parts[3]);
                    System.out.println("Status : "+parts[4]);
                    System.out.println("----------------");
                    break;

                }
            }
            if (!found) {
                System.out.println("Account Not Found.");
            }
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }

    public void changePIN(){

        if (!isLoggedIn) {
            System.out.println("Please login first.");
            return;
        }
        String newPin;

        while (true) {

            System.out.print("Enter New PIN : ");
            newPin = sc.nextLine();

            if (ValidationUtil.isValidPin(newPin)) {
                break;
            }

            System.out.println("PIN must be exactly 4 digits. Please try again.");
        }

        System.out.println();

        String confirmPin;

        while (true) {

            System.out.print("Confirm New PIN : ");
            confirmPin = sc.nextLine();

            if (newPin.equals(confirmPin)) {
                break;
            }

            System.out.println("PIN Mismatch! Please enter the same PIN again.");
        }

        try(BufferedReader br=new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))){
            
            StringBuilder data=new StringBuilder();
            
            String line;
            boolean found = false;
            while((line=br.readLine())!=null){
                
                String[] parts=line.split(",");
                if(parts[0].trim().equals(currentAccountNumber.trim())){
                    found=true;
                    line = parts[0] + "," +
                        parts[1] + "," +
                        newPin + "," +
                        parts[3] + "," +
                        parts[4];
                    
                }
                data.append(line).append("\n");
            }

            try (BufferedWriter wr = new BufferedWriter(new FileWriter(FileUtil.getAccountFilePath()))) {
        
            wr.write(data.toString());
        
            }
            if(!found){
                System.out.println("Account Not Found.");
            }
            System.out.println("PIN Changed Successfully.");
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void deactivateAccount(){
        
        if (!isLoggedIn) {
            System.out.println("Please login first.");
            return;
        }
        System.out.print("Are you sure you want to deactivate your account? (Y/N): ");
        String choice = sc.nextLine();

        if (!choice.equalsIgnoreCase("Y")) {
            System.out.println("Account Deactivation Cancelled.");
            return;
        }

        System.out.println();

        try(BufferedReader br=new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))){
            
            StringBuilder data=new StringBuilder();
            
            String line;
            boolean found = false;
            while((line=br.readLine())!=null){
                
                String[] parts=line.split(",");
                if(parts[0].trim().equals(currentAccountNumber.trim())){
                    found=true;
                    line = parts[0] + "," +
                        parts[1] + "," +
                        parts[2]+ "," +
                        parts[3] + "," +
                        "INACTIVE";
                    
                }
                data.append(line).append("\n");
            }

            try (BufferedWriter wr = new BufferedWriter(new FileWriter(FileUtil.getAccountFilePath()))) {
        
            wr.write(data.toString());
        
            }
            if(found){
                System.out.println("Account Deactivated Successfully.");
                isLoggedIn = false;
                currentAccountNumber = null;
            }
            else{
                System.out.println("Account Not Found.");
            }
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void activateAccount(){
    
        String accountNumber;

        while (true) {

            System.out.print("Enter Account Number : ");
            accountNumber = sc.nextLine();

            if (ValidationUtil.isValidAccountNumber(accountNumber)) {
                break;
            }

            System.out.println("Invalid Account Number. Please try again.");
        }
        System.out.println();

        String pin;

        while (true) {

            System.out.print("Enter New PIN : ");
            pin = sc.nextLine();

            if (ValidationUtil.isValidPin(pin)) {
                break;
            }

            System.out.println("PIN must be exactly 4 digits. Please try again.");
        }
        try(BufferedReader br=new BufferedReader(new FileReader(FileUtil.getAccountFilePath()))){
            
            StringBuilder data =new StringBuilder();
            String line;
            boolean found=false;
            while ((line=br.readLine())!=null) {
                String[] parts=line.split(",");
                if(parts[0].trim().equals(accountNumber.trim()) && parts[2].trim().equals(pin.trim()) && parts[4].trim().equals("INACTIVE")){
                    found=true;
                    line = parts[0] + "," +
                        parts[1] + "," +
                        parts[2] + "," +
                        parts[3] + "," +
                        "ACTIVE";
                }
                data.append(line).append("\n");
            
            }
            
            try(BufferedWriter wr=new BufferedWriter(new FileWriter(FileUtil.getAccountFilePath()))){
                wr.write(data.toString());
            }
            if(found){
                System.out.println("Account Activate successfully..");

            }
            else{
                System.out.println("Invalid Account Number, PIN or Account is already ACTIVE.");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        

    }
    public void deleteAccount(){

        if (!isLoggedIn) {
            System.out.println("Please login first.");
            return;
        }
        
        try(
            BufferedReader br = new BufferedReader(new FileReader(FileUtil.getAccountFilePath()));
            BufferedWriter wr = new BufferedWriter(new FileWriter("temp.txt"))
        )
        {

            System.out.print("Are you sure you want to delete this account? (Y/N): ");
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("Y")) {
                System.out.println("Account Deletion Cancelled.");
                return;
            }

            boolean found=false;
            String line;

            while((line=br.readLine())!=null){
                String[] parts=line.split(",");
                if(parts[0].trim().equals(currentAccountNumber.trim())){
                    found=true;
                    continue;
                }
                wr.write(line);
                wr.newLine();
                
            }
            
            File oldFile=new File(FileUtil.getAccountFilePath());
            File tempFile=new File("temp.txt");

            if(oldFile.delete()){
                if(tempFile.renameTo(oldFile)){
                    System.out.println("File Updated Successfully.");
                }
            }

            if (found) {
                System.out.println("Account Deleted Successfully");
                isLoggedIn = false;
                currentAccountNumber = null;
            }
            else{
                System.out.println("Account Not Found");
            }
            
        }
    
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }

    public void logout() {

        isLoggedIn = false;
    
        currentAccountNumber = null;
    
        System.out.println("Logged Out Successfully.");
    
    }

    public void exitApplication() {

        if (isLoggedIn) {
            logout();
        }
    
        System.out.println();
        System.out.println("====================================");
        System.out.println(" Thank You for Using Our Bank System");
        System.out.println("====================================");
        System.out.println("Exiting Application...");
        System.out.println();
    
        sc.close();
        System.exit(0);
    }
}



    
            