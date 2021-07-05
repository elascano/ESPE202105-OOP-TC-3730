/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.carLibrary;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Josselyn Sigcha Futures Programmers ESPE-DCC0
 */
public class CarLibrary {
    
       static int cont = 0 ; 
       static Car car [] = null;
       static Scanner sc = new Scanner(System.in);
       static String jsonCar = "";
    
    public static void enter(String color, String type, String brand, String model, int year) throws IOException {
        
        FileWriter file = new FileWriter("./files/CarInformation.json");
        
        
        
        
        
        System.out.println("Enter numbers of cars:  ");
        
        cont = sc.nextInt();
        
        car = new Car[cont];
        
        
        
        for(int i=0;i< cont ;i++){
            
        System.out.print("Brand :");
        brand =  sc.next();     
        System.out.print("Color:");
        color = sc.next();
        System.out.print("Type:");
        type = sc.next();
        System.out.print("Model:");
        model = sc.next();
        System.out.print("Year:");
        year = sc.nextInt();
      
        sc.nextLine();
  
        car[i] = new Car(color, type, brand, model, year);
           
        }
        
        for (int i = 0; i < cont; i++){
           GsonBuilder gsonBuilder = new  GsonBuilder();
           Gson gson = gsonBuilder.create();
           jsonCar = gson.toJson(car[i]);
          
       
           Car car1; 
           car1 = gson.fromJson(jsonCar, Car.class);
           jsonCar = gson.toJson(car);
           System.out.println(car[i].toString());
           
           
           
           try {
            file.append(jsonCar);
           
            file.flush();
           
            file.close();

        } catch (IOException e) {

        }
         
         }

                      
        
    }
      
         public static void find(String color, String type, String brand, String model, int year){
             
              int location= -1;
              
                  System.out.print("Year");
                  year = sc.nextInt();
                  location = search(year);
                  
                  if (location >=0){                   
                      System.out.println("Car: " + car[location].toString());
                  
                  }
                  
                  } 

    private static int search(int year) {
        
        int location=-1;
        
        for(int i = 0; i <cont; i++){
        
            if (car[i].getYear()== year){
                    System.out.println("Car is ");
                location = i;
                
            }
            else{
                System.out.println("Car Not Found");            }
    
        }
        return location;
    }
         }
