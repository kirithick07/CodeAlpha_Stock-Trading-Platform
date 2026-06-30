import java.util.HashMap;
public class Portfolio {
   double balance = 100000;
   
   HashMap<String,Integer> holdings=new HashMap<>();

   void buy(Stock stock,int quantity){
    double cost=stock.price*quantity;

    if(balance>=cost){
        balance-=cost;

        holdings.put(stock.name,holdings.getOrDefault(stock.name,0)+quantity);

        System.out.println("Purchase successful");
    }
    else{
        System.out.println("Insufficient balance");
    }
   }

   void sell(Stock stock,int quantity){
    if(holdings.containsKey(stock.name) && holdings.get(stock.name)>=quantity){
        holdings.put(stock.name,holdings.get(stock.name)-quantity);

        balance-=stock.price*quantity;

        System.out.println("sold");
    }
    else{
        System.out.println("Not enough stocks");
    }
   }

   void display(){
    System.out.println("\nBalance: $"+balance);

    System.out.println("Portfolio:");

    for(String s : holdings.keySet()){
        System.out.println(s+" -> "+holdings.get(s));
    }
   }
}


