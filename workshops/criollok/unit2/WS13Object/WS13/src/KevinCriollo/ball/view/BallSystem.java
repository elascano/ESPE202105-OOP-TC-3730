/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinCriollo.ball.view;

import KevinCriollo.ball.model.Ball;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class BallSystem {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args )throws FileNotFoundException, IOException, ParseException {
        Scanner entry = new Scanner (System.in);
        
        String sport;
        int size;
        String mark;
        String color;
        String material;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonBall;
        String fichero = "";
        
            System.out.println("\nEnter the sport:");
            sport = entry.next(); 
            System.out.println("\nEnter the size:");
            size = entry.nextInt();
            System.out.println("\nEnter the mark:");
            mark = entry.next(); 
            System.out.println("\nEnter the color:");
            color = entry.next();
            System.out.println("\nEnter the material:");
            material = entry.next();  
             
            Ball ball = new Ball(sport, size, mark, color, material );
            
            System.out.println("\n WS13 Kevin Criollo " );
            System.out.println("\nThe characteristics of your ball: " + ball );
            
           jsonBall = gson.toJson(ball);
           
           System.out.println(jsonBall); 
           System.out.println("\nJsonInformation ball: " + jsonBall);
           
          try{
			FileWriter file = new FileWriter("C:/Users/Kevin/Desktop/OPP 2/WS13/nivek.json");
			file.write(ball.toJSONString());
			file.flush();
			file.close();
                        
		}catch(Exception e){
		}
		finally{
			System.out.print("\n"+ball);
		} 
          try (Writer writer = new FileWriter("C:/Users/Kevin/Desktop/OPP 2/WS13/nivek.json")) {
            gson.toJson(ball, writer);
             }  
   }         
}
