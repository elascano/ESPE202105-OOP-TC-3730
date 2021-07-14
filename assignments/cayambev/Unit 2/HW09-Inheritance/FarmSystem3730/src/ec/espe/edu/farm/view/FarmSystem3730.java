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
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class FarmSystem3730 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FarmAnimal farmAnimal;
       Date date = new Date();
       farmAnimal = new FarmAnimal(0, "german shepherd", date);
        System.out.println("Farm Animal --> "+ farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(1, "Criolla", date, true);
        System.out.println("Farm Animal-->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        System.out.println("FarmAnimal is a"+ farmAnimal.getClass());
        
        Chicken chicken = new Chicken(2, "Aguarico", date, true);
        System.out.println("Chicken-->"+ chicken);
        
        System.out.println("chicken is a " + chicken.getClass());
        System.out.println(" the age is"+ chicken.getAgeInMonths());
        
        farmAnimals.add(chicken);
        
        System.out.println("My farm has -->"+ farmAnimals.size()+"animals");
        System.out.println("My FarmAnimals are -->"+ farmAnimals);
        
        Pig pig;
        ArrayList<Pig> pigs = new ArrayList<>();
        date = new Date(2021, 7, 2);

        pig = new Pig("Ham-Juris", 1, "Duroc", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig("Ham-Leñador", 2, "Berkshire", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig("Ham-Megamaxi", 3, "Large Black", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
         System.out.println("The age of the pigs are -> "
                + pig.getAgeInMonths() + " months");
        
        Cow cow;
         ArrayList<Cow> cows = new ArrayList<>();
        date = new Date(2021, 5, 11);

        cow = new Cow("Nutri", 1, "Angus", date);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow("Vita", 2, "Holstein", date);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow("Entera", 3, "Simmental", date);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        System.out.println("The age of the cows are -> "
                + cow.getAgeInMonths() + " months");
        
        Sheep sheep;
         ArrayList<Sheep> sheeps = new ArrayList<>();
        date = new Date(2021, 4, 20);

        sheep = new Sheep("merino", 1, "Suffolk", date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep("cashmere", 2, "texel", date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep("alpaca", 3, "ouessant", date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
         System.out.println("The age of the sheeps are -> "
                + sheep.getAgeInMonths() + " months");
         
    }
}
