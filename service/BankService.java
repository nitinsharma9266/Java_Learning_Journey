package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
    
            System.out.print("Enter PIN : ");
            String pin = sc.nextLine();
    
            System.out.print("Enter Opening Balance : ");
            double balance = sc.nextDouble();
    
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
    
            System.out.println("Unable to create account.");
    
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
                    accountExists=true;
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
        catch(IOException e){
            System.out.println("Unable to login.");
            return false;
        }
        return false;
    }

}
