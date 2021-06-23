/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Born;
import ec.edu.espe.farm.model.Chicken1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class FarmsSystem {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Chicken1 chicken;
        Born born;
        //reading from keyboard
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        
        Chicken1 [] chickens=new Chicken1[2];
        Born [] bornOn1=new Born[2];
        
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
            System.out.println("\n Enter the born on: ");
            System.out.println("\n Day: ");
            int day=read.nextInt();
            System.out.println("\n Month: ");
            int month=read.nextInt();
            System.out.println("\n Year: ");
            int year=read.nextInt();
            int año=2021-year;
            age = new Date();
            bornOn = new Date();
            chicken = new Chicken1(id,name,color,age,bornOn,molting);
            chickens[i]= chicken;
            born= new Born(day,month,year,año);
            bornOn1[i]= born;
            
            
            //System.out.println("chicken ->" + chicken);
        
        }
        for (int j=1; j<=2; j++){
            
            System.out.println("chicken"+ j + "=" + chickens[j]);
            System.out.println("BorOn "+ j + "=" + bornOn1[j]);
            
            
        }
    }
            
    
}
