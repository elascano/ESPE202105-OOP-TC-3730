/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
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
        
        System.out.println("HW06 - Farm Simulator, \n"
                        + "Pamela Yugsi");
        
        id=read.nextInt();
        System.out.println("Enter the ID: ");
        
        name=read.next();
        System.out.println("Enter Name: ");
        
        color=read.next();        
        System.out.println("Enter Color: ");
        
        molting=read.nextBoolean();
        System.out.println("Enter Molting: ");
        
        EggCounter=read.nextInt();
        System.out.println("Enter Egg Counter: ");
        
        birth=read.nextInt();
        System.out.println("Enter Date of Birth: ");

        chicken = new Chicken(id, name, color, age, molting); 
        System.out.println("chicken -> " + chicken);
        
        System.out.println("");
        }
    }
}
