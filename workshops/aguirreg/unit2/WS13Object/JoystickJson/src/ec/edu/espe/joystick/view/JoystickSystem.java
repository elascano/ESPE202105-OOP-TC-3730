/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.joystick.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.joystick.model.Joystick;
import java.util.Scanner;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class JoystickSystem {
     public static void main(String[] args) {
        
        int price; 
        String trademark; 
        String color;
        boolean ergonomic;
        boolean wireless;
        String jsonJoystick = "";
        
                       
        Scanner enter = new Scanner (System.in);
        Joystick joystick [] = new Joystick[5];

        System.out.print("Welcome to Joystick Program" + " Author: Gabriel Aguirre ");
        
        for(int i=0;i<1;i++){
            
            System.out.print("\n");
            System.out.print("Insert Joystick price:");
            price = enter.nextInt();
            
            System.out.print("Insert Joystick trademark:");
            trademark = enter.next();
            
            System.out.print("Insert Joystick color:");
            color = enter.next();
            
            System.out.print("Inster ergonomic:");
            ergonomic = enter.nextBoolean();
            
            System.out.print("Inster wireless:");
            wireless = enter.nextBoolean();
           
             
           
            enter.nextLine();
            
            joystick[i] = new Joystick(price, trademark, color, ergonomic, wireless);  
            

        }
        
        for(int i=0;i<1;i++){
            
           System.out.println("Characteristics about Joystick:");
           
           System.out.println("\n");
       
           System.out.println("\n" + joystick[i]);

          
          GsonBuilder gsonBuilder = new  GsonBuilder();
          Gson gson = gsonBuilder.create();
          jsonJoystick = gson.toJson(joystick[i]);
          
          
          Joystick joystick1;
          joystick1 = gson.fromJson(jsonJoystick, Joystick.class);
         
 
           System.out.println("JsonJoystick ->" + jsonJoystick);
           

           

            
           
           
           
          
           
         
        
        }
    }
}