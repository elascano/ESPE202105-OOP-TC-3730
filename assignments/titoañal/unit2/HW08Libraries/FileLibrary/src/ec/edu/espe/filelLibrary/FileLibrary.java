/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filelLibrary;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Leslie Titoaña LAMESTech
 */
public class FileLibrary {
    public static void add(double grades[], String student[], Scanner enter, int n) throws IOException{
        
        
        FileWriter file = new FileWriter("./files/Student.json");
        String jsonGrades="";
        String jsonStudent = "";
        for (int i = 0; i < grades.length;i++)
        {
            System.out.println("Student Name:");
            student[i] = enter.next();
            System.out.println("Enter Grade");
            grades[i]= enter.nextDouble();
        }
         for (int i = 0; i < n ; i++)
        {
            System.out.println("Grades[i]");
             
              GsonBuilder gsonBuilder = new  GsonBuilder();
              Gson gson = gsonBuilder.create();
              
              
              jsonStudent = gson.toJson(student[i]);
              
              
              jsonGrades = gson.toJson(grades[i]);
              FileLibrary grades1;
              
                jsonStudent = gson.toJson(student);
                jsonGrades = gson.toJson(grades);
                
               System.out.println("jsonStudent ->" + jsonStudent);
               System.out.println("jsonGrades ->" + jsonGrades);
               
               try {
                      file.append(jsonStudent);
                      file.append(jsonGrades);
                       file.flush();
                       file.close();

                    } catch (IOException e){
                        
                    }
        }
        
    }
    
    public static double average(double grades[]){
        
        double average, suma = 0;
        for (int i = 0; i < grades.length; i++)
        
            suma += grades[i];
            average = suma / grades.length;
            return average;
        
    }
    
        public static void print(double grades[], String student[], double average)
    {
        System.out.printf("%-30s %-30s%n%n", "Student", "Grades");
        for (int i = 0; i < grades.length; i++)
        {
            System.out.printf("%-30s %-30f%n", student[i], grades[i]);
        }
        System.out.println("\nThe group Average is: "+average);
        
        
    }
       public static void get (double grades[], String student[])
    {
        double get = 0;
        String Student = null;
        
        for (int i = 0; i < grades.length; i++)
            if (grades[i] > get)
            {
                get = grades[i];
                Student = student[i];
            }
        
         System.out.println("\nThe Highest Rating is: "+get+" and got it "+Student);
        
    }
  
}
