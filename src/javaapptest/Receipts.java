
package javaapptest;

public class Receipts {
    String name, prodname;
    int uid, qty, price;
    double cash, due, change;

    public void addInfo(int id, String cname, String cprod, int cqty, int cprice, double ccash) {
        this.uid= id;
        this.name = cname;
        this.prodname = cprod;
        this.qty = cqty;
        this.price = cprice;
        this.cash = ccash;
        this.due = qty * price;
        this.change = cash - due;
    }

    public void viewInfo() {
        System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s\n", "Customer Number", "Name", "Product Name", "Quantity", "Price", "Cash", "Due", "Change");
         System.out.printf("%-15d | %-15s | %-15s | %-15d | %-15d | %-15.2f | %-15.2f | %-15.2f\n", this.uid, this.name, this.prodname, this.qty, this.price, this.cash, due, change);
    }

    public void editReceipts(int uqty, double ucash) {
        this.qty = uqty;
        this.cash = ucash;
        this.due = qty * price;
        this.change = cash - due;
    }
}