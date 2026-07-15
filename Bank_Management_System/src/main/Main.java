package main;
import java.util.Scanner;
import service.BankService;
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        int choice;
        
        do{

            System.out.println("\n========== BANK MANAGEMENT SYSTEM ==========");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Login");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("7. Check Balance");
            System.out.println("8. Change PIN");
            System.out.println("9. Deactivate Account");
            System.out.println("10. Activate Account");
            System.out.println("11. Delete Account");
            System.out.println("12. Logout");
            System.out.println("13. Exit");

            System.out.println("-------------------");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            System.out.println(System.getProperty("user.dir"));
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
                    bank.LoginAccount();
                    break;
            
                case 5:
                    bank.Deposit();
                    break;
            
                case 6:
                    bank.withdraw();
                    break;
            
                case 7:
                    bank.checkBalance();
                    break;
            
                case 8:
                    bank.ChangePIN();
                    break;
            
                case 9:
                    bank.DeactivateAccount();
                    break;
            
                case 10:
                    bank.activateAccount();
                    break;
            
                case 11:
                    bank.deleteAccount();
                    break;
            
                case 12:
                    // Logout baad me add karenge
                    break;
            
                case 13:
                    System.out.println("Thank You for Using Bank Management System.");
                    break;
            
                default:
                    System.out.println("Invalid Choice.");
            }
            System.out.println();
        }
        while(choice != 13);

        sc.close();
        
    }
}
