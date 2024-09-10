
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
    
    public void viewInfo(){
        
        System.out.print("----------------------------");
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Rate (Hourly): "+this.rate);
        System.out.println("Hours worked: "+this.hwork);
        System.out.println("Deduction: "+this.deduction);
        
    }
    public void viewDetails(){
//    int Netpay= (this.rate*this.hwork)-this.deduction
//    double average= totalmarks/4;
//    String status= (average > 3.0) ? "Failed" : "Pass";
   // System.out.printf("%-10d %-10s %-10d %-10d %-10d %-10d", this.id, this.name,this.rate, this.hwork, this.deduction, Netpay);
}
}