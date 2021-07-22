/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.joysticks;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Joystick {

    static int cont = 0;
    static Scanner enter = new Scanner (System.in);
    static String jsonFeatures = "";
    static Features features[] = null;
    
    public static void Joystick(int unit, String trademark, String color, boolean ergonomic, boolean wireless) throws IOException {
    
        FileWriter file = new FileWriter("./files/Joystick.json");
        
        System.out.println("Enter numbers of Joysticks: ");
        cont = enter.nextInt();
                
       
         features  = new Features[cont];

        
        for (int i=0; i<cont; i++) {
            
            System.out.print("\n");
            System.out.print("Insert Joystick unit:");
            unit = enter.nextInt();
            
            System.out.print("Insert Joystick trademark:");
            trademark = enter.next();
            
            System.out.print("Insert Joystick color:");
            color = enter.next();
            
            System.out.print("Inster ergonomic:");
            ergonomic = enter.nextBoolean();
            
            System.out.print("Inster wireless:");
            wireless = enter.nextBoolean();
           
             
           
            enter.nextLine();
            
            features[i] = new Features(unit, trademark, color, ergonomic, wireless);  
            

        }
   
        for(int i=0;i<cont;i++){
            
           System.out.println("Characteristics about Joystick:");
           
           System.out.println("\n");
       
           System.out.println("\n" + features[i]);

          
          GsonBuilder gsonBuilder = new  GsonBuilder();
          Gson gson = gsonBuilder.create();
          jsonFeatures = gson.toJson(features[i]);
          
          
          Features features1;
          features1 = gson.fromJson(jsonFeatures, Features.class);
         jsonFeatures = gson.toJson(features);
           try {
            file.append(jsonFeatures);
           
            file.flush();
           
            file.close();

        } catch (IOException e) {

        }
 
           System.out.println("JsonFeatures ->" + jsonFeatures);
           
         
        
        }
    }  
        public static void find(int unit, String trademark, String color, boolean ergonomic, boolean wireless) throws IOException {
        
        int pos = -1;
        
            System.out.println("Enter unit");
            unit = enter.nextInt();
            pos = find(unit);
            if(pos >= 0){
                System.out.println("Joystick ->" + features[pos].toString() );
            }
        
    }

    private static int find(int unit) {
      int pos=-1;
        
        for(int i = 0; i <cont; i++){
        
            if (features[i].getUnit()== unit){
                    System.out.println("Joystick Found!! ");
                pos = i;
                
            }
            else{
                System.out.println("Joystick Not Found...");            }
    
        }
        return pos;   
    }

}