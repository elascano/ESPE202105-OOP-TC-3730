/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template registry, choose Tools | Templates
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
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class FarmSystem {

    public static void main(String[] args) throws ParseException, IOException {
        
        Chicken chicken;
        int id;
        String name;
        String color;
        int age;
        String dateBorn;
        Date bornOn;
        int moltingOption;
        boolean molting;
        int eggCounter;
        String jsonChicken = "";
        Scanner read = new Scanner(System.in);
        int menu;
        
        System.out.println("HW07 Chicken .Json and .Csv, \n"
                        + "Pamela Yugsi");

        System.out.println("Welcome to FarmSystem Ma.Pamela");
        
        System.out.println("Enter id of chicken: ");
        id = read.nextInt();
        
        System.out.println("Enter name of chicken: ");
        name = read.next();
        
        System.out.println("Enter color of chicken: ");
        color = read.next();
        
        System.out.println("Enter age of chicken: ");
        age = read.nextInt();
        
        System.out.println("Enter bornOn of chicken: ");
        dateBorn = read.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        bornOn = sdf.parse(dateBorn);
        
        System.out.println("Enter molting of chicken: ");
        System.out.println("1) Yes");
        System.out.println("2) No:");
        moltingOption = read.nextInt();
        
        if (moltingOption == 1) {
            molting = true;
        } else {
            molting = false;
        }
        
        System.out.println("Enter eggCounter of chicken: ");
        eggCounter = read.nextInt();
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("1) Save Jason");
        System.out.println("2) Save CSV");
        System.out.println("Choose the option: ");
        menu = read.nextInt();
        
        switch (menu) {
            case 1:
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonChicken = gson.toJson(chicken);
                
                try {
                    FileWriter registry = new FileWriter("./registry/Chickens.json");
                    registry.write(jsonChicken);
                    registry.flush();
                    registry.close();

                } catch (IOException e) {
                }
                
                break;
                
            case 2:
                
                try {
                    FileWriter registry = new FileWriter("./registry/Chickens.csv");
                    registry.append(chicken.toString());
                    registry.append("\n");
                    registry.flush();
                    registry.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                break;
            default: System.out.println("Error message");
        }
    }
}
