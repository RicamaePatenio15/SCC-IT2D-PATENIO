
package javaapptest;

import java.util.Scanner;

public class Employee {
    
   public void getInfo(){
       Scanner sc= new Scanner(System.in);
       Employees [] emp= new Employees[100];
       
       System.out.println("Enter number of Employee/s: ");
       int nums= sc.nextInt();
       
       for (int i=0; i<nums; i++){
           
           System.out.println("Enter details of Employee "+(i+1)+ ":");
           
           System.out.println("ID: ");
           int uid=sc.nextInt();
           
           System.out.println("Name: ");
           String fname=sc.next();
           
           System.out.println("Rate (Hourly): ");
           int urate=sc.nextInt();
           
           System.out.println("Hours Worked: ");
           int uhwork=sc.nextInt();
           
           System.out.println("Deduction: ");
           int udeduction=sc.nextInt();
           
           emp[i] = new Employees();
           emp[i].addInfo(fname,uid,urate,uhwork,udeduction);
           
           
       }
          for(int i = 0; i < nums; i++){
            emp[i].viewInfo();
   }
   }
}
