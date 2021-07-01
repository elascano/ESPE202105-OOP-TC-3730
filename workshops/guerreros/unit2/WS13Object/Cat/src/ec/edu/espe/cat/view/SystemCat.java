/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cat.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cat.model.Cat;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class SystemCat {
    public static void main(String[] args) throws IOException {
     String name;
     String color;
     int age;
     Float stature;
     String breed;
     String jsonCat = "";
     
   FileWriter file = new FileWriter("./files/cat.json");
        
        Scanner enter = new Scanner (System.in);
        
        int counter;
        System.out.println("Welcom System Cat" + "\n Autor: Stefany Guerrero");
        System.out.println("Enter number cat: ");
        counter= enter.nextInt();
        Cat cat [] = new Cat[counter];
        
    for(int i=0;i<counter;i++){
            System.out.print("\n Insert cat name:");
            name = enter.next();
            System.out.print(" \n Insert cat color:");
            color = enter.next();              
            System.out.println("\n Insert cat stature (cm):");
            stature= enter.nextFloat();
            System.out.println(" \n Insert cat breed:");
            breed= enter.next();
            System.out.println("\n Insert cat age:");
            age= enter.nextInt();
            
             System.out.println("\n Intert next cat ");
            
            enter.nextLine();
            
              cat[i] = new Cat(name,color,age,stature,breed); 
            
              
    }
    
           for(int i=0;i<counter;i++){
       
           System.out.println(cat[i]);
    
            GsonBuilder gsonBuilder = new  GsonBuilder();
            Gson gson = gsonBuilder.create();
           
            jsonCat = gson.toJson(cat[i]);
     
            Cat cat1; 
            cat1 = gson.fromJson(jsonCat, Cat.class);
        
            jsonCat = gson.toJson(cat);
            
            
            
           System.out.println("jsonCat ->" + jsonCat);
           System.out.println("cat object Name ->" + cat1.getName());
           System.out.println("cat object Color ->" + cat1.getColor());
           System.out.println("cat object Age ->" + cat1.getAge() );
           System.out.println("cat object Stature ->" + cat1.getStature());
           System.out.println("cat object Breed ->" + cat1.getBreed());
           System.out.println("\n ");
           
           }
          
          try {
            file.append(jsonCat);
            file.flush();
            file.close();

          }catch (IOException e){
          }
          
    } 
}
