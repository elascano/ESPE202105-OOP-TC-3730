/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ObjectSneaker.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.ObjectSneaker.model.Sneakers;
import java.util.Scanner;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class SneakerInformation {
    public static void main(String[] args) {
        
        System.out.println("****Welcome to System****" + "LILIAN IZA_NRC3730");
          System.out.println("--------------------");
          System.out.println(" System of Sneaker");
          System.out.println("--------------------");
    
     String color ;
     String type;
     String model;
     String made;
     String destination;
     int size;
     String quality;
     
     String jsonSneakers = "";
     
     Scanner enter = new Scanner (System.in);
     Sneakers sneaker [] = new Sneakers[5];
    
     System.out.println("*********************");
     System.out.println("Enter the sneaker data ");
     System.out.println("*********************");
           System.out.println("Enter the color of Sneaker:");
           color = enter.next();
           System.out.println("Enter the type of Sneaker");
           type = enter.next();
           System.out.println("Enter the model of Sneaker");
           model = enter.next();
           System.out.println("Enter the made of Sneaker");
           made = enter.next();
           System.out.println("Enter the destination of Sneaker");
           destination = enter.next();
           System.out.println("Enter the size of Sneaker");
           size = enter.nextInt();
           System.out.println("Enter the quality of Sneaker");
           quality = enter.next();
     
     enter.nextLine();
              
           sneaker [1] = new Sneakers (color, type, model, made, destination, size, quality); 
           
           GsonBuilder gsonBuilder = new  GsonBuilder();
           Gson gson = gsonBuilder.create();
           jsonSneakers = gson.toJson(sneaker [1]);
                   
       
           Sneakers sneakers; 
           sneakers = gson.fromJson(jsonSneakers, Sneakers.class);
           System.out.println("*********************************************************");
                  System.out.println("The color of Sneaker ->" + sneakers.getColor());
                  System.out.println("The type of Sneaker ->" + sneakers.getType());
                  System.out.println("The model of Sneaker ->" + sneakers.getModel());
                  System.out.println("The made of Sneaker ->" + sneakers.getMade());
                  System.out.println("The destination of Sneaker ->" + sneakers.getDestination());
                  System.out.println("The size of Sneaker ->" + sneakers.getSize());
                  System.out.println("The quality of Sneaker ->" + sneakers.getQuality());
           System.out.println("**********************************************************");
           
      
    }
}
