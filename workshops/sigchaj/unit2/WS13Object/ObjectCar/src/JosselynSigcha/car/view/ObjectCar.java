/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JosselynSigcha.car.view;

import JosselynSigcha.car.model.Car;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ObjectCar {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner entry = new Scanner (System.in);
        
        String color;
        String brand;
        int year;
        String type;
        String model;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonBall;
        
        System.out.println("\nEnter the color:");
        color = entry.next();
        System.out.println("\n Enter the brand");
        brand = entry.next();
        System.out.println("\n Enter the year");
        year = entry.nextInt();
        System.out.println("\n Enter the type");
        type = entry.next();
        System.out.println("\n Enter the model");
        model = entry.next();
        
        Car car = new Car(color, brand, year, type, model );
        
        System.out.println("\n WS13 Josselyn Susana Sigcha Manosalvas " );
        System.out.println("\nThe characteristics of your car: " + car );
        
        String jsonCar = gson.toJson(car);
           
        System.out.println(jsonCar); 
        System.out.println("\nJsonInformation car: " + jsonCar);
        
        try{
			FileWriter file = new FileWriter("C:/Users/Asus/Desktop/Josselyn Progra/ObjectCar/JSSM.json");
			file.write(car.toJSONString());
			file.flush();
			file.close();
                        
		}catch(Exception e){
		}
		finally{
			System.out.print("\n"+car);
		} 
          try (Writer writer = new FileWriter("C:/Users/Asus/Desktop/Josselyn Progra/ObjectCar/JSSM.json")) {
            gson.toJson(car, writer);
             }  
   }
    }


