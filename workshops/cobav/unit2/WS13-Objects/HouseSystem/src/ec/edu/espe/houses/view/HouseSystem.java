/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.houses.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.houses.model.House;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor Coba Beta Software ESPE-DCCD
 */
public class HouseSystem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       
        String size;
        String color;
        String location;
        int floors;
        String type;

        System.out.println("\t WS13 Object \n"
        + " Victor Coba \n"
                + "\t House ");
        System.out.println("Enter the size of the House :");
        size  = read.next();
        System.out.println("Enter the color of the House : ");
        color = read.next();
        System.out.println("Enter the location of the House :  ");
        location = read.next();     
        System.out.println("Enter the floors of the House : ");
        floors = read.nextInt(); 
        System.out.println("Enter the type of the House : ");
        type = read.next(); 
    
        ArrayList<String> houseArray = new ArrayList();
        House house = new House (size, color, location , floors , type);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
            String jsonHouse = gson.toJson(house);
        FileManager.save("./files/HouseList.json", jsonHouse);
        houseArray = FileManager.findAll("./files/HouseList.json");
        
        System.out.println("total: " + houseArray.size());
        
    }   
}
