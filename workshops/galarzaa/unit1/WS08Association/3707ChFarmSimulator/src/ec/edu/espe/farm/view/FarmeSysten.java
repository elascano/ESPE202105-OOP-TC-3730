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
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class FarmeSysten {
    public static void main(String[] args) {
        Chicken chicken;
        int id;
        String name;
        String color ;
        Date age;
        Date bornOn;
        boolean molthing;
        int eggCounter;
       
        id = 0;
        name = "Lucy";
        color = "while";
        age = new Date();
        bornOn = new Date();
        molthing =true;
        eggCounter=0;
        
        
        chicken = new Chicken(id, name, color, age, bornOn, molthing);
        System.out.println("Chicken ->"+chicken);
    }
 
}
