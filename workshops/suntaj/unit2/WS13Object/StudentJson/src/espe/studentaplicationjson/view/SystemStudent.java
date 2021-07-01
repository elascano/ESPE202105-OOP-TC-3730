/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.studentaplicationjson.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import epe.studentaplicationjson.model.Information;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class SystemStudent {
    public static void main(String[] args) throws IOException {
     
      String name = null;  
      int age = 0;
      String university= null;
      String semester = null;
      String racing = null;
      String jsonInformation = "";
      
       FileWriter file = new FileWriter("./files/StudentJson.json");
      Scanner sn= new Scanner(System.in);
         Scanner enter = new Scanner (System.in);
         
          int counter;
        System.out.println("Welcome "+" Author: Gabriela Sunta");
        System.out.println("Enter The number of Students:");
        counter = enter.nextInt();
        Information information[] = new Information[counter];
        
        
         
             for(int i=0;i<counter;i++){
            
            System.out.print("Insert Student name:");
            name = enter.next();
            System.out.print("Insert age:");
            age= enter.nextInt();
            System.out.print("Insert University name:");
            university = enter.next();
            System.out.print("Insert Semester:");
            semester = enter.next();
             System.out.print("Insert Racing:");
            racing = enter.next();
            
            System.out.println("Insert next Student");
            
            enter.nextLine();
            
             information [i] = new Information(name, age, university, semester, racing);
               
         
    
       }
              
              for(int i=0;i<counter;i++){
                  
              System.out.println("information[i]");
              
              GsonBuilder gsonBuilder = new  GsonBuilder();
              Gson gson = gsonBuilder.create();
              
              jsonInformation = gson.toJson(information[i]);
              
             Information  information1;
             information1 = gson.fromJson(jsonInformation,Information.class);
             
             jsonInformation = gson.toJson(information);   
             
           System.out.println("jsonInformation ->" + jsonInformation);
           System.out.println("Student object Name" + information1.getName());
           System.out.println("Student object University ->" + information1.getUniversity());
           System.out.println("Student object Semester ->" + information1.getSemester());
           System.out.println("Student object Racing ->" + information1.getRacing());
             
           
           try {
                      file.append(jsonInformation);
                       
                       file.flush();
                       file.close();

                    } catch (IOException e){
                        
                    }
           
             
             
              }
              
      
     
       }
    
    
    }

