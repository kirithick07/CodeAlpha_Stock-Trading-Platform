import java.util.Scanner;
public class StockTrading {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Stock tcs=new Stock("TCS",3500);

        Stock infosys=new Stock("Infosys",1600);

        Portfolio p=new Portfolio();

        while(true){
            System.out.println("\n1.View");
            System.out.println("2.Buy");
            System.out.println("3.sell");
            System.out.println("4.Protfolio");
            System.out.println("5.Exit");

            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Tcs ₹3500");
                System.out.println("Infosys ₹1600");
            }
            else if(choice == 2){
                System.out.println("Quantity: ");
                int q=sc.nextInt();
                p.buy(tcs,q);
            }
            else if(choice == 3){
                System.out.println("Quantity:");
                int q=sc.nextInt();
                p.sell(infosys,q);
            }
            else if(choice == 4){
                p.display();
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
