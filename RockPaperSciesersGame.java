import java.util.Random;
import java.util.Scanner;

public class RockPaperSciesersGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1 = Rock!");
        System.out.println("2 = Paper!");
        System.out.println("3 = Sciesers");

        System.out.print("Enter your choice : ");
        int player=sc.nextInt();

        Random r = new Random();
        int computer =r.nextInt(3)+1;

        if(player==computer){
            System.out.println("player and Computer are Draw!");
        }
        else if ((player == 1 && computer == 3) ||
                 (player == 2 && computer == 1) ||
                 (player == 3 && computer == 2)) {
            System.out.println("You Win!");
        }
        else if (player >= 1 && player <= 3) {
            System.out.println("Computer Wins!");
        }
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

