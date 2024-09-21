package javaapptest;

import java.util.Scanner;

public class JavaApptest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String choice;

        do {
            System.out.println("-----------------------------");
            System.out.println("WELCOME TO PATENIO'S SYSTEM");
            System.out.println("-----------------------------");
            System.out.println("1. Account");
            System.out.println("2. Receipt");
            System.out.println("3. Grade");
            System.out.println("4. Practice");
            System.out.println("5. EXIT");
            System.out.println("-------------------");

            System.out.print("Choose what app to open: ");
            int option = scan.nextInt();

            while (option > 5 || option < 1) {
                System.out.print("Invalid Selection, Try Again: ");
                option = scan.nextInt();
            }

            switch (option) {
                case 1:
                    // 3rd activity
                    Account acct = new Account();
                    acct.getAccount();
                    break;

                case 2:
                    // Second Activity
                    Receipt rct = new Receipt();
                    rct.GetInfo();
                    break;

                case 3:
                    // First Activity
                    Grade grd = new Grade();
                    grd.getGradeInput();
                    break;

                case 4:
                    // Practice
                    Scanner input = new Scanner(System.in);

                    String fname;
                    String pname;
                    int qty, price;
                    float cash, due, change;

                    System.out.print("Customer's Name: ");
                    fname = input.nextLine();

                    System.out.print("Product Name: ");
                    pname = input.nextLine();

                    System.out.print("Quantity: ");
                    qty = input.nextInt();

                    System.out.print("Price: ");
                    price = input.nextInt();

                    System.out.print("Cash: ");
                    cash = input.nextFloat();

                    System.out.println("\n------------------------------------------");
                    System.out.println("RECEIPT");
                    System.out.println("------------------------------------------");

                    System.out.println("Name: " + fname + "\nProduct Name: " + pname + "\nQuantity: " + qty);

                    System.out.println("------------------------------------------");

                    due = qty * price;
                    System.out.print("Total due: " + String.format("%.2f", due));
                    System.out.print("\nCash: " + String.format("%.2f", cash));

                    System.out.println("\n------------------------------------------");
                    change = cash - due;
                    System.out.println("Change: " + String.format("%.2f", change));
                    break;

                case 5:
                    System.out.println("THANK YOU FOR USING THE PROGRAM!");
                    return;

                default:
                    break;
            }

            do {
                System.out.print("Want to open the other Application (y/n)?: ");
                choice = scan.next();

            } while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));

            if (choice.equalsIgnoreCase("n")) {
                System.out.println("\nTHANK YOU FOR USING THE SYSTEM!");
            }

        } while (choice.equalsIgnoreCase("y"));

        scan.close();
    }

    public static String validatePass(String password) {

        String[] commonPasswords = {"admin", "123", "password"};
        for (String common : commonPasswords) {
            if (password.toLowerCase().contains(common.toLowerCase())) {
                return "Password is too common. Avoid using 'admin', '123', or 'password'.";
            }
        }

        if (password.length() < 8) {
            return "Password must be at least 8 characters long.";
        }

        if (!password.matches(".*[A-Z].*")) {
            return "Password must contain at least one uppercase letter.";
        }

        if (!password.matches(".*[a-z].*")) {
            return "Password must contain at least one lowercase letter.";
        }

        if (!password.matches(".*\\d.*")) {
            return "Password must contain at least one digit.";
        }

        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return "Password must contain at least one special character.";
        }

        return "valid";
    }
}
