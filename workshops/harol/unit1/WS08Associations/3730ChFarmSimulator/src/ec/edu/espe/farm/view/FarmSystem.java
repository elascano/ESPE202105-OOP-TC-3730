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
 * @author Luis Haro LAMESTech ESPE-DCD
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        
        int id;
        String name; 
        String color; 
        Date age; 
        boolean molting; 
        int eggCounter;
        
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
        molting = true;
        eggCounter = 0;
        Date bornon = null;
        
        chicken = new Chicken(id, name, color, age, bornon, molting);
        
        System.out.println("chicken ->"+chicken);
        
        Chicken chickens[] = new Chicken[10];
        
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Maruja", "black", age, bornon, false);

        }
        
        
        
        
    }
}
