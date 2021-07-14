/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.computer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Computer {
    static int counter;
    static Scanner read= new Scanner(System.in);
    static String jsonComputerData = "";
    static ComputerData computerData[]= null;
    
    public static void Computer(String brand, String color,float cost,String processor,int ram ) throws IOException{
        FileWriter file = new FileWriter("./files/Computer.json");
        
        System.out.println("Enter numbers of Computers: ");
        counter = read.nextInt();
                
       
         computerData  = new ComputerData[counter];

        
        for (int i=0; i<counter; i++) {
            
            System.out.print("\n");
            System.out.print("Enter the brand:");
            brand = read.next();
            
            System.out.print("Enter the color:");
            color = read.next();
            
            System.out.print("Enter the cost:");
            cost = read.nextFloat();
            
            System.out.print("Enter the processor:");
            processor = read.next();
            
            System.out.print("Enter the ram:");
            ram = read.nextInt();
       
            
            computerData [i] = new ComputerData(brand, color, cost, processor, ram);
    }
     
        for(int i=0;i<counter;i++){
            
           System.out.println("Characteristics about Computer:");
       
           System.out.println("\n" + computerData[i]);

          
          GsonBuilder gsonBuilder = new  GsonBuilder();
          Gson gson = gsonBuilder.create();
          jsonComputerData = gson.toJson(computerData[i]);
          
          
          ComputerData computerData1;
          computerData1 = gson.fromJson(jsonComputerData, ComputerData.class);
          jsonComputerData = gson.toJson(computerData);
           try {
            file.append(jsonComputerData);
           
            file.flush();
           
            file.close();

        } catch (IOException e) {

        }
           System.out.println("JsonComputerData ->" + jsonComputerData);
       
        }
    }  
        public static void find(String brand, String color,float cost,String processor,int ram) throws IOException {
        
        int position = -1;
        
            System.out.println("Enter the ram");
            ram = read.nextInt();
            position = find(ram);
            if(position >= 0){
                System.out.println("ComputerData ->" + computerData[position].toString() );
            }
        
    }

    private static int find(int ram) {
      int position=-1;
        
        for(int i = 0; i <counter; i++){
        
            if (computerData[i].getRam()== ram){
                    System.out.println("Computer Found!! ");
                position = i;
                
            }
            else{
                System.out.println("Computer Not Found...");            }
    
        }
        return position;   
    }
}

    
