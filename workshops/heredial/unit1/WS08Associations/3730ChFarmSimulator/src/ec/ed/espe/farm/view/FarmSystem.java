/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ed.espe.farm.view;


import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        
        //varibles
        int id; 
        String name; 
        String color; 
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
             
                 
         id = 0;
         name = "Lucky";
         color = "Withe";
         age = new Date();
         bornOn = new Date();
         molting = true;
         eggCounter = 0;
        
               
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chiken->" + chicken);
        
    }
    

    
}
