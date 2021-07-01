/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tv.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.tv.model.TV;
import java.util.Scanner;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class DisplayTV {
    public static void main(String[] args) {
        
        String color; 
        int size; 
        String brand; 
        int price;
        String softwareType;
        String jsonTV = "";

                       
        Scanner enter = new Scanner (System.in);
         
        
        TV tv [] = new TV[4];

       
 
        
        System.out.print("Hi, your use the DisplayTV:    " + "Programmer: Cristopher Sarmiento ");
        
        for(int i=0;i<1;i++){
            
            System.out.print("\n Especifications: \n");
            System.out.println("\n This program define caracteristics from TV's ");
            
            
            System.out.print("Write Color Tv:");
            color = enter.next();
            
            System.out.print("Write Size Tv:");
            size = enter.nextInt();
            
            System.out.print("Write Brand Tv:");
            brand = enter.next();
            
            System.out.print("Write Price Tv: ");
            price = enter.nextInt();
   
            
            System.out.print("Write SoftwareType Tv:");
            softwareType = enter.next();
            
     
            enter.nextLine();
            
            tv[i] = new TV(color, size, brand, price, softwareType);
           



        }
        
        for(int i=0;i<1;i++){
            
           System.out.println("\n");
            
           System.out.println("Characteristics about all TV's:");
           
           System.out.println("\n");
       
           System.out.println("\n" + tv[i]);
          

               
           System.out.println("\n");
           System.out.println("Information Json Serialization:");
             
             
          GsonBuilder gsonBuilder = new  GsonBuilder();
          Gson gson = gsonBuilder.create();
          jsonTV = gson.toJson(tv[i]);
          
          
       
           System.out.println("JsonTV ->" + jsonTV);
    
  
         
        
        }
    }
}
           