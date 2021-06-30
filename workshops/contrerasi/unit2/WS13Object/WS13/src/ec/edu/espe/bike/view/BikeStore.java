/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bike.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.bike.model.Bike;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian Contreras LAMES ESPE-DCCO
 */
public class BikeStore {
    public static void main(String[] args){
        System.out.println ("Ian Contreras \n");
            Scanner entry = new Scanner(System.in);
            Scanner data = new Scanner(System.in);    
            Scanner sc =new Scanner(System.in);
  
    String size;
    String colour;
    String type;
    
    Bike bike[] = new Bike[10];
    ArrayList<Bike> boo = new ArrayList();
         
        for (int i = 0; i < 1; i++) {
        
        System.out.print("Enter Size (Big, Medium, Small): \n");
        size = entry.next();
        
        System.out.print("Enter the colour: \n");
        colour = entry.next();
        
        System.out.print("Enter Type (Road, Mountain, BMX, Urban): \n");
        type = entry.next();
        
        bike[i] = new Bike(size, colour, type);

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson= gsonBuilder.create();
            String jsonBike = gson.toJson(bike[i]);
                     
            Bike bike1;
            bike1 = gson.fromJson(jsonBike, Bike.class);
            System.out.println("jsonBike:"+jsonBike);
                         
            System.out.println(bike[i].getSize() + "" + bike[i].getColour()+ "" + bike[i].getType());
        } 
    }
}
