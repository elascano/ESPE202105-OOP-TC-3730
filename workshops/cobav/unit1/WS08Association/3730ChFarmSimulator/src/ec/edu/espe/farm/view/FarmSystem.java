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
 * @author Victor Coba Beta Software ESPE-DCCD
 */
public class FarmSystem{
       public static void main(String[] args){
           Chicken chicken;
           //variables
           int id;
           String name;
           String color;
           Date age;
           Date bornOn;
           boolean molting;  
           int eggCounter;
           
           //todo reading
           id= 0;
           name="Lucy";
           color = "White";
           age = new Date();
           bornOn = new Date();
           molting =true ;  
           eggCounter = 0;
           
           
           
           chicken = new Chicken(id, name, color, age, bornOn, molting);
           
            System.out.println("chicken  → " + chicken);
           
     Chicken chickens[]= new Chicken[10];
           Date born0n = null;
        chicken = new Chicken(id, name, color, age, born0n, molting);
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Maruja", "black", new Date(), new Date(), false);
        chickens[2] = new Chicken(2, "Peter", "green", new Date(), new Date(), false);
        chickens[3] = new Chicken(3, "Junior", "pink", new Date(), new Date(), true);
        chickens[4] = new Chicken(4, "Fity", "brown", new Date(), new Date(), false);
        chickens[5] = new Chicken(5, "Cuca", "silver", new Date(),new Date(), false);
        chickens[6] = new Chicken(6, "Luna", "gray", new Date(), new Date(), true);
        chickens[7] = new Chicken(7, "Rocky", "yelow", new Date(), new Date(), false);
        chickens[8] = new Chicken(8, "Sam", "orange", new Date(), new Date(), false);
        chickens[9] = new Chicken(9, "Tito", "white", new Date(), new Date(), false);
        
        for (int i=0; 1<10; i++){
            
            System.out.println("chicken"+ i + "=" + chickens[i]);
        }      
           
}
 }           

            

