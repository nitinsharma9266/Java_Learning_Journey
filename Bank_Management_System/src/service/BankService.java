package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.Account;

public class BankService {
    Scanner sc = new Scanner(System.in);
    public void createAccount() {
        
        
        try {
    
            System.out.print("Enter Your Account Number : ");
            String accountNumber = sc.nextLine();
            
            System.out.println();

            BufferedReader br = new BufferedReader(new FileReader("database/account.txt"));
    
            String line;
            boolean accountExists = false;
    
            while ((line = br.readLine()) != null) {
    
                String[] parts = line.split(",");
    
                if (parts[0].equals(accountNumber)) {
                    accountExists = true;
                    break;
                }
            }
    
            br.close();
    
            if (accountExists) {
                System.out.println("Account Number Already Exists!");
                return;
            }
    
            System.out.print("Enter Account Holder Name : ");
            String accountHolderName = sc.nextLine();
            
            System.out.println();

            System.out.print("Enter PIN : ");
            String pin = sc.nextLine();
            
            System.out.println();
            
            System.out.print("Enter Opening Balance : ");
            double balance = sc.nextDouble();
            sc.nextLine();
    
            if (balance < 1000) {
                System.out.println("Minimum Opening Balance should be 1000.");
                return;
            }
    
            Account account = new Account(accountNumber, accountHolderName, pin, balance,"ACTIVE");
    
            BufferedWriter bw = new BufferedWriter(new FileWriter("database/account.txt", true));
    
                bw.write(account.getAccountNumber() + "," +
                account.getAccountHolderName() + "," +
                pin + "," +
                account.getBalance() + "," +
                account.getStatus());

            bw.newLine();
    
            bw.close();
    
            System.out.println("Account Created Successfully.");
    
        } catch (IOException e) {
    
            System.out.println(e.getMessage());
    
        }
    }

    public void viewAllAccounts() {

        try {
    
            BufferedReader br = new BufferedReader(
                    new FileReader("database/account.txt"));
    
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
    
            br.close();
    
            if (!found) {
                System.out.println("No Accounts Found.");
            }
    
        } catch (IOException e) {
    
            System.out.println("Unable to read account records.");
    
        }
    }

    public void searchAccount() {

        System.out.print("Enter Account Number : ");
        String searchId = sc.nextLine().trim();
    
        boolean found = false;
    
        try {
    
            BufferedReader br = new BufferedReader(new FileReader("database/account.txt"));
    
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
    
            br.close();
    
            if (!found) {
                System.out.println("Account Not Found.");
            }
    
        } catch (IOException e) {
    
            System.out.println("Unable to search account records.");
    
        }
    }

