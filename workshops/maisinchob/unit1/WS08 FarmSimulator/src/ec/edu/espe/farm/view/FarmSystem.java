/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;


import ec.edu.espe.fram.model.Chicken;
import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        System.out.println("ChFarmSimulator, \n" + "Bryan Maisincho");
        Chicken chicken;
        Scanner data = new Scanner(System.in);
       
        Date age = new Date(16/06/2021);
        Date bornOn = new Date();
        //Date anonacimiento = new Date(); 
                
                
       Chicken chickens[] = new Chicken[10];
       for(int counter = 0 ; counter < 10; counter++){
           System.out.println("id: ");
           int id = data.nextInt();
           System.out.println(" name: ");
           String name = data.next();
           System.out.println("color: ");
           String color = data.next();
           System.out.println("molting: ");
           
           String molting = data.next();
           System.out.println("Egg Counter: ");
           int eggCounter = data.nextInt();
           System.out.println("Ano nacimiento");
           int anonacimiento = data.nextInt();
            int anona = 2021;
           
           anonacimiento = anonacimiento - anona;
           chicken = new Chicken (id, name, color, age, bornOn, true);
           System.out.println("chicken ->" + chicken);
       }
       
       
     
        
       
    }
}
