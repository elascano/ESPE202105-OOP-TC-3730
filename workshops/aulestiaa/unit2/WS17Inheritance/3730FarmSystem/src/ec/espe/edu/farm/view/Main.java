/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class Main {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new FarmAnimal(0,"german shepard", date);
        
        System.out.println("Farm Animal ->"+ farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        
        System.out.println("farmanimal is a"+ farmAnimal.getClass());
        
        farmAnimal = new Chicken(1,"Criolla", date, true);
        System.out.println("farm Animal -> " + farmAnimal);
        
        Chicken chicken = new Chicken(2, "aguarico", date, true);
        System.out.println("chicken->"+ chicken);
        
        System.out.println("farmAnimal is a "+ chicken.getClass());
        System.out.println("the age is ->" +chicken.getAgeInMonths);
        
        farmAnimals.add(chicken);
        System.out.println("My farm has -> "+ farmAnimals.size()+"animals");
        System.out.println("My FarmAnimals are ->"+ farmAnimals);
    }
}