    public boolean LoginAccount(){
        System.out.print("Enter Your Account Number : ");
        String accountNumber=sc.nextLine();
        System.out.println();

        try(BufferedReader br=new BufferedReader(new FileReader("database/account.txt"))){
            
            String line;
            boolean accountExists=false;
            while ((line=br.readLine())!=null) {
                String[] parts=line.split(",");
                if(parts[0].trim().equals(accountNumber.trim())){
                    accountExists = true;
                    currentAccountNumber = accountNumber;

                    if(parts[4].trim().equals("ACTIVE")){
                        Account account = new Account(
                            parts[0],
                            parts[1],
                            parts[2],
                            Double.parseDouble(parts[3]),
                            parts[4]);
                        int attempts = 3;
                        while (attempts > 0){
                            System.out.print("Enter Pin : ");
                            String pin=sc.nextLine();
                            System.out.println();
                            
                            if (account.checkPin(pin)) {

                                System.out.println("Pin is correct!");
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
    private String currentAccountNumber;
    public void Deposit(){ 
        
        boolean found = false; 
        if (!LoginAccount()) { 
            return; 
        } 
        else{ 
            try(BufferedReader br=new BufferedReader(new FileReader("database/account.txt"))){  
                StringBuilder data=new StringBuilder(); 

                System.out.println("Enter Deposite Balance : "); 
                double Deposite=sc.nextDouble(); 
                sc.nextLine();
                
                if (Deposite <= 0) { 
                System.out.println("Invalid Deposit Amount."); 
                return; 
                } 
                String line; 
                while((line=br.readLine())!=null){ 

                    String parts[]=line.split(",");

                    if(parts[0].trim().equals(currentAccountNumber.trim())){
                        found=true; 
                        
                        
                        double balance = Double.parseDouble(parts[3]);
                        
                        balance=balance+Deposite; 

                        line = parts[0] + "," +
                            parts[1] + "," +
                            parts[2] + "," +
                            balance + "," +
                            parts[4];
                        System.out.println("Updated record : "+line); 
                    } 
                    data.append(line).append("\n"); 
                } 
                
                // Ab puri file dobara likhi gayi 
                try (BufferedWriter wr = new BufferedWriter(
                    new FileWriter("database/account.txt"))) {
            
                wr.write(data.toString());
            
                }

                if(found){
                    System.out.println("Account Updated Successfully.");
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
        boolean found = false; 
        if (!LoginAccount()) { 
            return; 
        } 
        else{ 
            try(BufferedReader br=new BufferedReader(new FileReader("database/account.txt"))){  
                StringBuilder data=new StringBuilder(); 

                System.out.print("Enter Withdraw Amount : ");
                int withdrawAmount=sc.nextInt(); 
                sc.nextLine();
                
                if (withdrawAmount <= 0) { 
                System.out.println("Invalid withdraw Amount."); 
                return; 
                } 
                String line; 
                while((line=br.readLine())!=null){ 

                    String parts[]=line.split(",");

                    if(parts[0].trim().equals(currentAccountNumber.trim())){
                        found=true; 
                        
                        
                        double balance = Double.parseDouble(parts[3]);
                        
                        if (balance >= withdrawAmount) {
                            balance = balance - withdrawAmount;
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
                        System.out.println("Updated record : "+line); 
                    } 
                    data.append(line).append("\n"); 
                } 
                
                // Ab puri file dobara likhi gayi 
                try (BufferedWriter wr = new BufferedWriter(
                    new FileWriter("database/account.txt"))) {
            
                wr.write(data.toString());
            
                }

                if(found){
                    System.out.println("Amount Withdraw Successfully.");
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
    public void checkBalance(){
        if (!LoginAccount()) {
            return;
        }
        try( BufferedReader br = new BufferedReader(new FileReader("database/account.txt"))){
            
            String line;
            boolean found = false;
            while((line = br.readLine()) != null){
                found=true;
                String[] parts = line.split(",");
                if(parts[0].trim().equals(currentAccountNumber.trim())){
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

    public void ChangePIN(){

        if (!LoginAccount()) {
            return;
        }

        System.out.print("Enter New Pin : ");
        String newPin=sc.nextLine();

        System.out.println();

        System.out.print("Enter new Pin : ");
        String confirmPin=sc.nextLine();

        System.out.println();

        if(!newPin.equals(confirmPin)){
            System.out.println("Pin Mismatch !");
            return;
        }

        try(BufferedReader br=new BufferedReader(new FileReader("database/account.txt"))){
            
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
                    System.out.println("Update record : "+line);
                }
                data.append(line).append("\n");
            }

            try (BufferedWriter wr = new BufferedWriter(new FileWriter("database/account.txt"))) {
        
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

    public void DeactivateAccount(){
        
        if (!LoginAccount()) {
            return;
        }
        System.out.print("Are you sure you want to deactivate your account? (Y/N): ");
        String choice = sc.nextLine();

        if (!choice.equalsIgnoreCase("Y")) {
            System.out.println("Account Deactivation Cancelled.");
            return;
        }

        System.out.println();

        try(BufferedReader br=new BufferedReader(new FileReader("database/account.txt"))){
            
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
                    System.out.println("Update record : "+line);
                }
                data.append(line).append("\n");
            }

            try (BufferedWriter wr = new BufferedWriter(new FileWriter("database/account.txt"))) {
        
            wr.write(data.toString());
        
            }
            if(found){
                System.out.println("Account Deactivated Successfully.");
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
        System.out.print("Enter Account Number : ");
        String accountNumber=sc.nextLine();
        System.out.println();

        System.out.println("Enter Pin : ");
        String Pin=sc.nextLine();

        try(BufferedReader br=new BufferedReader(new FileReader("database/account.txt"))){
            
            StringBuilder data =new StringBuilder();
            String line;
            boolean found=false;
            while ((line=br.readLine())!=null) {
                String[] parts=line.split(",");
                if(parts[0].trim().equals(accountNumber.trim()) && parts[2].trim().equals(Pin.trim()) && parts[4].trim().equals("INACTIVE")){
                    found=true;
                    line = parts[0] + "," +
                        parts[1] + "," +
                        parts[2] + "," +
                        parts[3] + "," +
                        "ACTIVE";
                }
                data.append(line).append("\n");
            
            }
            
            try(BufferedWriter wr=new BufferedWriter(new FileWriter("database/account.txt"))){
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

        if (!LoginAccount()) {
            return;
        }
        
        try(
            BufferedReader br = new BufferedReader(new FileReader("database/account.txt"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("temp.txt"))
        )
        {

            System.out.print("Are you sure you want to delete this account? (Y/N): ");
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("Y")) {
                System.out.println("Account Deletion Cancelled.");
                return;
            }

            boolean Found=false;
            String line;

            while((line=br.readLine())!=null){
                String[] parts=line.split(",");
                if(parts[0].trim().equals(currentAccountNumber.trim())){
                    Found=true;
                    continue;
                }
                wr.write(line);
                wr.newLine();
                
            }
            
            File oldFile=new File("database/account.txt");
            File tempFile=new File("temp.txt");

            if(oldFile.delete()){
                if(tempFile.renameTo(oldFile)){
                    System.out.println("File Updated Successfully.");
                }
            }

            if (Found) {
                System.out.println("Account Deleted Successfully");
            }
            else{
                System.out.println("Account Not Found");
            }
            
        }
    
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}



    
            