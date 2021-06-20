/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        
        int id; 
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chicken ->"+ chicken);
        
        Chicken chickens[] = new Chicken[10];
        Chicken[] Chickens = null;
        
        Chickens[4] = chicken;
        Chickens[1] = new Chicken(1, "lola", "black", age, bornOn, false);
        
        
        
       
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse("24/06/2021", fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("chicken age: %s years, %s months y %s days",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
        
        //CLASS DATE
        //  String Jason = "";
       // String jason = "{\n" +
               // "  \"args\": {}, \n" +
               // "  \"headers\": {\n" +
                //"    \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\", \n" +
                //"    \"Accept-Encoding\": \"gzip, deflate, br\", \n" +
                //"    \"Accept-Language\": \"es-ES,es;q=0.9\", \n" +
                //"    \"Host\": \"httpbin.org\", \n" +
                //"    \"Sec-Ch-Ua\": \"\\\" Not;A Brand\\\";v=\\\"99\\\", \\\"Google Chrome\\\";v=\\\"91\\\", \\\"Chromium\\\";v=\\\"91\\\"\", \n" +
                //"    \"Sec-Ch-Ua-Mobile\": \"?0\", \n" +
                //"    \"Sec-Fetch-Dest\": \"document\", \n" +
                //"    \"Sec-Fetch-Mode\": \"navigate\", \n" +
                //"    \"Sec-Fetch-Site\": \"cross-site\", \n" +
                //"    \"Sec-Fetch-User\": \"?1\", \n" +
                //"    \"Upgrade-Insecure-Requests\": \"1\", \n" +
                //"    \"User-Agent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36\", \n" +
                //"    \"X-Amzn-Trace-Id\": \"Root=1-60cd3a93-3fbac13b541a163f1e7543c8\"\n" +
                //"  }, \n" +
                //"  \"origin\": \"181.39.208.252\", \n" +
                //"  \"url\": \"https://httpbin.org/get\"\n" +
                //"}";
                //
                //System.out.println("Jason"+ jason);
        
          GsonBuilder gsonbuilder= new GsonBuilder();
        Gson gson = gsonBuilder.create();
                
      
        
        
        
         Scanner entry = new Scanner(System.in);
        char[] chickens;
        chickens = new char [3];
        
        for(int i=0;i<10;i++){
              System.out.println("Name Chicken");
              chickens[i] = entry.next().charAt(0);
          }
          
          System.out.println("The name chickens are:");
            for(int i=0;i<10;i++){
                System.out.println(chickens[i]);
            }
       
            
        
    }
}
