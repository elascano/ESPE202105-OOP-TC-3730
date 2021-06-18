/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Ian Contreras LAMES ESPE-DCCO
 */
public class FarmSymulator {
    public static void main(String[] args) {
        Chicken chicken;
        int id;
        String name;
        String color;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate born = LocalDate.parse("17/06/2021", fmt);
        LocalDate now = LocalDate.now();

        Period period = Period.between(born, now);

        id = 0;
        name = "Lucy";
        color = "White";
        bornOn =new Date();
        molting = true;
        eggCounter = 0;

        chicken = new Chicken(id, name, color, bornOn, molting);
        
        System.out.printf("chicken -> " + chicken + "\nThe age of chicken 0: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        
        Chicken chickens[] = new Chicken[10];
        
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Lola", "Brown", bornOn, false);
        chickens[2] = new Chicken(2, "Mara", "Black", bornOn, false);
        chickens[3] = new Chicken(3, "Abril", "White", bornOn, false);
        chickens[4] = new Chicken(4, "Aby", "White", bornOn, false);
        chickens[5] = new Chicken(5, "Cameron", "Black", bornOn, false);
        chickens[6] = new Chicken(6, "Sandra", "Brown", bornOn, false);
        chickens[7] = new Chicken(7, "Dakota", "Black", bornOn, false);
        chickens[8] = new Chicken(8, "Lisa", "White", bornOn, false);
        chickens[9] = new Chicken(9, "Ellie", "Brown", bornOn, false);
        
        
        System.out.printf("\nchicken -> " + chickens[1] + "\nThe age of chicken 1: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("\nchicken -> " + chickens[2] + "\nThe age of chicken 2: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("\nchicken -> " + chickens[3] + "\nThe age of chicken 3: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("\nchicken -> " + chickens[4] + "\nThe age of chicken 4: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("\nchicken -> " + chickens[5] + "\nThe age of chicken 5: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("\nchicken -> " + chickens[6] + "\nThe age of chicken 6: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("\nchicken -> " + chickens[7] + "\nThe age of chicken 7: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("\nchicken -> " + chickens[8] + "\nThe age of chicken 8: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("\nchicken -> " + chickens[9] + "\nThe age of chicken 9: %s years, %s months y %s days ",
                    period.getYears(), period.getMonths(), period.getDays());
        
    }
}
