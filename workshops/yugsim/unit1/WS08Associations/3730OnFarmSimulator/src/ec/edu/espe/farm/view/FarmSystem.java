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
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
<<<<<<< HEAD
        Chicken chicken;
        //reading from keyboard
=======
        //variables
        Chicken chicken;
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
<<<<<<< HEAD
=======
        //TODO reading from keyboard
        
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
<<<<<<< HEAD
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        
        System.out.println("WS08 - Associations, \n" + "Pamela Yugsi");
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("ckicken -> " + chicken);
=======
        bornOn = new Date ();
        molting = true;
        eggCounter = 0;
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("WS08 - Associations, \n" + "Pamela Yugsi");
        
        System.out.println("chicken -> " + chicken);
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
        
        Chicken chickens[] = new Chicken[10];
        
        chickens[0] = chicken;
<<<<<<< HEAD
        chickens[1] = new Chicken(1, "Maruja", "blank", age, bornOn, false);
=======
        chickens[1] = new Chicken(1, "Estrella", "brown", age, bornOn, false);
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
    }
}
