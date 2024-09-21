package javaapptest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Account {
    public Set<Integer> existingIDs = new HashSet<>();

    public void getAccount() {
        Scanner sc = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];
        int nums = 0;
        String choice;

        do {
            System.out.println("-------------------");
            System.out.println("WELCOME TO ACCOUNT APP");
            System.out.println("-------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. EDIT");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("-------------------");

            System.out.print("Enter Option: ");
            int option = sc.nextInt();

            while (option > 5 || option < 1) {
                System.out.print("Invalid Selection, Try Again: ");
                option = sc.nextInt();
            }

            switch (option) {
                case 1:
                    System.out.print("Enter number of Students: ");
                    int totalStudents = sc.nextInt();

                    for (int i = 0; i < totalStudents; i++) {
                        System.out.print("Enter ID: ");
                        int ID = sc.nextInt();
                        sc.nextLine();

                        if (existingIDs.contains(ID)) {
                            System.out.print("ID already exists. Please use a different ID: ");
                            ID = sc.nextInt();
                            sc.nextLine();
                        }

                        System.out.print("First Name: ");
                        String firstname = sc.nextLine();

                        System.out.print("Last Name: ");
                        String lastname = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.nextLine();

                        System.out.print("Username: ");
                        String username = sc.nextLine();

                        String password;
                        while (true) {
                            System.out.print("Password: ");
                            password = sc.nextLine();
                            String validationMessage = JavaApptest.validatePass(password);
                            if (validationMessage.equals("valid")) {
                                break;
                            } else {
                                System.out.println(validationMessage);
                            }
                        }

                        acc[nums] = new Accounts();
                        acc[nums].addInfo(firstname, lastname, email, username, password, ID);
                        existingIDs.add(ID);
                        nums++; 
                    }
                    break;

                case 2:
                    for (int i = 0; i < nums; i++) {
                        acc[i].viewAccount();
                    }
                    break;

                case 3:
                    if (nums > 0) {
                        System.out.println("\nCurrent Accounts List:");
                        for (int i = 0; i < nums; i++) {
                            acc[i].viewAccount();
                        }

                        System.out.print("Enter ID of User to edit: ");
                        int Id = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < nums; i++) {
                            if (acc[i].ID == Id) {
                                System.out.print("New Username: ");
                                String uname = sc.nextLine();

                                String pass;
                                while (true) {
                                    System.out.print("New Password: ");
                                    pass = sc.nextLine();
                                    String validationMessage = JavaApptest.validatePass(pass);
                                    if (validationMessage.equals("valid")) {
                                        break;
                                    } else {
                                        System.out.println(validationMessage);
                                    }
                                }

                                acc[i].editAccounts(Id, uname, pass);
                                break;
                            }
                        }
                    } else {
                        System.out.println("No accounts available to edit.");
                    }
                    break;
                    
                 case 5:
                    System.out.println("THANK YOU!!!!");
                    return;
            }

            System.out.print("Want to continue(yes/no)?: ");
            choice = sc.next();
        } while (choice.equals("y") || choice.equals("Y"));
    }
    
    
}
