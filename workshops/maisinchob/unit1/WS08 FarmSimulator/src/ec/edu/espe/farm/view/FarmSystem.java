/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.fram.model.Chicken;
import java.util.Date;



/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        System.out.println("ChFarmSimulator, \n" + "Bryan Maisincho");
        Chicken chicken;
        int id; 
        String name; 
        String color; 
        Date age;
        Date bornOn ; 
        boolean molting; 
        int eggCounter;
        
       //Todo reading from keyboard
        id = 0;
        name = "Lucy";
        color = "White";
        age =  new Date();
        bornOn = new  Date();
        molting = true;
        eggCounter = 0;
        
        
        
        
        
       
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chicken ->" + chicken);
       
    }
}