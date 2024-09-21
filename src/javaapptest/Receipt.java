
package javaapptest;
import java.util.Scanner;

public class Receipt {


    public void GetInfo() {
        Receipts[] rc = new Receipts[100];
        Scanner sc = new Scanner(System.in);
        int nums = 0;
        String choice;

        do {

            System.out.println("-------------------");
            System.out.println("WELCOME TO RECEIPT APP");
            System.out.println("-------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. EDIT");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("-------------------");

            System.out.print("Enter Option: ");
            int option = sc.nextInt();
            sc.nextLine();

            while (option > 5) {
                System.out.print("Invalid Selection, Try Again: ");
                option = sc.nextInt();
                sc.nextLine();
            }

            switch (option) {
                case 1:
                    
                     System.out.print("Enter no. Customer/s: ");
                     nums = sc.nextInt();
                     
                    for(int i=0; i < nums; i++){
                        
                    System.out.print("Customer ID: ");
                    int uid= sc.nextInt();
                    
                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Product Name: ");
                    String prodname = sc.next();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Price: ");
                    int price = sc.nextInt();

                    System.out.print("Cash: ");
                    double cash = sc.nextDouble();

                    rc[nums] = new Receipts();
                    rc[nums].addInfo(uid, name, prodname, qty, price, cash);
                    nums++;
                    }
                    
                    break;

                case 2:
                    for (int i = 0; i < nums; i++) {
                        rc[i].viewInfo();
                    }
                    break;

               case 3:
                  
                    if (nums > 0) {
                    System.out.println("\nCurrent Receipts List:");
                    
                    for (int i = 0; i < nums; i++) {
                            rc[i].viewInfo();
                        }
            }                 
                    System.out.print("Enter the Customer ID of the Receipt to Edit: ");
                        int cid = sc.nextInt();
                        boolean found = false;

                       
                        for (int i = 0; i < nums; i++) {
                            if (rc[i].uid== cid) {
                                found = true;

                                
                                System.out.print("Enter New Quantity: ");
                                int uqty = sc.nextInt();

                                System.out.print("Enter New Cash: ");
                                double ucash = sc.nextDouble();

                               
                                rc[i].editReceipts(uqty, ucash);
                                System.out.println("Receipt updated successfully.");
                                break;
                            }
                        }

                    if (!found){
                            System.out.println("Receipt with Customer ID '" + cid + "' not found.");
                        }else{
                        System.out.println("No receipts available to edit.");
                    }
                    break;
                    
                case 5:
                    System.out.println("THANK YOU!!!!");
                    return;
   
            }
            
            System.out.print("Want to continue (yes/no)?: ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));

    }
}