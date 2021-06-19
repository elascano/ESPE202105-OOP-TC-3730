/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class FarmSystem {
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
        
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        Calendar cal = new GregorianCalendar();
        int mesActual = cal.get(Calendar.MONTH),
                anyoActual=cal.get(Calendar.YEAR),
                diaActual = cal.get(Calendar.DAY_OF_MONTH);
        int day;
        int month;
        int year;
               
         
        Chicken chickens[]=new Chicken[10];
        System.out.println("Enter the chicken data");
        for(int counter=0;counter<1;counter++){
            
            System.out.println("Enter id");
            id=sc.nextInt();
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter day");
            day = sc.nextInt();
            System.out.println("Enter month");
            month = sc.nextInt();
            System.out.println("Enter year");
            year = sc.nextInt();
            System.out.println("Age");
            age = new Date();
            System.out.println("Enter color");
            color = sc.next(); 
            System.out.println("Enter molting");
            molting=sc.nextBoolean();
            System.out.println("Enter eggCounter");
            eggCounter=sc.nextInt();
            chickens[counter]= new Chicken(id, name,color,age, molting, eggCounter);
            
        }
       
        for(int counter=0;counter<1;counter++){
            System.out.println(chickens[counter]);
            
        
    }

}

} 
