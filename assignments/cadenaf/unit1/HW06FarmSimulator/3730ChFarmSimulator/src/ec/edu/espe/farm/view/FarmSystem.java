/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class FarmSystem {
    public static void main(String[] args) {
        //Variables
            Chicken chicken;
            int id;
            String name;
            String color;
            Date age;
            Date bornOn;
            boolean molting;
            int eggCounter;
            
        // Todo reading from keyboard    
            id = 0;
            name = "Lucy";
            color = "While";
            age = new Date();
            bornOn = new Date();
            molting = true;
            eggCounter = 0;
            
            chicken = new Chicken(id, name, color, age, bornOn, molting);
            
            System.out.println("chicken ->" + chicken);
            
            chicken = new Chicken(id, name, color, age, bornOn, molting);
           
        
            Chicken chickens[] = new Chicken [10] ;
            chickens[0] = chicken;
            chickens[1] = new Chicken(1,"Maruja","green",age,bornOn, false); 
            chickens[2] = new Chicken(2,"Plor","yellow",age,bornOn, false); 
            chickens[3] = new Chicken(3,"Sol","light blue",age,bornOn, false); 
            chickens[4] = new Chicken(4,"Florinda","blue",age,bornOn, false); 
            chickens[5] = new Chicken(5,"Nieves","golden",age,bornOn, false); 
            chickens[6] = new Chicken(6,"Ana","silver",age,bornOn, false); 
            chickens[7] = new Chicken(7,"Federica","brown",age,bornOn, false); 
            chickens[8] = new Chicken(8,"Patricia","black",age,bornOn, false); 
            chickens[9] = new Chicken(9,"Lorenza","purple",age,bornOn, false); 
            
            System.out.println("chicken ->" + chicken);
            System.out.println("chicken ->" + chickens[1]);
            System.out.println("chicken ->" + chickens[2]);
            System.out.println("chicken ->" + chickens[3]);
            System.out.println("chicken ->" + chickens[4]);
            System.out.println("chicken ->" + chickens[5]);
            System.out.println("chicken ->" + chickens[6]);
            System.out.println("chicken ->" + chickens[7]);
            System.out.println("chicken ->" + chickens[8]);
            System.out.println("chicken ->" + chickens[9]);
    }
}