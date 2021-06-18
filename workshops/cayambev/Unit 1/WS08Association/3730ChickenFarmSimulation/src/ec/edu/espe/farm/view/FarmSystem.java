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
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args){
        Chicken chicken;
        // reading from keyboard
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        id=0;
        name ="Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter =0;
 
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chicken ->"+ chicken);
        
        Chicken chickens[] = new Chicken[10];
        
        chickens[0] = chicken;
        chickens [1] = new Chicken(1, "Maruja", "black", age, bornOn, false);
        chickens [2] = new Chicken(2, "Maria", "white", age, bornOn, false);
        chickens [3] = new Chicken(3, "Manuela", "red", age, bornOn, false);
        chickens [4] = new Chicken(4, "Josefa", "gray", age, bornOn, false);
        chickens [5] = new Chicken(5, "Daniela", "black", age, bornOn, false);
        chickens [6] = new Chicken(6, "Cristina", "black", age, bornOn, false);
        chickens [7] = new Chicken(7, "Valeria", "black", age, bornOn, false);
        chickens [8] = new Chicken(8, "Narcisa", "black", age, bornOn, false);
        chickens [9] = new Chicken(9, "Roberta", "black", age, bornOn, false);
        chickens [10] = new Chicken(10,"Camila", "black", age, bornOn, false);
    }
}
