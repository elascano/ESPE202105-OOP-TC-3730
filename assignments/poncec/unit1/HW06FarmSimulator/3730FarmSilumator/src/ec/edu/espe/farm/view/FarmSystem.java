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
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class FarmSystem 
{

    public static void main(String[] args) {
        
        Chicken chicken;
    
        int id;
        String name;
        String color;
        Date age;
        boolean Ismolting; 
        Date born;
        int eggCounter;
        
        
         id =0;
         name= "Lucy";
         color="White";
         age=new Date();
         Ismolting= false; 
         born= new Date();
         eggCounter=0;
        
        chicken = new Chicken(id, name, color, age, Ismolting, born);
        
        System.out.println("chiken= " +chicken);
        
        Chicken chickens[] = new Chicken[10];
        
        chickens[0]=chicken;
        chickens[1]=new Chicken(1,"Maruja" ,"Brown" , new Date(), false, new Date());
        chickens[2]=new Chicken(1,"Piolin" ,"Orange" , new Date(), true, new Date());
        chickens[3]=new Chicken(1,"Granada" ,"Yellow" , new Date(), true, new Date());
        chickens[4]=new Chicken(1,"Lucy" ,"White" , new Date(), false, new Date());
        chickens[5]=new Chicken(1,"Star" ,"Brown" , new Date(), true, new Date());        
        chickens[6]=new Chicken(1,"Pio" ,"Black" , new Date(), false, new Date());    
        chickens[7]=new Chicken(1,"Muñeca" ,"Orange" , new Date(), true, new Date());
        chickens[8]=new Chicken(1,"Austin" ,"Red" , new Date(), false, new Date());
        chickens[9]=new Chicken(1,"Pepita" ,"Yellow" , new Date(), false, new Date()); 
  
        for (int i=0;i<10;i++){
            
        System.out.println("chickens"+"="+ chickens[i]);
        
        
        }
    }
}
