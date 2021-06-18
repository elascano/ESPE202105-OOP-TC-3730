/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;
import java.util.Date;
import ec.edu.espe.farm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemFarm {
    public static void main(String[] args ){
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
        
        System.out.println("HW06 - FarmSimulator, \n"
                        + "Jennifer Beltran");
        
        System.out.println("Enter chick Id: ");
        id=read.nextInt();
        
        System.out.println("Enter the chick's Name: ");
        name=read.next();
        
        System.out.println("Enter the chick's Color: ");
        color=read.next();
        
        System.out.println("Enter molting: ");
        molting=read.nextBoolean();
        
        System.out.println("Enter egg counter: ");
        EggCounter=read.nextInt();
        
        System.out.println("Enter date of birth: ");
        birth=read.nextInt();

        chicken = new Chicken(id, name, color, age, molting); 
        
        System.out.println("chicken -> " + chicken);
        
      
        System.out.println("");
        }
        
    }

 
}
