/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.view;




import static ec.managestudent.Grades.*;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Leslie Titoaña LAMESTech
 */
public class Student {
    public static void main(String[] args) throws IOException  {
        Scanner enter = new Scanner (System.in);    
        double grades[];
        String student[];
        int n; 
        double average;
        
          String jsonGrades = "";
          
          
          System.out.print("Welcome Student Platform");
          enter.nextLine();
        
         System.out.print("Enter The Number Of Student:");
         n = enter.nextInt();
         
          grades = new  double[n];
          
          student = new   String [n];
         
       add( grades,student, enter, n);
       average = average(grades);
       print(grades,student,average);
       get(grades,student);
      
    }   
   
}
