/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arduinoFileManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class ArduinoFileManager{
    
       static int cont = 0 ; 
       static ArduinoModel arduino [] = null;
       static Scanner enter = new Scanner(System.in);
       static String jsonArduino = "";
       
     
      
    
    public static void read( String arduinoModel ,float workingVoltage , float memory , String microcontroller , int pinsOut) throws IOException  {
       
        FileWriter file = new FileWriter("./files/ArduinoHW08.json");
        
        System.out.println("Arduino Infromation Display\n");
        
        System.out.println("Authors: Haro Morales Luis Federico-Heredia Iza Luis Alberto-Iza Guerra Lilian Estefania  \n");
        
        System.out.println("How many Arduino to enter:\n");
        
        cont = enter.nextInt();
        
        arduino = new ArduinoModel[cont];
                      
         for(int i=0;i< cont ;i++){
             
        System.out.print("Enter Arduino Model:");
        arduinoModel = enter.next();
        System.out.print("Enter voltage Working:");
        workingVoltage = enter.nextFloat();
        System.out.print("Memory Capacity:");
        memory =  enter.nextInt();
        System.out.print("Microcontroller:");
        microcontroller = enter.next();
        System.out.print("Out Pins:");
        pinsOut = enter.nextInt();
      
        enter.nextLine();
    
            arduino[i] = new ArduinoModel(arduinoModel,workingVoltage,memory, microcontroller, pinsOut);
           
         }
         
         for (int i = 0; i < cont; i++){
           GsonBuilder gsonBuilder = new  GsonBuilder();
           Gson gson = gsonBuilder.create();
           jsonArduino = gson.toJson(arduino[i]);
          
       
           ArduinoModel arduino1; 
           arduino1 = gson.fromJson(jsonArduino, ArduinoModel.class);
           jsonArduino = gson.toJson(arduino);
          
           
           
            try {
            file.append(jsonArduino);
           
            file.flush();
           
            file.close();

        } catch (IOException e) {

        }
         }
         
        
    }
    
    
    public static void search( String arduinoModel ,float workingVoltage , float memory , String microcontroller , int pinsOut) {
        
        
            
            int pos= -1;
            int action = 0;
                  System.out.print("Enter Pins Out Product");
                  pinsOut = enter.nextInt();
                  pos = search1(pinsOut);
                  
                  if (pos >=0){                   
                      System.out.println("Arduino: " + arduino[pos].toString());
                  
                  }
                  
                  } 
    
        
    
    private static int search1(int pinsOut) {
        
        
         int pos=-1;
        
        for(int i = 0; i <cont; i++){
        
            if (arduino[i].getPinsOut()== pinsOut){
                    System.out.println("Arduino Found ");
                pos = i;
                
            }
            else{
                System.out.println("Arduino Not Found");            }
    
        }
        return pos;
    }
    
    public static void display( String arduinoModel ,float workingVoltage , float memory , String microcontroller , int pinsOut) throws IOException {
        
        
      
         System.out.println("\n\n Arduino List");
         System.out.println("------------------");
         
          for (int i = 0; i < cont; i++){
         
         System.out.println(arduino[i].toString());
         
           
        
          }
        
        
                  
                         
    }
}
