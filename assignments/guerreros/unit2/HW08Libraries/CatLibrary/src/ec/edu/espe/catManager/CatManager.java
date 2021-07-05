/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.catManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class CatManager {
 static Scanner enter= new Scanner(System.in);
 static int count =0;
 static Cat cat[]=null;
 static String jsonCat = "";


 
 
    public static void  enter(String name, String color, String breed, int age, Float stature ) throws IOException{
        

      
        System.out.println(" Number of cats: ");
        count = enter.nextInt();
        cat= new Cat[count];
        FileWriter file = new FileWriter("./files/Cat.json");
    
     for(int i=0;i<count;i++){
            System.out.print("\n Insert cat name:");
            name = enter.next();
            System.out.print(" \n Insert cat color:");
            color = enter.next(); 
            System.out.println("\n Insert cat breed ");
            breed= enter.next();
            System.out.println("\n Insert age");
            age= enter.nextInt();
            System.out.println("\n Insert stature  ");
            stature= enter.nextFloat();
            
      enter.nextLine();

      cat[i] = new Cat( name, color, age, stature, breed);
    }    
     
     for(int i=0; i<count; i++){
            
     
            GsonBuilder gsonBuilder = new  GsonBuilder();
            Gson gson = gsonBuilder.create();
           
            jsonCat = gson.toJson(cat[i]);
     
            Cat cat1; 
            cat1 = gson.fromJson(jsonCat, Cat.class);
        
            jsonCat = gson.toJson(cat);
     
     
      }
          
          try {
            file.append(jsonCat);
            file.flush();
            file.close();

          }catch (IOException e){
          }
     
    }
    
     public static void indicate( String name, String color, String breed, int age, Float stature ) {

         System.out.println("Cats");
         
         System.out.println("\n ");
          for(int i=0; i<count; i++){
          
              System.out.println(cat[i].toString());
          
          }
         
         
         
     }


 public static void search(String name, String color, String breed, int age, Float stature){
  
     int status =-1;
     System.out.println(" Enter age ");
     
     age= enter.nextInt();
     status = search1(age);
     if(status>=0){
         System.out.println("Cat="+cat[status].toString());
     }
     
     
                  
 
 
 }

    private static int search1(int age) {
       
        
        
        int status=-1;
        
        for(int i = 0; i <count; i++){
        
            if (cat[i].getAge()== age){
                    System.out.println("Cat Found ");
                     status = i;
                
            }
            else{
                System.out.println("Cat Not Found");            }
    
        }
        return status;
        
        
    }
}
     
     
    
     
       
