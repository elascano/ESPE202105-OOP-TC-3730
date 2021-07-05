/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.filemagener.Student;
import java.io.IOException;
import java.util.Scanner;
import java.io.Writer;
import java.io.FileWriter;
        

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class StudentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner entry = new Scanner (System.in);
        String name;
        String lastName;
        int age;
        int nrc;
        int id = 0;
        boolean exit = false;
        int option;
        String reference = null;
        String inquire;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        while(!exit){
            System.out.println("MENU");
            System.out.println("1.Enter estudent date:");
            System.out.println("2. Save date in the file");
            System.out.println("3. Search date");
            System.out.println("4. Exit");
            System.out.print("Enter option:");
            option = entry.nextInt();
            
            switch(option){
                case 1:
                System.out.println(" Enter the name");
                name= entry.next();
                System.out.println("Enter the lastName");
                lastName = entry.next();
                System.out.println("Enter the age");
                age = entry.nextInt();
                System.out.println("Enter nrc");
                nrc = entry.nextInt();
                System.out.println("Enter the id");
                id = entry.nextInt();
                reference = Student.information(name,lastName,age,nrc);
                break;
                
                case 2:
                    Student.put(reference, id);
                    
                    break;
                case 3:
                    System.out.println("Number of the id you want to search");
                    Scanner evince = new Scanner (System.in);
                    inquire = evince.nextLine();
                    Student.search(inquire);
                    break;
                case 4 :
                    exit = true;
                    break;
            
                    }
                    
                    
               
                    
         }
        
     }
        
 }
    

