
package javaapptest;

import java.util.Scanner;

public class Grade {
    
    public void getGradeInput() {
        
        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];
        int nums = 0;
        String choice;
        
        do {
            System.out.println("-------------------");
            System.out.println("WELCOME TO GRADE APP");
            System.out.println("-------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. EDIT");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("-------------------");
            
            System.out.print("Enter Option: ");
            int option = sc.nextInt();
            
            while (option > 5) {
                System.out.print("Invalid Selection, Try Again: ");
                option = sc.nextInt();
            }
        
            switch (option) {
                
                case 1:
                    
                     System.out.print("Enter no. of Students: ");
                     nums = sc.nextInt();
                     
                    for(int i=0; i < nums; i++){
                    System.out.println("Enter details of student "+(i+1)+":");
                
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    
                    System.out.print("Name: ");
                    String name = sc.next();
                    
                    System.out.print("Prelim: ");
                    double pr = sc.nextDouble();
                    
                    System.out.print("Midterm: ");
                    double md = sc.nextDouble();
                    
                    System.out.print("Prefinal: ");
                    double pf = sc.nextDouble();
                    
                    System.out.print("Final: ");
                    double fn = sc.nextDouble();
                    
                    gr[nums] = new Grades();
                    gr[nums].addGrades(name, id, pr, md, pf, fn); 
                    nums++;
                    }
                    break;
                 
                case 2:
                   
                        for (int i = 0; i < nums; i++) {
                            gr[i].viewGrades();
                        }
                    break;
           
                case 3:
                    if (nums > 0) {
                        System.out.println("\nCurrent Grades List:");
                        for (int i = 0; i < nums; i++) {
                            gr[i].viewGrades();
                        }

                        System.out.print("Enter ID of the Student: ");
                        int Id = sc.nextInt();

                        for (int i = 0; i < nums; i++) {
                            if (gr[i].id == Id) {
                                System.out.print("New Prelim Grade: ");
                                double npr= sc.nextDouble();
                                
                                System.out.print("New Midterm Grade: ");
                                double nmd= sc.nextDouble();
                                
                                System.out.print("New Prefinal Grade: ");
                                double nmpf = sc.nextDouble();
                                
                                System.out.print("New Final Grade: ");
                                double nfn= sc.nextDouble();
    
                                gr[i].editGrades(Id, npr, nmd, nmpf,nfn);
                                break;
                            }
                        }   
                    } else {
                        System.out.println("No student records available to edit.");
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