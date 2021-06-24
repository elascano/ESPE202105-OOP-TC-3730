/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

<<<<<<< HEAD
=======

>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
import ec.espe.edu.farm.model.Chicken;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[] args) {
<<<<<<< HEAD
        Chicken chicken;
=======
        
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
       
        age = new Date();
        bornOn = new Date();
        
      
        Scanner data=new Scanner(System.in);
        
        Chicken chickens[] = new Chicken[10];
        for(int chickenCounter = 0; chickenCounter < 10; chickenCounter++){
            System.out.println("Enter the id: ");
            id = data.nextInt();
            System.out.println("Enter the nameÑ ");
            name = data.next();
            System.out.println("Enter the color: ");
            color = data.next();
            System.out.println("Enter the molting: ");
            molting = data.nextBoolean();
            System.out.println("Enter the eggCounter: ");
            eggCounter = data.nextInt();
<<<<<<< HEAD
            chicken = new Chicken(id, name, color, age, bornOn, molting);
            System.out.println("Chicken[" + (chickenCounter) + "]" + chicken);
        }
    }
 
}
=======
            Chicken chicken = new Chicken(id, name, color, age, bornOn, molting);
            System.out.println("Chicken[" + (chickenCounter) + "]" + chicken);
    }   }   
}
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
