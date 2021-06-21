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
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class FarmSystem {

    public static void main(String[] args) throws ParseException, IOException {
        Chicken chicken;
        //TODO reading from keyboard
        int id;
        String name;
        String color;
        int age;
        String dateBorn;
        Date bornOn;
        int moltingOp;
        boolean molting;
        int eggCounter;
        String jsonChicken = "";
        Scanner read = new Scanner(System.in);
        int optionMenu;

        System.out.println("Welcome to FarmSystem Kevin");
        System.out.println("Introduce id of chicken: ");
        id = read.nextInt();
        System.out.println("Introduce name of chicken: ");
        name = read.next();
        System.out.println("Introduce color of chicken: ");
        color = read.next();
        System.out.println("Introduce age of chicken: ");
        age = read.nextInt();
        System.out.println("Introduce bornOn of chicken: ");
        dateBorn = read.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        bornOn = sdf.parse(dateBorn);
        System.out.println("Introduce molting of chicken: ");
        System.out.println("1.- Yes");
        System.out.println("2.- No: ");
        moltingOp = read.nextInt();
        if (moltingOp == 1) {
            molting = true;
        } else {
            molting = false;
        }
        System.out.println("Introduce eggCounter of chicken: ");
        eggCounter = read.nextInt();
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("1.- Save Jason");
        System.out.println("2.- Save CSV");
        System.out.println("Choose the option: ");
        optionMenu = read.nextInt();
        switch (optionMenu) {
            case 1:
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonChicken = gson.toJson(chicken);
                try {
                    FileWriter file = new FileWriter("./files/Chickens.json");
                    file.write(jsonChicken);
                    file.flush();
                    file.close();

                } catch (IOException e) {
                    //manejar error
                }
                break;
            case 2:
                try {
                    FileWriter file = new FileWriter("./files/Chickens.csv");
                    file.append(chicken.toString());
                    file.append("\n");
                    file.flush();
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default: System.out.println("Warning Error");

        }

    }
}
