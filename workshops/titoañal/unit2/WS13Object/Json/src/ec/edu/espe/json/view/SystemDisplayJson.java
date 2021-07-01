/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.json.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.json.model.Dog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class SystemDisplayJson {
    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        
        String name;
        String color;
        int age;
        String race;
        int height;
        int option;
        
        ArrayList<String> dogs = new ArrayList();
 
        System.out.println("How many dogs do you want to enter");
        option= sn.nextInt();
        System.out.println("Enter the dog data");
        
        for (int i = 0; i < option; i++) {
        System.out.println("Enter name");
        name=sn.next();
        System.out.println("Enter color");
        color=sn.next();
        System.out.println("Enter age");
        age=sn.nextInt();
        System.out.println("Enter race");
        race = sn.next();
        System.out.println("Enter height in cetimeters");
        height=sn.nextInt();
        
        Dog dog = new Dog(name, age, color, height, race);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String DogJson = gson.toJson(dog);                
        FileManager.save("./files/Dog.json", DogJson);
        dogs = FileManager.findAll("./files/Dog.json");
        System.out.println(dogs);
        }
    }
}    