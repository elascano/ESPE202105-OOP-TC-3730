/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horseobject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Hourse.model.Horse;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class HorseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        System.out.println("♥ Welcome to the horse information system ♥");
        
        String name = null;
        String color = null;
        String race = null;
        int age = 0;
        String jsonhorse = "";
        Horse horse [] = new Horse[5];
       
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("List Horse");
            System.out.println("Choose a horse of your preference");
            System.out.println("Save the date in json smash 4");
            System.out.println("To Exit press 5");
            System.out.println("\t");
            System.out.println("1. Name:Hourse Arabe\tColor:Ruano\tRace:Arabe\t");
            System.out.println("2. Name:Hourse Andaluz\tColor:Tordo\tRace:Española\t");
            System.out.println("3. Name:Hourse Pure Blood\tColor:Chestnut\tRace:American\t");
            
            try {
 
                System.out.println("Write one of the options");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("You have selected 1");
                        System.out.println("Name:Hourse Arabe\tColor:Ruano\tRace:Arabe\t");
                        break;
                    case 2:
                        System.out.println("You have selected 2");
                        System.out.println("2. Name:Hourse Andaluz\tColor:Tordo\tRace:Española\t");
                        break;
                    case 3:
                        System.out.println("You have selected 3");
                        System.out.println("3. Name:Hourse Pure Blood\tColor:Chestnut\tRace:American\t");
                        break;
                    case 4:
                        System.out.println("The date will be saved in json");
                        
                        horse [1] = new Horse (name, color, race,age);
                        
               
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        String jsonHorse = gson.toJson(horse [1]);
               
                        Horse horse1;
                        horse1 = gson.fromJson(jsonHorse, Horse.class);
                        System.out.println("The color of Horse ->" + horse1.getColor());
                        System.out.println("The name of Horse ->" + horse1.getName());
                        System.out.println("The of Age ->" + horse1.getAge());
                        System.out.println("The of the Race ->" + horse1.getRace());
                   
                        
                        break;
                    case 5:
                        salir = true;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
                
                
            }
        }
 
    }
 
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        /*String name;
        String color;
        String race;
        int age;
        String JsonHorse = "";
        
        Horse[] horse = new Horse[5];
        ArrayList<Horse> em = new ArrayList();
        
        Scanner sn = new Scanner(System.in);*/
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
