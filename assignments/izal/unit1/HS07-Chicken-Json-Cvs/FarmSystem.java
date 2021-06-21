
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

//import java.util.ArrayList;
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
     String filepath = "cake.txt";
     /*ArrayList<Chicken> chickens = new ArrayList<>();
     Chicken chickensArray[] = new Chicken[5];
     String jsonChicken = "";*/
     
     id = 0;
     name = "   ";
     color = "    ";
     age = new Date();
     bornOn = new Date();
     molting = true;
     eggCounter =0;
       
     /*ArrayList<Chicken> chickens = new ArrayList();
      
      chickens.add(new Chicken(1,"Lurena","black",2));
      chickens.add(new Chicken(2,"Blanca","White",3));
      chickens.add(new Chicken(3,"Flor","yellow",4));
      
      CvsWrite csvWrite = new CsvWrite("files.csv");
      
      for(Chicken chicken: chickens){
         String[] datas = chicken.getArray();
         csvWriter.writeRecord(datas);
 
      }
      
      cvsWrite.close();*/
      
     ///////////////////////////////////////////////////////////////////////
     
      //research of calculte date 
      
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate born = LocalDate.parse("30/08/2000", fmt);
        LocalDate now = LocalDate.now();

        Period period = Period.between(born,now);
 
     
        Scanner entry = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("------Enter date from keyboard-------");
            
            for(int i=1;i<10;i++){
            System.out.println("*****************************" + i);
            System.out.println("What is name of Chicken?:        ");
            name = entry.nextLine();
            
            System.out.println("What is color of the Chicken?:   ");
            color = entry.nextLine();
            
            System.out.println("What is age of the Chicken?:     ");
          
            System.out.println("What is Date of the Chicken?:    ");
            
            System.out.println("*********************************");

            System.out.println(" name the chicken->" + name);
            System.out.println(" color the chicken->" + color);
            System.out.println("chicken :  " + period.getYears());
            System.out.println("chicken :  " + period.getMonths());
            System.out.println("chicken :  " + period.getDays());
            System.out.println("*********************************");
            
        }
              
   
      /////////////////////////////////////////////////////////////////////  
      
      
      
            
            //System.out.println("molting" + molting );
           
            /*Chicken chicken = new Chicken();
            System.out.println("chicken" + chicken);*/
     
            Chicken chicken = new Chicken (id, name, color, age, bornOn, molting);
            System.out.println("chicken ->" + chicken);
        
           /* Chicken chicken2 = new Chicken(2, "Lola", "Black", new Date(), false);
            System.out.println("chicken2 ->" + chicken2);
        
            chickens.add(chicken);
            chickens.add(chicken2);
        
            System.out.println("chickens ->" + chickens);
        
            chickensArray[0] = chicken;
        
            System.out.println("chickensArray ->" + chickensArray[0]);
            
            jsonChicken = "{\"id\":\"1\"}";
            
            System.out.println("chicken->" + jsonChicken);
        
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
          }*/
        
           /*String json = "";
           json = "{\n" +
                  "  \"args\": {\n" +
                  "    \"\": \"\", \n" +
                  "    \"age\": \"2\", \n" +
                  "    \"color\": \" Brown\", \n" +
                  "    \"id\": \"01\", \n" +
                  "    \"molting\": \"true\", \n" +
                  "    \"name\": \"Clari\"\n" +
                  "  }, \n" +
                  "  \"headers\": {\n" +
         //      "    \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/
           //*;q=0.8,application/signed-exchange;v=b3;q=0.9\", \n" +
             /*     "    \"Accept-Encoding\": \"gzip, deflate, br\", \n" +
                  "    \"Accept-Language\": \"es-ES,es;q=0.9\", \n" +
                  "    \"Host\": \"httpbin.org\", \n" +
                  "    \"Sec-Ch-Ua\": \"\\\" Not A;Brand\\\";v=\\\"99\\\", \\\"Chromium\\\";v=\\\"90\\\", \\\"Google Chrome\\\";v=\\\"90\\\"\", \n" +
                  "    \"Sec-Ch-Ua-Mobile\": \"?0\", \n" +
                  "    \"Sec-Fetch-Dest\": \"document\", \n" +
                  "    \"Sec-Fetch-Mode\": \"navigate\", \n" +
                  "    \"Sec-Fetch-Site\": \"none\", \n" +
                  "    \"Sec-Fetch-User\": \"?1\", \n" +
                  "    \"Upgrade-Insecure-Requests\": \"1\", \n" +
                  "    \"User-Agent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36\", \n" +
                  "    \"X-Amzn-Trace-Id\": \"Root=1-60cd34e8-3a59a2214bd67af85152653e\"\n" +
                  "  }, \n" +
                  "  \"origin\": \"190.152.236.136\", \n" +
                  "  \"url\": \"https://httpbin.org/get?=&id=01&name=Clari&color= Brown&molting=true&age=2\"\n" +
                  "}"; */
        
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
      
        String jsonChicken = gson.toJson(chicken);
    
        System.out.println("jsonCkicken ->" + jsonChicken);
        
        
        jsonChicken = gson.toJson(chicken);
        System.out.println("jsonCkicken ->" + jsonChicken);
    }
    
}