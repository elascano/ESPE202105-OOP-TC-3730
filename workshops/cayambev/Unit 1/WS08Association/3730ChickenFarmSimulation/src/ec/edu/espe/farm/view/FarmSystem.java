/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args){
        Chicken chicken;
<<<<<<< HEAD
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
    }
=======
        Chicken chciken[] = new Chicken[10];
        Scanner read = new Scanner(System.in);
        Date age = new Date();
        
        for(int counter=0; counter<10; counter ++){
                    
        int id;
        String name;
        String color;
        Date bornon;
        boolean molting;
        int EggCounter;
        int birth;
        
        System.out.println("Write name: ");
        name=read.next();
        System.out.println("Write color: ");
        color=read.next();
        System.out.println("Write id: ");
        id=read.nextInt();
        System.out.println("Write Date of birth: ");
        birth=read.nextInt();
        System.out.println("Write Egg counter: ");
        EggCounter=read.nextInt();
        System.out.println("Write molting: ");
        molting=read.nextBoolean();

        chicken = new Chicken(id, name, color, age, molting); 
        System.out.println("chicken -> " + chicken);
        System.out.println("Homework Vanessa Cayambe");
    }
  
  }
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
}
