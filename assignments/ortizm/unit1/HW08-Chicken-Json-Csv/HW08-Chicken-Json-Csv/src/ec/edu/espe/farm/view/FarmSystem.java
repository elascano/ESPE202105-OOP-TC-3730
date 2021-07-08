/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class FarmSystem {

    public static void main(String[] args) throws IOException {

        Scanner data = new Scanner(System.in);
        int id;
        String name;
        String color;
        int eggCounter;
        boolean molting;

        String jsonChicken = "";
        String jsonBornOn = "";
        String jsonAge = "";
        boolean exit = false;
        int option;

        Chicken chickens[] = new Chicken[10];
        ArrayList<Chicken> chick = new ArrayList();

        while (!exit) {
            Scanner sn = new Scanner(System.in);
            System.out.println("1.Save Chicken data to Json file ");
            System.out.println("2.Save Chicken data to Csv file ");
            System.out.println("3.Salir");

            System.out.println("Enter a number ");
            option = sn.nextInt();

            switch (option) {
                case 1:

                    for (int i = 0; i < 2; i++) {
                        System.out.println("Enter the chicken data: ");
                        System.out.println("Enter the id: ");
                        id = data.nextInt();
                        System.out.println("Enter the name: ");
                        name = data.next();
                        System.out.println("Enter the color: ");
                        color = data.next();
                        System.out.println("Date of born");
                        System.out.println("Enter the day of the month: ");
                        int day = data.nextInt();
                        System.out.println("Enter a month: ");
                        int month = data.nextInt();
                        System.out.println("Enter a year: ");
                        int year = data.nextInt();

                        LocalDate bornOn = LocalDate.of(year, month, day); //specify year, month, date directly
                        LocalDate date = LocalDate.now(); //gets localDate
                        Period age = Period.between(bornOn, date); //difference between the dates is calculat

                        System.out.println("Enter the molting: ");
                        molting = data.nextBoolean();
                        System.out.println("Enter the eggCounter: ");
                        eggCounter = data.nextInt();
                        chickens[i] = new Chicken(id, name, color, date, bornOn, age, molting, eggCounter);
                    }
                    System.out.println("Data of all chickens entered: ");
                    for (int i = 0; i < 2; i++) {
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        jsonChicken = gson.toJson(chickens[i]);

                        Chicken chicken1;
                        chicken1 = gson.fromJson(jsonChicken, Chicken.class);

                        System.out.println("jsonChicken ->" + jsonChicken);

                        System.out.println(chickens[i].getId() + " " + chickens[i].getName() + " " + chickens[i].getColor() + " " + chickens[i].getDate() + " " + chickens[i].getBorn0n() + " " + chickens[i].getAge() + " " + chickens[i].isMolting() + " " + chickens[i].getEggCounter());
                        System.out.println("\n");
                    }

                    break;

                case 2:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter the chicken data: ");
                        System.out.println("Enter the id: ");
                        id = data.nextInt();
                        System.out.println("Enter the name: ");
                        name = data.next();
                        System.out.println("Enter the color: ");
                        color = data.next();
                        System.out.println("Date of born");
                        System.out.println("Enter the day of the month: ");
                        int day = data.nextInt();
                        System.out.println("Enter a month: ");
                        int month = data.nextInt();
                        System.out.println("Enter a year: ");
                        int year = data.nextInt();

                        LocalDate bornOn = LocalDate.of(year, month, day); //specify year, month, date directly
                        LocalDate date = LocalDate.now(); //gets localDate
                        Period age = Period.between(bornOn, date); //difference between the dates is calculat

                        System.out.println("Enter the molting: ");
                        molting = data.nextBoolean();
                        System.out.println("Enter the eggCounter: ");
                        eggCounter = data.nextInt();

                        LocalDate born0n = null;

                        chick.add(new Chicken(id, name, color, date, born0n, age, molting, eggCounter));
                        CsvWriter csvWriter = new CsvWriter("chicken.csv");

                        for (Chicken chicken : chick) {

                            String[] agedata = chicken.getArray();
                            csvWriter.writeRecord(agedata);
                        }
                        csvWriter.close();
                    }
                    break;

                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option, enter again.");

            }

        }
    }
}
                    
