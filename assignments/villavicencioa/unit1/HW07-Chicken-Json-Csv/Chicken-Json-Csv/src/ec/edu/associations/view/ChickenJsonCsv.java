/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.associations.model.Chicken;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;



/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class ChickenJsonCsv {
    public static void main(String[] args) throws IOException {
        
        System.out.println ("Chicken-Json-Csv, \n"
            + "Alina Villavicencio \n");
        
        Scanner sc =new Scanner(System.in);
        Scanner data = new Scanner(System.in);
        Chicken chickens[]=new Chicken[10];
        ArrayList<Chicken> ch = new ArrayList();
        
        
        int id,eggCounter,month,day,year;
        String name,color;
        LocalDate bornOn,age;
        boolean molting;
        Period period;
        int file;
        
        System.out.println("Choose in wich file you want to save your data \n");
        System.out.println("1 -> Csv");
        System.out.println("2 -> Json");
        
        file = sc.nextInt();
        
        switch(file){
            case 1:
                
                      
                for(int c= 0; c < 2; c++){
            
                    System.out.println("Enter id");
                    id =sc.nextInt();
                    System.out.println("Enter name");
                    name = data.next();
                    System.out.println("Enter color");
                    color =data.next();
                    System.out.println("Born Date");
                    System.out.println("Enter day");
                    day=sc.nextInt();
                    System.out.println("Enter month");
                    month=sc.nextInt();
                    System.out.println("Enter year");
                    year=sc.nextInt();
                    bornOn = LocalDate.of(year,month,day); 
                    age = LocalDate.now(); 
                    period = Period.between(bornOn, age);
                    System.out.println(" Your age is : " + period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
                    System.out.println("Enter molting");
                    molting =sc.nextBoolean();
                    System.out.println("Enter eggCounter");
                    eggCounter =sc.nextInt();
            
                    chickens[c] = new Chicken(id, name, color, age, bornOn, molting, eggCounter,period); 
                
                    ch.add(new Chicken(id, name, color, age, bornOn, molting, eggCounter,period));
                    CsvWriter csvWriter = new CsvWriter("chickenFile.csv");
                    for (Chicken chicken : ch) {

                    String[] information = chicken.getArray();
                    csvWriter.writeRecord(information);
                    }
                    csvWriter.close();
                }
                break;
            case 2:
                for(int c= 0; c < 1; c++){
            
                    System.out.println("Enter id");
                    id =sc.nextInt();
                    System.out.println("Enter name");
                    name = data.next();
                    System.out.println("Enter color");
                    color =data.next();
                    System.out.println("Born Date");
                    System.out.println("Enter day");
                    day=sc.nextInt();
                    System.out.println("Enter month");
                    month=sc.nextInt();
                    System.out.println("Enter year");
                    year=sc.nextInt();
                    bornOn = LocalDate.of(year,month,day); 
                    age = LocalDate.now(); 
                    period = Period.between(bornOn, age);
                    System.out.println(" Your age is : " + period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
                    System.out.println("Enter molting");
                    molting =sc.nextBoolean();
                    System.out.println("Enter eggCounter");
                    eggCounter =sc.nextInt();
                    
                    chickens[c] = new Chicken(id, name, color, age, bornOn, molting, eggCounter,period); 
                       
                 }
                    for(int c= 0;c < 2;c++){
                         GsonBuilder gsonBuilder = new GsonBuilder();
                         Gson gson= gsonBuilder.create();
                         String jsonChicken = gson.toJson(chickens[c]);
                     
                         Chicken chicken;
                         chicken = gson.fromJson(jsonChicken, Chicken.class);
                         System.out.println("jsonChicken:"+jsonChicken);
                         
                         System.out.println(chickens[c].getId() + "" + chickens[c].getName() + "" + chickens[c].getColor() + "" + chickens[c].getAge() + "" + chickens[c].getBornOn() + "" + chickens[c].isMolting() + "" + chickens[c].getEggCounter()+ ""+chickens[c].getPeriod());
                     }
                break;
            default:
                    System.out.println("There is no such option");
        }
        
    }
}
