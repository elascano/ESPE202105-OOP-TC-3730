/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */

public class FarmSystem {
    public static void main(String[] args) throws ParseException {
        
        Scanner read = new Scanner(System.in);
        Chicken chicken;
        int id;
        String name;
        String color;
        int age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        String birthday;
        int menuMolting;
        String jsonChicken = "";
        int menu;

        System.out.println("Marco_Arias_HW07_Chicken-Json-Csv");
        System.out.println("\tChicken facts");
        System.out.println("Place id: ");
        id = read.nextInt();
        System.out.println("place name: ");
        name = read.next();
        System.out.println("place color: ");
        color = read.next();
        System.out.println("place age: ");
        age = read.nextInt();
        System.out.println("place birthday: ");
        birthday = read.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY");
        bornOn = simpleDateFormat.parse(birthday);
        System.out.println("\tPlace molting: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Place option: ");
        menuMolting = read.nextInt();
        if (menuMolting == 1) {
            molting = true;
        } else {
            molting = false;
        }
        System.out.println("Place eggCounter: ");
        eggCounter = read.nextInt();
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("\tSelect the option to save");
        System.out.println("1. Jason");
        System.out.println("2. CSV");
        System.out.println("Place option: ");
        menu = read.nextInt();
        
        switch (menu) {
            case 1:
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonChicken = gson.toJson(chicken);
                try {
                    FileWriter file = new FileWriter("./files/ChickenFacts.json");
                    file.write(jsonChicken);
                    file.flush();
                    file.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    FileWriter file = new FileWriter("./files/ChickenFacts.csv");
                    file.append(chicken.toString()+ "\n");
                    file.flush();
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default: System.out.println("THERE IS NO SUCH CASE"); 
        }
    }
}