/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.fram.model.Chicken;
import java.util.Date;




/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        //variables
        System.out.println("ChFarmSimulator, \n" + "Bryan Maisincho");
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        String jsonChicken = "";
        
        /*json = "{\n" +
"  \"args\": {\n" +
"    \"age\": \"3\", \n" +
"    \"color\": \"black\", \n" +
"    \"id\": \"1\", \n" +
"    \"molting\": \"True\", \n" +
"    \"name\": \"Julia\"\n" +
"  }, \n" +
"  \"headers\": {\n" +
\\"    \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*//*;q=0.8,*//*application/signed-exchange;v=b3;q=0.9\", \n" +/*
/*"    \"Accept-Encoding\": \"gzip, deflate\", \n" +
"    \"Accept-Language\": \"es-MX,es-ES;q=0.9,es-419;q=0.8,es;q=0.7\", \n" +
"    \"Host\": \"httpbin.org\", \n" +
"    \"Upgrade-Insecure-Requests\": \"1\", \n" +
"    \"User-Agent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36\", \n" +
"    \"X-Amzn-Trace-Id\": \"Root=1-60cd7450-2b8ef54a096ecf510fa48058\"\n" +
"  }, \n" +
"  \"origin\": \"45.236.107.99\", \n" +
"  \"url\": \"http://httpbin.org/get?id=1&name=Julia&color=black&age=3&molting=True\"\n" +
"}";
     
        System.out.println("json" + json);        
*/
//TODO reading form keyboard
       id = 0;
       name = "Lucy";
       color = "White";
        age = new Date();
        bornOn = new Date();
      
           
           
           chicken = new Chicken (id, name, color, age, bornOn, true);
           System.out.println("chicken ->" + chicken);
           GsonBuilder gsonBuilder = new GsonBuilder(); 
           Gson gson = gsonBuilder.create();
           
           jsonChicken = gson.toJson(chicken);
              System.out.println("jsonChicken ->" + jsonChicken);     
       }
       
       
     
        
       
    }

