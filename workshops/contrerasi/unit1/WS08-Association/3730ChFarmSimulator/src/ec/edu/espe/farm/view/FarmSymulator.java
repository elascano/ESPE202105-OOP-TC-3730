/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ian Contreras LAMES ESPE-DCCO
 */
public class FarmSymulator {
    public static void main(String[] args) {
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        ArrayList<Chicken> chickens = new ArrayList<>();
        Chicken chickensArray[] = new Chicken[5];
        String jsonChicken = "";
        
        //TODO reading from keyboard
        
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;

        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chicken -> " + chicken);
        
        jsonChicken = "(\"id\":\"1\")";
        System.out.println("chicken Json -> " + jsonChicken);
        
 //       String json = "";
 //       json = "{\n" 
 //               + "  \"args\": {\n" 
 //               + "    \"age\": \"3\", \n" 
 //               + "    \"color\": \"brown\", \n" 
 //               + "    \"id\": \"8\", \n" 
 //               + "    \"molting\": \"true\", \n" 
 //               + "    \"name\": \"Lisa\"\n" 
 //               + "  }, \n" 
 //               + "  \"headers\": {\n" 
 //               + "    \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\", \n" 
 //               + "    \"Accept-Encoding\": \"gzip, deflate, br\", \n" 
 //               + "    \"Accept-Language\": \"es-419,es-ES;q=0.9,es;q=0.8\", \n" 
 //               + "    \"Host\": \"httpbin.org\", \n" 
 //               + "    \"Sec-Fetch-Dest\": \"document\", \n" 
 //               + "    \"Sec-Fetch-Mode\": \"navigate\", \n" 
 //               + "    \"Sec-Fetch-Site\": \"cross-site\", \n" 
 //               + "    \"Sec-Fetch-User\": \"?1\", \n" 
 //               + "    \"Upgrade-Insecure-Requests\": \"1\", \n" 
 //               + "    \"User-Agent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.128 Safari/537.36 OPR/75.0.3969.285\", \n" 
 //               + "    \"X-Amzn-Trace-Id\": \"Root=1-60cd58c0-314c4c9a0140bb2232abb381\"\n" 
 //               + "  }, \n" 
 //               + "  \"origin\": \"157.100.172.205\", \n" 
 //               + "  \"url\": \"https://httpbin.org/get?id=8&name=Lisa&color=brown&age=3&molting=true\"\n" 
 //               + "}";
 //       
 //       System.out.println("json " + json);
        
        
    }    
}
