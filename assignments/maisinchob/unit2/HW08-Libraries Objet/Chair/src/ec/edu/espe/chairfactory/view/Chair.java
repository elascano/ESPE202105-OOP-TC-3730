/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chairfactory.view;
import com.google.gson.Gson;
//import ec.edu.espe.chairsFactory.ChairFactory;
import ec.edu.espe.Filemanager.utils.FileManager;


import ec.edu.espe.chairfactory.ChairFactory;

import java.util.Scanner;
import ec.edu.espe.chairfactory.ChairData;


//import java.io.FileWriter;
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Chair {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
  Scanner input = new Scanner(System.in);
        System.out.println("welcome, how many chairs do you want to save?");
        int  counter = input.nextInt();
        
        for (int i = 0; 1< counter;i++){
            System.out.println("chair specifications");
            Gson gson = new Gson();
            System.out.println("Enter what composition does it take");
            String composition = input.next();
            System.out.println("Enter the type of design you wear");
            String design = input.next();
            System.out.println("Enter the color of the chair");
            String color = input.next();
            System.out.println("Enter the type of support you have");
            String support = input.next();
            System.out.println("enter the number of people capacity that the chair supports");
            int bearingCapacity = input.nextInt();
            
            ChairData chairdata = new ChairData(color, color, i, color);
            String ChairFactoryDataJson = gson.toJson(chairdata);
            
            FileManager.save("./files/Chair.json",ChairFactoryDataJson);
            
            System.out.println(chairdata);
            
        }
                        
            
            
        
            
           
        
        
    }
       
       
       
       
       
      
            
            
        
            
           
    }
     

 