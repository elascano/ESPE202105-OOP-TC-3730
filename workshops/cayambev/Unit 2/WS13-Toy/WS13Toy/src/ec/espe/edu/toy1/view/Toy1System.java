/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.toy1.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.toy1.model.Toy1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Toy1System {
    public static void main(String[] args) throws IOException{
        Toy1 toy1 ;
        
        String name;
        String color;
        float size;
        float price;
        String material;
       
        String jsonToy1 = "";
        Scanner read = new Scanner(System.in);
        int optionMenu;
        FileWriter file = new FileWriter("./files/Toy1.json");
        System.out.println("Toy system Vanessa");
        do{
        System.out.println("1.- Toys");
        System.out.println("2.- Exit");
        
        System.out.println("Choose the option: ");
        optionMenu = read.nextInt();
        switch (optionMenu) {
            case 1:
                System.out.println("Write name of the Toy: ");
                name = read.next();
                System.out.println("Write color of the Toy: ");
                color = read.next();
                System.out.println("Write size of the Toy: ");
                size = read.nextFloat();
                System.out.println("Write price of the Toy: ");
                price = read.nextFloat();
                System.out.println("Write material of the Toy: ");
                material = read.next();
                
              
                toy1 = new Toy1(name, color, size, price, material);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonToy1 = gson.toJson(toy1);
                
                try {
                    file.append(jsonToy1);
                    file.flush();
                    file.close();

                } catch (IOException e) {
                    
                }
                break;
            case 2:
                System.out.println("Exit of system");
                break;
            default:
                System.out.println("option not valid!!");
        }
        }while(optionMenu!=2);
    }
}
