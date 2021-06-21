/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LILIAN IZA TOUR GUEST OPP-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
      
     int id;
     String name;
     String color; 
     Date age;
     Date bornOn;
     boolean molting;
     int eggCounter;
     
     id = 0;
     name = "Clarita";
     color = "Black";
     age = new Date();
     bornOn = new Date();
     molting = true;
     eggCounter =0;
    
        Chicken chicken;
        chicken = new Chicken (id, name, color, age, bornOn, molting);
        System.out.println("chicken ->" + chicken);
        
        
        chicken = new Chicken (id, name, color, age, bornOn, molting);
        System.out.println("chickens ->" + chicken);
        
        Scanner entry = new Scanner(System.in);
        char[] chickens;
        chickens = new char [10];
        
        
        System.out.println("-------");
          for(int i=0;i<2;i++){
              System.out.println("Name Chicken");
              chickens[i] = entry.next().charAt(0);
          }
          
          System.out.println("The name chickens are:");
           for(int i=0;i<2;i++){
               System.out.println("  "+ chickens[i]);
           }
        
  //   String json = "";
    // json = "{\n" +
//"  \"args\": {\n" +
//"    \"\": \"\", \n" +
//"    \"age\": \"2\", \n" +
//"    \"color\": \" Brown\", \n" +
//"    \"id\": \"01\", \n" +
//"    \"molting\": \"true\", \n" +
//"    \"name\": \"Clari\"\n" +
//"  }, \n" +
//"  \"headers\": {\n" +
//"    \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\", \n" +
//"    \"Accept-Encoding\": \"gzip, deflate, br\", \n" +
//"    \"Accept-Language\": \"es-ES,es;q=0.9\", \n" +
//"    \"Host\": \"httpbin.org\", \n" +
//"    \"Sec-Ch-Ua\": \"\\\" Not A;Brand\\\";v=\\\"99\\\", \\\"Chromium\\\";v=\\\"90\\\", \\\"Google Chrome\\\";v=\\\"90\\\"\", \n" +
//"    \"Sec-Ch-Ua-Mobile\": \"?0\", \n" +
//"    \"Sec-Fetch-Dest\": \"document\", \n" +
//"    \"Sec-Fetch-Mode\": \"navigate\", \n" +
//"    \"Sec-Fetch-Site\": \"none\", \n" +
//"    \"Sec-Fetch-User\": \"?1\", \n" +
//"    \"Upgrade-Insecure-Requests\": \"1\", \n" +
//"    \"User-Agent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36\", \n" +
//"    \"X-Amzn-Trace-Id\": \"Root=1-60cd34e8-3a59a2214bd67af85152653e\"\n" +
//"  }, \n" +
//"  \"origin\": \"190.152.236.136\", \n" +
//"  \"url\": \"https://httpbin.org/get?=&id=01&name=Clari&color= Brown&molting=true&age=2\"\n" +
//"}";
        
        
     GsonBuilder gsonBuilder = new GsonBuilder();
     Gson gson = gsonBuilder.create();
     
        String jsonChicken;
        
        jsonChicken = gson.toJson(chicken);
    
        System.out.println("jsonCkicken ->" + jsonChicken);
        
        
        jsonChicken = gson.toJson(chicken);
        System.out.println("jsonCkicken ->" + jsonChicken);
        
 }    
}