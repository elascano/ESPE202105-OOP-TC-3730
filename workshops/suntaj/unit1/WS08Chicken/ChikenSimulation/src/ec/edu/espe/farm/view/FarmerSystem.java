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
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class FarmerSystem { 
    public static void main(String[] args) {
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date born0n;
        boolean molting;
        int eggCounter;
        
        id= 0;
        name = "Lucky";
        color = "White";
        age = new Date ();
        born0n= new Date();
        molting = true;
        eggCounter = 0;
        
        chicken = new Chicken(id, name, color, age, born0n, molting);
        
        System.out.println("chicken ->"+ chicken);
        
        
        
        
        
                
        
        
        
        
        
        
        
        
    }
    
}
