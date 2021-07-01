/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arduino.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.arduino.model.Arduino;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class BannerInformation {
    
    static Arduino arduino [] ;
    
    
    public static void main(String[] args) throws IOException {
       
    String arduinoModel = null;
    float workingVoltage = 0;
    float memory = 0;
    String microcontroller = null;
    int pinsOut = 0;
    Scanner enter = new Scanner(System.in);
    int counter;

        FileWriter file = new FileWriter("./files/Arduino.json");
        String jsonArduino = "";
    
    
    
   
        System.out.println("Arduino Infromation Display\n");
        
        System.out.println("Author: Heredia Iza Luis Alberto\n");
        
        System.out.print("How many Arduino to enter:\n");
        counter = enter.nextInt();
        
        arduino = new Arduino[counter];
        
  for(int i=0;i< counter ;i++){
        System.out.print("Enter Arduino Model:");
        arduinoModel = enter.next();
        System.out.print("Working Voltage:");
        workingVoltage = enter.nextFloat();
        System.out.print("Memory in KB:");
        memory = enter.nextFloat();
        System.out.print("Microcontroller:");
        microcontroller = enter.next();
        System.out.print("Out Pins:");
        pinsOut = enter.nextInt();
        System.out.println("\n");
        
        enter.nextLine();
        
        arduino[i] = new Arduino(arduinoModel, workingVoltage, memory, microcontroller, pinsOut);
        
        
  }  
       for (int i = 0; i < counter; i++){
         System.out.println("\n\n Arduino List");
         System.out.println("------------------");
         System.out.println(arduino[i].toString());
         
           GsonBuilder gsonBuilder = new  GsonBuilder();
           Gson gson = gsonBuilder.create();
           jsonArduino = gson.toJson(arduino[i]);
          
       
           Arduino arduino1; 
           arduino1 = gson.fromJson(jsonArduino, Arduino.class);
           jsonArduino = gson.toJson(arduino);
           System.out.println("jsonArduino ->" + jsonArduino);
           
           
            try {
            file.append(jsonArduino);
           
            file.flush();
           
            file.close();

        } catch (IOException e) {

        }
           
           }
    }
        
              
          
    
    
        
    }
    
