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
       
        @SuppressWarnings("MismatchedReadAndWriteOfArray")
        Chicken chikens[]= new Chicken[10];
        
        chikens[0] = chicken;
        chikens[1] = new Chicken(1, "Maruja", "black", age, born0n, false);
    }
}
    

  
