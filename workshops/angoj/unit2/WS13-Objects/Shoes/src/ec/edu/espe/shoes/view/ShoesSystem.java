/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shoes.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.shoes.model.Shoes;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class ShoesSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    int size;
    String brand;
    String color;
    float cost; 
    String type;
        
       
        System.out.println("\t WS13 Object \n"
        + "Johny Ango \n"
                + "\t Shoes");
        System.out.println("Enter the size :");
        size = read.nextInt();
        System.out.println("Enter the brand");
        brand = read.next();
        System.out.println("Enter the color");
        color = read.next();     
        System.out.println("Enter the cost");
        cost = read.nextFloat(); 
        System.out.println("Enter the type");
        type = read.next();                    
        
        ArrayList<String> shoesArray = new ArrayList();
        Shoes shoes = new Shoes(size , brand , color, cost, type);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
            String jsonShoes = gson.toJson(shoes);
        FileManager.save("./files/ShoesList.json", jsonShoes);
        shoesArray = FileManager.findAll("./files/ShoesList.json");
        
        System.out.println("total: " + shoesArray.size());
        
    }
    
}
