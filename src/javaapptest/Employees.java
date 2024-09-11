
package javaapptest;

public class Employees {
    String name;
    int id, rate,hwork, deduction;
    
    public void addInfo(String fname, int uid, int urate, int uhwork, int udeduction){
        
        
        this.id=uid;
        this.name=fname;
        this.rate=urate;
        this.hwork=uhwork;
        this.deduction=udeduction;
    
    }

    public void viewDetails(){
        double gross=this.rate*this.hwork;
    double Netpay= gross-this.deduction;
        System.out.println("\n-----------------------------------");
        System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s|\n", "ID", "Name", "Rate", "Hours", "Work", "Gross", "Deduction", "Net Pay");
        System.out.printf("%-10d | %-10s | %-10d | %-10d | %-10.2f | %-10d | %-10.2f|\n", this.id, this.name,this.rate, this.hwork, gross, this.deduction, Netpay);
   
         System.out.println("\n----------------------------");
         System.out.println("Total salary: " +gross);
         System.out.println("Total Employee Deduction: "+this.deduction);
         System.out.println("Total Netpay: "+Netpay);
      
        
        
}
      
}