
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
    

}

