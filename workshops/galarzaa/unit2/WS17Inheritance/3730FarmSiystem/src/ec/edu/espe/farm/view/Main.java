/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.util.Date;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Main {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new FarmAnimal(0,"german shep",date);
        System.out.println("Farm Animal -" + farmAnimal);
        date = new Date(2021, 1 , 20);
        
        System.out.println("Farm Animal is a -" + farmAnimal.getClass());
        
        farmAnimal = new Chicken(1,"Criolla", date, true);
        System.out.println("Farm Animal -" + farmAnimal);
        
        System.out.println("Farm Animal is a -" + farmAnimal.getClass());
        
        Chicken chicken = new Chicken(2, "aguarico", date, true);
        System.out.println("Chicken -" + chicken);
        
        System.out.println("Chicken is a -" + chicken.getClass());
        System.out.println("this age is -" + chicken.getAgeInMonths());
    }
  
}
