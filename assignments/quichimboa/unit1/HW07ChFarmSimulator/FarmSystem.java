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
 * @author Andrea Quichimbo Builder Program ESPE-DCCO
 */
public class FarmSystem {
    

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("ChFarmSimulator, \n"
        + "Andrea Quichimbo");
        Chicken chiken;
        //TODO reading from keyboard
        int id;
        String name;  
        String color; 
        Date age; 
        Date born0n; 
        boolean molting; 
        int eggCounter; 
        
        id = 0;
        name = "Lucy";
        color = "white";
        age = new Date();
        born0n = new Date();
        molting =true;
        eggCounter = 0;
        
        Chicken chicken = new Chicken(id, name, color, age, born0n, molting);
        System.out.println("chicken ->" + chicken);
       
        
         
     
        Chicken chickens[]= new Chicken[10];
        chicken = new Chicken(id, name, color, age, born0n, molting);
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Maruja", "black", new Date(), new Date(), false);
        chickens[2] = new Chicken(2, "Chloc", "gray", new Date(), new Date(), false);
        chickens[3] = new Chicken(3, "Harper", "blue", new Date(), new Date(), false);
        chickens[4] = new Chicken(4, "Avery", "green", new Date(), new Date(), true);
        chickens[5] = new Chicken(5, "Ellie", "pink", new Date(),new Date(), false);
        chickens[6] = new Chicken(6, "Luke", "red", new Date(), new Date(), true);
        chickens[7] = new Chicken(7, "Jack", "purple", new Date(), new Date(), true);
        chickens[8] = new Chicken(8, "Ryan", "yellow", new Date(), new Date(), false);
        chickens[9] = new Chicken(9, "Jeremiah", "orange", new Date(), new Date(), true);
        
        for (int i=0; 1<10; i++){
            
            System.out.println("chicken"+ i + "=" + chickens[i]);
        }
    }
}
    

  
