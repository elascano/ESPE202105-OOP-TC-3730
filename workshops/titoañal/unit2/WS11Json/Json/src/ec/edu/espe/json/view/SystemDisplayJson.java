/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.json.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.json.model.Dog;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class SystemDisplayJson {
    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        Dog dog[] = new Dog[10];
        String name;
        String color;
        int age;
        String race;
        int height;
        String jsonDog = "";
        FileWriter file = new FileWriter("./files/Dog.json");
        
        for (int i = 0; i < 1; i++) {
        System.out.println("Enter the dog data");
        System.out.println("Enter name");
        name=sn.next();
        System.out.println("Enter color");
        color=sn.next();
        System.out.println("Enter age");
        age=sn.nextInt();
        System.out.println("Enter race");
        race = sn.next();
        System.out.println("Enter height");
        height=sn.nextInt();
        dog[i]= new Dog(race, name, age, color, height);
        
            
        }
        for (int i = 0; i < 1; i++) {
        System.out.println(dog[i]);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        jsonDog = gson.toJson(dog[i]);
        try {
            
            file.append(jsonDog);
            file.flush();
            file.close();

        } catch (IOException e) {
            
        }

        Dog dogs;
        dogs = gson.fromJson(jsonDog, Dog.class);
        System.out.println("jsonDog: " + jsonDog);
        System.out.println("\n");
            
        }
    }
}    
