/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.*;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class FarmSystem {
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int id;
        String name;
        String color; 
        boolean molting;
        int eggCounter;
        int day;
        int year;
        int month;
        Calendar cal = new GregorianCalendar();
        int actualMonth = cal.get(Calendar.MONTH), actualYear = cal.get(Calendar.YEAR), actualDay;
        actualDay = cal.get(Calendar.DAY_OF_MONTH);
        int resultDay;
        int resultMonth;
        int resultYear;
        
        Chicken chickens[]=new Chicken[10];
        BornOn bornOn[]= new BornOn[10];
        Age age[]= new Age[10];
        System.out.println("Enter the chicken data");
        for(int counter=0;counter<1;counter++){
            
            System.out.println("Enter id");
            id=sc.nextInt();
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter color");
            color = sc.next(); 
            System.out.println("Enter day");
            day = sc.nextInt();
            System.out.println("Enter month");
            month = sc.nextInt();
            System.out.println("Enter year");
            year = sc.nextInt();          
            System.out.println("Enter molting");
            molting=sc.nextBoolean();
            System.out.println("Enter eggCounter");
            eggCounter=sc.nextInt();
            System.out.println("Enter next chicken data");
            chickens[counter]= new Chicken(id, name, color, molting, eggCounter);
            bornOn[counter] = new BornOn(day, month, year);
            resultMonth = Math.abs(month-actualMonth);
            resultDay = Math.abs(day-actualDay);
            resultYear = Math.abs(year-actualYear);
            age[counter]=new Age (resultDay, resultMonth, resultYear);
            
        }
            
       
        for(int counter=0;counter<1;counter++){
            System.out.println(chickens[counter]);  
            System.out.println(bornOn[counter]);
            System.out.println(age[counter]);
        }

} 
}
