/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.Cow;
import ec.espe.edu.farm.model.FarmAnimal;
import ec.espe.edu.farm.model.Pig;
import ec.espe.edu.farm.model.Sheep;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class Main {
    public static void main(String[] args) {
        FarmAnimal farmAnimal = null;
        Cow cow;
        Pig pig;
        Sheep sheep;
        Date date = new Date();
        date = new Date(2009, 12, 16);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is : " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(0, "german shepherd", date);
        System.out.println("Farm Animal -> " + farmAnimal);
        farmAnimal = new Cow (0, "Name of Cow", date);
        System.out.println("Farm Animal -> " + farmAnimal);
        farmAnimal = new Pig(0, "Nmae of pig", date);
        System.out.println("Farm Animal -> " + farmAnimal);
        farmAnimal = new Sheep(0, "Name of Sheep", date);
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is : " + farmAnimal.getClass());
        
        Chicken chicken = new Chicken(1, "Lola", date , true);
        Chicken chicken2 = new Chicken(2, "Manuela", date , true);
        Chicken chicken3 = new Chicken(3, "Maria", date , true);
        
        
        Cow cow1 = new Cow(1, "Lula", date, true);
        Cow cow2 = new Cow(2, "Lula", date, true);
        Cow cow3 = new Cow(3, "Lula", date, true);
        
        
        Pig pig1 = new Pig(1, "Lula", date, true);
        Pig pig2 = new Pig(2, "Lula", date, true);
        Pig pig3 = new Pig(3, "Lula", date, true);
        
        
        Sheep sheep1 = new Sheep(1, "Lula", date, true);
        Sheep sheep2 = new Sheep(2, "Lula", date, true);
        Sheep sheep3 = new Sheep(3, "Lula", date, true);
        
        
        System.out.println("chicken is : " + chicken.getClass());
        
        System.out.println("the age is ->" + chicken.getAgeInMonths());
        farmAnimals.add(chicken);
        
        System.out.println("My farm has -> " + farmAnimals.size() + "Aniamls");
        System.out.println("My FarmAnimals are -> " + farmAnimals);
        
        
    }
    
}
