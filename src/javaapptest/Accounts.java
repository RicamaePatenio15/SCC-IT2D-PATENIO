package javaapptest;

public class Accounts {
    String firstname, lastname, email, username, password;
    int ID;

    public void addInfo(String fname, String lname, String umail, String uname, String pass, int UID) {
        this.firstname = fname;
        this.lastname = lname;
        this.email = umail;
        this.username = uname;
        this.password = pass;
        this.ID = UID;
    }

    public void viewAccount() {
      
        System.out.printf("%-15s | %-15s | %-15s | %-25s | %-15s | %-15s\n", "ID", "First Name", "Last Name", "Email", "Username", "Password");
        System.out.printf("%-15d | %-15s | %-15s | %-25s | %-15s | %-15s\n", this.ID, this.firstname, this.lastname, this.email, this.username, "************");
    }

    public void editAccounts(int id, String uname, String pass) {
        if (this.ID == id) {
            this.username = uname;
            this.password = pass;
        }
    }
}
