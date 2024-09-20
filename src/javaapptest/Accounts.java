
package javaapptest;


public class Accounts {
     String firstname, lastname, email, username, password;
        int ID;
    
    public void addInfo(String fname, String lname, String umail, String uname, String pass, int UID){
        
        this.firstname=fname;
        this.lastname=lname;
        this.email=umail;
        this.username=uname;
        this.password=pass;
        this.ID= UID;
       
    }
    
    public void viewInfo(){
        
        System.out.println("-----------------------------------");
        System.out.println("ID: "+this.ID);
        System.out.println("Firstname: "+this.firstname);
        System.out.println("Lastname: "+this.lastname);
        System.out.println("Email: "+this.email);
        System.out.println("Username: "+this.username);
        System.out.println("Password: "+this.password);
        
       System.out.println("-------------------------------------"); 
       System.out.printf("%-10s | %-15s | %-15s | %-25s | %-10s | %-10s\n", "ID", "First Name", "Last Name", "Email", "Username", "Password");
       System.out.printf("%-10d | %-15s | %-15s | %-25s | %-10s | %-10s\n", this.ID,this.firstname, this.lastname, this.email, this.username, "************");
        
    }
    
     public void editAccounts(int id, String uname, String pass){
    if(this.ID == id){
        this.username=uname;
        this.password=pass;
        
    }
    
}
}
