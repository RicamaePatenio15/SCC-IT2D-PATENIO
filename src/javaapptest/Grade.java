
package javaapptest;
import java.util.Scanner;

public class Grade{
    
    public void getGradeInput(){
        
         Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];
        
        System.out.print("Enter number of Students: ");
        int nums = sc.nextInt();
        
        for (int i = 0; i < nums; i++) {
            System.out.println("Enter details of student: " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name of the Student: ");
            String name = sc.next();
            System.out.print("Prelim: ");
            double pr = sc.nextDouble();
            System.out.print("Midterm: ");
            double md = sc.nextDouble();
            System.out.print("Prefinal: ");
            double pf = sc.nextDouble();
            System.out.print("Final: ");
            double fn = sc.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(name, id, pr, md, pf, fn);
        }
        
        for (int i = 0; i < nums; i++) {
            gr[i].viewGrades();
        
        }
    }
    }
  
    
    
        
       

    