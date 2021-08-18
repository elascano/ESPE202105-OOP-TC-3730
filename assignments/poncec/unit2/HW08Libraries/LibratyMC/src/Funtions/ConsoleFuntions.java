/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funtions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Camilo Ponce PROGRAM BUILDER ESPE-DCCO
 */
public class ConsoleFuntions {

    static Scanner imput = new Scanner(System.in);
    static int count = 0;
    static City city[] = null;
    static String jsonCity ="";

    public static void addCity(String name, String continent, String coutry, int fundationYear) throws IOException {

        System.out.println(" Number of Citys: ");
        count = imput.nextInt();
        city = new City[count];
        FileWriter file = new FileWriter("./files/City.json");

        for (int i = 0; i < count; i++) {
            System.out.print("\n Enter City name:");
            name = imput.next();
            System.out.print(" \n Enter Continent:");
            continent = imput.next();
            System.out.println("\n Enter Country:  ");
            coutry = imput.next();
            System.out.println("\n Enter Fundation Year");
            fundationYear = imput.nextInt();
           

            imput.nextLine();

            city[i] = new City(name, continent, coutry, fundationYear);
        }

        for (int i = 0; i < count; i++) {

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();

            jsonCity = gson.toJson(city[i]);

            City city1;
            city1 = gson.fromJson(jsonCity,City.class);

            jsonCity = gson.toJson(city);

        }

        try {
            file.append(jsonCity);
            file.flush();
            file.close();

        } catch (IOException e) {
        }

    }
    public static void indicate( String name, String continent, String coutry, int fundationYear ) {

         System.out.println("City");
         
         System.out.println("\n ");
          for(int i=0; i<count; i++){
          
              System.out.println(city[i].toString());
          
          }
         
         
         
     }


 public static void search(String name, String continent, String coutry, int fundationYear){
     int status =-1;
     System.out.println(" Enter age ");
     coutry= imput.next();
     status = search1(coutry);
     if(status>=0){
         System.out.println("City="+city[status].toString());
     }
     
     
                  
 
 
 }

    private static int search1(String coutry) {
       
 
        int status=-1;
        
        for(int i = 0; i <count; i++){
        
            if (city[i].getCoutry()== coutry){
                    System.out.println("City Found ");
                     status = i;
                
            }
            else{
                System.out.println("City Not Found");            }
    
        }
        return status;
        
        
    }
}

