/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args, Chicken[] chickensArray) {
        Chicken chicken = null;
        //reading from keyboard
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        String jsonChicken="";
        //TODO reading from keyboard
        
         id =0;
         name="Lucy";
         color="White";
         age= new Date();
         bornOn= new Date();
         molting = true;
         eggCounter =0;
        
   
         chicken = new Chicken(id, name, color, age, bornOn, molting);
        
         System.out.println("ChFarmSimulator \n Mosquera Kerly");
         
         System.out.println("chicken  → " + chicken);
         Chicken chickens[] =new Chicken[10]; 
        
        Date born0n = null;
        
        chicken = new Chicken(id, name, color, age, born0n, molting);
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Maruja", "blue", new Date(), new Date(), false);
        chickens[2] = new Chicken(2, "Calimero", "yellow", new Date(), new Date(), false);
        chickens[3] = new Chicken(3, "Piolín", "black", new Date(), new Date(), true);
        chickens[4] = new Chicken(4, "Toto", "silver", new Date(), new Date(), true);
        chickens[5] = new Chicken(5, "Hugo", "black", new Date(),new Date(), false);
        chickens[6] = new Chicken(6, "Condorito", "gray", new Date(), new Date(), true);
        chickens[7] = new Chicken(7, "Pucky", "pumpkin", new Date(), new Date(), true);
        chickens[8] = new Chicken(8, "Cleo", "tangerine", new Date(), new Date(), false);
        chickens[9] = new Chicken(9, "Pía", "cream", new Date(), new Date(), true);
       
        for (int i=0; 1<10; i++){
            
            System.out.println("chicken"+ i + "=" + chickens[i]);
       
            
         chickensArray[0]=chicken;   
         System.out.println("chickenArray "+ chickensArray[0]);   
         
         GsonBuild gsonbuild = new GsonBuild();
         Gson gson = gsonBuild.create();
            }
    }
 }