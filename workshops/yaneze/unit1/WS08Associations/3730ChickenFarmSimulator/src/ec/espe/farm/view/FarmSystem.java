/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.farm.view;

import ec.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        
        int id = 0;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        //reading from keyboard
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        System.out.println("chicken->" + chicken);
    }
}
