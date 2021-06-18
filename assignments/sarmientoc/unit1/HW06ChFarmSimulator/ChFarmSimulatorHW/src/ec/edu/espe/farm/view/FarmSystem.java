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
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        //reading from keyboard
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        id = 0;
        name = "Lucy";
        color = "white";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        
        
        Chicken[] chickens = new Chicken[10];
       
       
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Maruja", "black",age,bornOn,false);
        chickens[2] = new Chicken(2, "Paola", "black",age,bornOn,true);
        chickens[3] = new Chicken(3, "Juana", "white",age,bornOn,false);
        chickens[4] = new Chicken(4, "Melissa", "white",age,bornOn,true);
        chickens[5] = new Chicken(5, "Andrea", "black",age,bornOn,false);
        chickens[6] = new Chicken(6, "Daniela", "white",age,bornOn,false);
        chickens[7] = new Chicken(7, "Marisol", "black",age,bornOn,true);
        chickens[8] = new Chicken(8, "Nicole", "black",age,bornOn,true);
        chickens[9] = new Chicken(9, "Celine", "white",age,bornOn,false);
        
        
        
        for(int i=0;i<10;i++){
            System.out.println(chickens[i]);
            
        }
        
        
    }
    
}