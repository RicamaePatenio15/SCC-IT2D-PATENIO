package javaapptest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Account{
    public Set<Integer> existingIDs = new HashSet<>();

    public void getPersonInfo() {
        Scanner sc = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];

        System.out.print("Enter number of accounts: ");
        int nums = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nums; i++) {
            acc[i] = new Accounts();

            System.out.println("Enter details of user " + (i + 1));

            int UID;
            while (true) {
                System.out.print("ID: ");
                UID = sc.nextInt();
                sc.nextLine(); 

                if (!existingIDs.contains(UID)) {
                    existingIDs.add(UID);
                    break;
                } else {
                    System.out.println("ID already exists! Please enter a different ID.");
                }
            }

            System.out.print("Firstname: ");
            String fname = sc.nextLine();

            System.out.print("Lastname: ");
            String lname = sc.nextLine();

            System.out.print("Email: ");
            String umail = sc.nextLine();

            System.out.print("Username: ");
            String uname = sc.nextLine();

            String pass;
            while (true) {
                System.out.print("Password: ");
                pass = sc.nextLine();
                String passval = JavaApptest.validatePass(pass); 
                if (passval.equals("valid")) {
                    break;
                } else {
                    System.out.println(pass); 
                }
            }

            acc[i].addInfo(fname, lname, umail, uname, pass, UID);
        }


        for (int i = 0; i < nums; i++) {
            acc[i].viewInfo();
        }
    }
}
