package main;
import java.util.Scanner;
import service.BankService;
import util.FileUtil;
public class Main {
    
    public static void main(String[] args) {
        FileUtil.initializeDatabase();
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();


        int choice;
        
        do {

            if (!bank.isLoggedIn()) {
        
                System.out.println("\n========== BANK MANAGEMENT SYSTEM ==========");
                System.out.println("1. Create Account");
                System.out.println("2. View All Accounts");
                System.out.println("3. Search Account");
                System.out.println("4. Login");
                System.out.println("5. Activate Account");
                System.out.println("6. Exit");
                System.out.println("--------------------------------------------");
        
            } else {
        
                System.out.println("\n========== CUSTOMER MENU ==========");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Change PIN");
                System.out.println("5. Deactivate Account");
                System.out.println("6. Delete Account");
                System.out.println("7. Logout");
                System.out.println("8. Exit");
                System.out.println("-----------------------------------");
        
            }
        
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(choice){
                
                case 1:
                    bank.createAccount();
                    break;
            
                case 2:
                    bank.viewAllAccounts();
                    break;
            
                case 3:
                    bank.searchAccount();
                    break;
            
                case 4:
                    bank.loginAccount();
                    break;
            
                case 5:
                    bank.deposit();
                    break;
            
                case 6:
                    bank.withdraw();
                    break;
            
                case 7:
                    bank.checkBalance();
                    break;
            
                case 8:
                    bank.changePIN();
                    break;
            
                case 9:
                    bank.deactivateAccount();
                    break;
            
                case 10:
                    bank.activateAccount();
                    break;
            
                case 11:
                    bank.deleteAccount();
                    break;
            
                case 12:
                    bank.logout();
                    break;
            
                case 13:
                    bank.exitApplication();
                    break;
            
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
            System.out.println();
        }
        while (choice != 6 && choice != 8);

        sc.close();
        
    }
}
