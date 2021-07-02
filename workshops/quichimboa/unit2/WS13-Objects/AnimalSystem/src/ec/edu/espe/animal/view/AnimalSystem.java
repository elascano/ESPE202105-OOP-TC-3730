/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.animal.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.animal.model.Animal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class AnimalSystem {
        public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age;
        String color;
        String name;
        String size;
        String type;
        System.out.println("\t WS13 Object \n"
        + "Andrea Quichimbo \n"
                + "\t Animals");

        System.out.println("Enter the age of the animal:");
        age = read.nextInt();
        System.out.println("Enter the color of the animal");
        color = read.next();
        System.out.println("Enter the name of the animal");
        name = read.next();     
        System.out.println("Enter the size of the animal");
        size = read.next(); 
        System.out.println("Enter the type of the animal");
        type = read.next();
        
        ArrayList<String> animalArray = new ArrayList();
        Animal animal = new Animal(age, color, name, size, type);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
            String jsonAnimal = gson.toJson(animal);
        FileManager.save("./files/AnimalList.json", jsonAnimal);
        animalArray = FileManager.findAll("./files/AnimalList.json");
        
        System.out.println("total: " + animalArray.size());
    }

}
