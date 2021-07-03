/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.associations.model.WashingMachine;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Json {
    public static void main(String[] args) throws IOException {
        System.out.println ("Save data in Json file (WashingMachine), \n"
            + "Alina Villavicencio");
        
        String color;
        String brand;
        int capacity;
        float price;
        
        Scanner read = new Scanner(System.in);
        ArrayList<String> wm = new ArrayList();
        
        
        System.out.print("Enter the color \n");
        color = read.next();
        System.out.print("Enter the brand \n");
        brand = read.next();
        System.out.print("Enter the capacity \n");
        capacity = read.nextInt();
        System.out.print("Enter the price \n");
        price = read.nextFloat();
        
        
        
        WashingMachine washingMachine = new WashingMachine(color,brand,capacity,price);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson= gsonBuilder.create();
        String WashingMachineDataJson = gson.toJson(washingMachine);
        FileManager.save("./file/WashingMachine.json", WashingMachineDataJson);
        wm = FileManager.findAll("./file/WashingMachine.json");
        System.out.println(wm);
        
        
        
           
    }
    
}
