/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartPhone.view;

import SmartPhone.model.Smartphone;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;


/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Smartphonesimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Smartphone smartphone ;
        //TODO reading from keyboard
        String brand;
        String model;
        int ram;
        int rom;
        String color;
        String title;
     
        String jsonSmartphone = "";
        Scanner read = new Scanner(System.in);
        int optionMenu;
        FileWriter file = new FileWriter("./files/Smartphones.json");
        System.out.println("Welcome to Smatphone system Kevin");
        do{
        System.out.println("1.- Smartphones");
        System.out.println("2.- Exit");
        
        System.out.println("Choose the option: ");
        optionMenu = read.nextInt();
        switch (optionMenu) {
            case 1:
                System.out.println("Introduce brand of the Smartphone: ");
                brand = read.next();
                System.out.println("Introduce model of the Smartphone: ");
                model = read.next();
                System.out.println("Introduce the Ram that you want: ");
                ram = read.nextInt();
                System.out.println("Introduce Rom that you want: ");
                rom = read.nextInt();
                System.out.println("Introduce the color of the Smartphone: ");
                color = read.next();
                
                smartphone = new Smartphone(brand, model, ram, rom, color);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonSmartphone = gson.toJson(smartphone);
                try {
                    file.append(jsonSmartphone);
                    file.flush();
                    file.close();

                } catch (IOException e) {
                    //manejar error
                }
                break;
            case 2:
                System.out.println("Exit of system");
                break;
            default:
                System.out.println("option not valid...!!!");
        }
        }while(optionMenu!=2);

    }
    
}
