/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;
import ec.edu.espe.model.Chicken;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class FarmSystem {
     public static void main(String[] args) {
        Chicken chicken;
        //TODO reading from keyboard
     Date age =new Date();
     Date bornOn= new Date();
       
           Chicken chickens[] = new Chicken[10];
        Scanner read= new Scanner(System.in);
        for(int counter=0; counter<10; counter ++){
            int id;
            String name;
            String color;
            boolean molting;
            int eggCounter;
            int today;
            int birth;
            //int age;
            
            System.out.println("Introduce Id");
            id=read.nextInt();
            System.out.println("Introduce Name");
            name=read.next();
            System.out.println("Introduce color");
            color=read.next();
          
            System.out.println("Introduce Molting");
            molting=read.nextBoolean();
            System.out.println("Introduce Egg Counter");
            eggCounter = read.nextInt();
            
            chicken = new Chicken(id, name, color, age , bornOn, molting);   
            System.out.println("chicken ->"+ chicken);
            System.out.println("");
             
        }
          
    }
}
