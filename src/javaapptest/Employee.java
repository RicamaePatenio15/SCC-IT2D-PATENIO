
package javaapptest;

import java.util.Scanner;

public class Employee {
    
   public void getInfo(){
       Scanner sc= new Scanner(System.in);
       Employees [] emp= new Employees[100];
       
       System.out.print("Enter number of Employee/s: ");
       int nums= sc.nextInt();
       
       for (int i=0; i<nums; i++){
           
           System.out.print("Enter details of Employee "+(i+1)+ ":");
           
           System.out.print("\nID: ");
           int uid=sc.nextInt();
           
           System.out.print("Name: ");
           String fname=sc.next();
           
           System.out.print("Rate (Hourly): ");
           int urate=sc.nextInt();
           
           System.out.print("Hours Worked: ");
           int uhwork=sc.nextInt();
           
           System.out.print("Deduction: ");
           int udeduction=sc.nextInt();
           
           emp[i] = new Employees();
           emp[i].addInfo(fname,uid,urate,uhwork,udeduction);
           
           
       }
          for(int i = 0; i < nums; i++){
            emp[i].viewDetails();
             System.out.println("Number of Employees: "+nums);
   }
   }
}
