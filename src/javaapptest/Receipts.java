
package javaapptest;

public class Receipts {
    String name, prodname;
    int qty, price;
    double cash, due, change;
    
    public void addInfo(String cname, String cprod, int cqty, int cprice, double ccash, double cdue, double cchange){
        
        this.name=cname;
        this.prodname=cprod;
        this.qty=cqty;
        this.price=cprice;
        this.cash=ccash;
        this.due=cdue;
        this.change= cchange;
       
    }
    
//public void viewInfo(){
//        
//        System.out.print("---------------------");
//        System.out.print("RECEIPT");
//        System.out.print("---------------------");
//        
//        
//        System.out.print("Name "+name);
//        System.out.print("Product Name: "+prodname);
//        System.out.print("Quantity: "+qty);
//        System.out.print("Price: "+price);
//        System.out.print("Cash: "+cash);
//      
//        
//        System.out.println("------------------------------------");
//        
//        due= qty*price;
//        System.out.println("Total due: "+String.format("%.2f", due));
//        System.out.println("\nCash: "+String.format("%.2f", cash));
//        System.out.println("\n------------------------------------------");
//        
//        change= cash-due;
//        System.out.println("Change: " +String.format("%.2f",change));
//}
}

