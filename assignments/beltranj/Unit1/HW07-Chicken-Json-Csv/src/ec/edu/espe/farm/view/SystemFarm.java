/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Date;
import ec.edu.espe.farm.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemFarm {
   public static void main(String[] args) throws ParseException, IOException {
       
        Chicken chicken;
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

        System.out.println("Welcome Farm Simulator");
        
        System.out.println("Enter the id of chicken: ");
        id = read.nextInt();
        
        System.out.println("Enter the name of chicken: ");
        name = read.next();
        
        System.out.println("Enter color of chicken: ");
        color = read.next();
        
        System.out.println("Enter age of chicken: ");
        age = read.nextInt();
        
        System.out.println("Enter bornOn of chicken: ");
        dateBorn = read.next();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        bornOn = sdf.parse(dateBorn);
        System.out.println("Enter the molting of chicken: ");
        System.out.println("(1) True ");
        System.out.println(" (2) False ");
        
        moltingOp = read.nextInt();
        if (moltingOp == 1) {
            molting = true;
        } else {
            molting = false;
        }
        System.out.println("Enter the eggCounter of chicken: ");
        eggCounter = read.nextInt();
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println(" Save Jason (1)");
        System.out.println(" Save CSV (2)");
        System.out.println("Choose the option: ");
        optionMenu = read.nextInt();
        switch (optionMenu) {
            case 1:
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonChicken = gson.toJson(chicken);
                try {
            try (FileWriter file = new FileWriter("./files/Farm.json")) {
                file.write(jsonChicken);
                file.flush();
            }

                } catch (IOException e) {
                    
                }
                break;
            case 2:
                try {
            try (FileWriter file = new FileWriter("./files/Farm.csv")) {
                file.append(chicken.toString());
                file.append("\n");
                file.flush();
            }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default: System.out.println(" Error");
              
        }
        System.out.println("HW07- Chicken-Gson-CSV , \n"
                        + "Jennifer Beltran");
    }
        
    }

 

