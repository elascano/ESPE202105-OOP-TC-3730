/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        //TODO reading from keyboard
        Scanner entrada = new Scanner(System.in);
        Chicken chicken;
        int id; 
        String name; 
        String color; 
        Date age; 
        Date bornOn; 
        boolean molthing;
        int eggCounter; 
        String jsonChicken = "";
        
        //TODO reading from keyboard 
        
        id = 0;
        name = "Lucy";
        color = "white";
        age = new Date();
        bornOn = new Date();
        molthing = true;
        eggCounter = 0;
        
//      Calendar cal = new GregorianCalendar();
//      int mesActual = cal.get(Calendar.MONTH), anoActual = cal.get(Calendar.YEAR),
//              diaActual = cal.get(Calendar.DAY_OF_MONTH);
//      int mes, dia, ano;
//      int mesResultado, diaResultado, anoResultado;
//      System.out.print("Tell me the day: ");
//      dia = entrada.nextInt();
//      System.out.print("Tell me the month: ");
//      mes = entrada.nextInt();
//      System.out.print("Tell me the year: ");
//      ano = entrada.nextInt();
        
//      mesResultado = Math.abs(mes - mesActual);
//      diaResultado = Math.abs(dia - diaActual);
//      anoResultado = Math.abs(ano - anoActual);
        
//      System.out.println("Chickens have " + anoResultado + " years " + mesResultado + " months " + " and " + diaResultado + " days.");
        
        chicken = new Chicken(id, name, color, age, bornOn, molthing);
        
        System.out.println("Chicken -> " + chicken);
        
//      Chicken chickens[] = new Chicken[10];
        
//      chickens[0] = chicken;
//      chickens[1] = new Chicken(1, "Maruja", "black", age, bornOn, false);
//      chickens[2] = new Chicken(2, "Veronica", "orange", age, bornOn, true);
//      chickens[3] = new Chicken(3, "Camila", "red", age, bornOn, false);
//      chickens[4] = new Chicken(4, "Bellota", "white", age, bornOn, true);
//      chickens[5] = new Chicken(5, "Alisson", "rose", age, bornOn, false);
//      chickens[6] = new Chicken(6, "Melanie", "blue", age, bornOn, true);
//      chickens[7] = new Chicken(7, "Alexandra", "yellow", age, bornOn, false);
//      chickens[8] = new Chicken(8, "Andrea", "green", age, bornOn, true);
//      chickens[9] = new Chicken(9, "Martha", "purple", age, bornOn, false);

//  for(Chicken i: chickens){
//          System.out.println("Chicken -> "+ i);
//  }
    
    //{"id":"1","name":"2"}
   
    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    
    //Serealizacion
    jsonChicken = gson.toJson(chicken);
    System.out.println("jsonChicken -> " + jsonChicken);
    
    //deserealizacion
    Chicken chicken2;
    chicken2 = gson.fromJson(jsonChicken,Chicken.class);
    
    System.out.println("Chicken object name -> " + chicken2.getName());
 
  }
}