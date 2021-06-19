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
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[] args){
        Chicken chicken;
        //TODO reading from keyboard
        int id; 
        String name; 
        String color; 
        Date age; 
        Date bornOn;
        boolean molting; 
        int eggCounter; 
        
        id =0;
        name = "Lucy";
        color = "white";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        
        
        
    chicken = new Chicken(id, name, color, age, bornOn, molting);
    
        System.out.println("chicken ->"+chicken);   
        Chicken chickens []= new Chicken [10];
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Pepita", "yellow", age, bornOn, false);
        chickens[2] = new Chicken(2, "Juanita", "black", age, bornOn, false);
        chickens[3] = new Chicken(3, "Estrellita", "blue", age, bornOn, false);
        chickens[4] = new Chicken(4, "Lunita", "purple", age, bornOn, false);
        chickens[5] = new Chicken(5, "Tina", "red", age, bornOn, false);
        chickens[6] = new Chicken(6, "Coco", "green", age, bornOn, false);
        chickens[7] = new Chicken(7, "Chio", "pink", age, bornOn, false);
        chickens[8] = new Chicken(8, "Perlita", "brown", age, bornOn, false);
        chickens[9] = new Chicken(9, "Velita", "orange", age, bornOn, false);
        
        
        for (Chicken chicken1 : chickens) {
            System.out.println(chicken1);
        }
        
    }
    
}
