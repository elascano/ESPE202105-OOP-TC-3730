/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.gameconsole.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;
import ec.edu.espe.gameconsole.model.Gameconsole;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class Systemgameconsole {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Gameconsole  gameconsole;
        String brand;
        String model;
        String processor;
        String color;
        String jsonGameconsole = " ";
        int i;
        
        for(i = 0; i<=0; i++){
            System.out.println("Brand: ");
            brand = read.next();
            System.out.println("Model: ");
            model = read.next();
            System.out.println("Processor: ");
            processor = read.next();
            System.out.println("Color: ");
            color = read.next();
            
            gameconsole = new Gameconsole(brand, model, processor, color);
            
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            jsonGameconsole = gson.toJson(gameconsole);
            try{
                FileWriter file = new FileWriter("./files/Gameconsole.json");
                file.write(jsonGameconsole);
                file.flush();
                file.close();                
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }
    }
}
