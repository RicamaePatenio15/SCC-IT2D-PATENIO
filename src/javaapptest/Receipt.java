
package javaapptest;

import java.util.Scanner;

public class Receipt {

    String name, prodname;
    int qty, price;
    double cash, due, change;
    
    
  
public void GetInfo(){
    
    Scanner sc= new Scanner(System.in);
   
    
    
    System.out.print("Name: ");
    name= sc.nextLine();
    
    System.out.print("Product Name: ");
    prodname=sc.nextLine();
    
    System.out.print("Quantity: ");
    qty=sc.nextInt();
    
    System.out.print("Price: ");
    price=sc.nextInt();
    
    System.out.print("Cash: ");
    cash=sc.nextDouble();
    
  
}
 public void viewInfo() {
        System.out.println("---------------------");
        System.out.println("RECEIPT");
        System.out.println("---------------------");
        
        System.out.printf("Name: " + name);
        System.out.printf("\nProduct Name: " + prodname);
        System.out.printf("\nQuantity: " + qty);
        System.out.printf("\nPrice: " + price);
        System.out.printf("\nCash: " + cash);
        
        System.out.println("\n------------------------------------");
        
        due = qty * price;
        System.out.println("Total due: " + String.format("%.2f", due));
        System.out.println("Cash: " + String.format("%.2f", cash));
        
        System.out.println("\n------------------------------------------");
        
        change = cash - due;
        System.out.println("Change: " + String.format("%.2f", change));
    }
}


