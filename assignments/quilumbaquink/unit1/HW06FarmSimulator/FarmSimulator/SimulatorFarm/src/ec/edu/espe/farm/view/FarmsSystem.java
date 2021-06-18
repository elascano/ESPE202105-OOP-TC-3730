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
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class FarmsSystem {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Chicken chicken;
        //reading from keyboard
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        
        Chicken [] chickens=new Chicken[10];
        
        for(int i=0;i<chickens.length;i++){
            System.out.print("Chicken[%d] "+ i);
            System.out.println("\n Enter the id: ");
            id=read.nextInt();
            System.out.println("\n Hen's name: ");
            name=read.next();
            System.out.println("\n Hen color: ");
            color=read.next();
            System.out.println("\n Enter the molting: ");
            molting=read.nextBoolean();
            System.out.println("\n How many eggs does the hen lay: ");
            eggCounter=read.nextInt();
            age = new Date();
            bornOn = new Date();
            chicken = new Chicken(id,name,color,age,bornOn,molting);
            chickens[i]= chicken;
            //System.out.println("chicken ->" + chicken);
        
        }
        for (int j=0; j<10; j++){
            
            System.out.println("chicken"+ j + "=" + chickens[j]);
        }
    }
            
    
}
