/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.laptop.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.laptop.model.Laptop;
import ec.edu.espe.Filemanager.utils.FileManager;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class SystemLaptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Laptop");
        System.out.println("Mosquera Kerly");
        Scanner read = new Scanner(System.in);
        String jsonLaptop = "";
        Gson gson = new Gson();
        FileWriter file = new FileWriter("./files/Laptop.json");
        
        for( int i = 0; i < 3 ;i++) {
        System.out.println("Enter the model");
        String model = read.next();
        System.out.println("Enter the brand");
        String brand = read.next();
        System.out.println("Enter the memory");
        int memory = read.nextInt();
        System.out.println("Enter the color");
        String color = read.next();
        
         ArrayList<String> Laptop= new ArrayList();
            Laptop laptop = new Laptop(model,brand,memory,color);
            String LaptopDataJson = gson.toJson(laptop);
            FileManager.save("./files/Laptop.json", LaptopDataJson);
            Laptop  = FileManager.findAll("./files/Laptop.json"); 
            System.out.println(Laptop); 
            System.out.println("The total is: "+Laptop.size());
        }
    }
  }
