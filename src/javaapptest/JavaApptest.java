
package javaapptest;

import java.util.Scanner;


public class JavaApptest {

   
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        String fname;
        String pname;
        int qty, price; 
        float cash, due, change;
       
        
        System.out.print("Customer's Name: ");
        fname = input.nextLine();
        
        System.out.print("Product Name: ");
        pname = input.nextLine();
        
        System.out.print("Quantity: ");
        qty = input.nextInt();
        
        System.out.print("Price: ");
        price= input.nextInt();
        
        System.out.print("Cash: ");
        cash= input.nextInt();
        
        
        System.out.println("\n------------------------------------------");
        System.out.println("RECEIPT");
        System.out.println("------------------------------------------");
        
        System.out.println("Name: "+fname+"\nProduct Name: "+pname+"\nQuantity: "+qty);
        
        System.out.println("------------------------------------------");
       
        due= qty*price;
       System.out.print("Total due: " +String.format("%.2f",due));
       System.out.print("\nCash: " +String.format("%.2f",cash));
        
         System.out.println("\n------------------------------------------");
         change= cash-due;
        System.out.println("Change: " +String.format("%.2f",change));
        
    }
    
}

    }
    
}
