import java.util.Scanner;

public class costpriceandsellingprice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter cost price : ");
        double cp=sc.nextDouble();
        
        System.out.print("enter selling price : ");
        double sp=sc.nextDouble();
        if(sp>cp){
            System.out.println("profit is "+((sp-cp)*100)/cp+"%");

        }
        else if(sp==cp){
            System.out.println("No profit No loss");
        }
        else{
            System.out.println("loss is "+(((cp-sp)*100)/cp)+"%");
        }
        sc.close();
    }
}
