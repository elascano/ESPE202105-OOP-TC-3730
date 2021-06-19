/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import ec.edu.associations.model.Chicken;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class FarmSimulator {
    public static void main(String[] args) {
        
        System.out.println ("FarmSimulatorHW05, \n"
            + "Alina Villavicencio");
        
        Scanner sc =new Scanner(System.in);
        Scanner data =new Scanner(System.in);
        Calendar cal=new GregorianCalendar();
        Chicken chicken[]=new Chicken[10];
        
        int id;
        String name;
        String color;
        Date age = new Date(); 
        Date bornOn = new Date(); 
        boolean molting;
        int eggCounter; 
        int month,day,year;
        int remonth,reday,reyear;
        
        
        
         for(int i=0; i<10;i++){
             
             System.out.println("Enter id");
             id =sc.nextInt();
             System.out.println("Enter name");
             name = data.next();
             System.out.println("Enter color");
             color =data.next();
             System.out.println("Age");
             int currentMonth= cal.get(Calendar.MONTH),currentYear=cal.get(Calendar.YEAR),currentDay=cal.get(Calendar.DAY_OF_MONTH);
             System.out.println("Enter day");
             day=sc.nextInt();
             System.out.println("Enter month");
             month=sc.nextInt();
             System.out.println("Enter year");
             year=sc.nextInt();
             remonth =Math.abs(month- currentMonth);
             reday= currentDay;
             reyear= Math.abs(year-currentYear);
             System.out.println("Age= Have "+reyear+" years "+", "+remonth+"months"+" and "+reday+" days ");
             
             System.out.println("Born Date");
             System.out.println("Enter the day of the month:");
             day = data.nextInt();
             System.out.println("Enter molting");
             molting =sc.nextBoolean();
             System.out.println("Enter eggCounter");
             eggCounter =sc.nextInt();
             
            chicken[i]=new Chicken(id, name,color,age,bornOn,molting,eggCounter);
         }
        for(int i=0; i<10;i++) {
            System.out.println(chicken[i]);
           
        }
        
    }
}
