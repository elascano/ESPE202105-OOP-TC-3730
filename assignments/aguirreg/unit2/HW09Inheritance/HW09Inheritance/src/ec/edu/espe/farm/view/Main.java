/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.Ewe;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new FarmAnimal(0, "breed", 0, 0, 0);
        
        
        System.out.println("WLCOME TO FARM PROGRAM " + "Author: Gabriel Aguirre");
        System.out.println("\n");
         
        ArrayList<FarmAnimal> farmAnimals;
        farmAnimals = new ArrayList <>(); 
        farmAnimals.add(farmAnimal);

        
        
        ArrayList<FarmAnimal> chickens;
        chickens = new ArrayList <>();
        chickens.add(farmAnimal);
        
        Chicken chicken1 = new Chicken(1, "Criollo", 3, 4, 2021, true);
        System.out.println("Chicken 1 -> " + chicken1);

        
        System.out.println("Chicken is a -> " + chicken1.getClass());
        System.out.println("The age is -> " + chicken1.getAgeInMonths());
        
        
        Chicken chicken2 = new Chicken(2, "Carioco", 5, 6, 2021, true);
        System.out.println("Chicken 2 -> " + chicken2);
        
        
        System.out.println("Chicken is a -> " + chicken2.getClass());
        System.out.println("The age is -> " + chicken2.getAgeInMonths());
        
        Chicken chicken3 = new Chicken(3, "Menorca", 3, 7, 2021, true);
        System.out.println("Chicken 3 -> " + chicken3);
        
        
        System.out.println("Chicken is a -> " + chicken3.getClass());
        System.out.println("The age is -> " + chicken3.getAgeInMonths());
        
        
        farmAnimals.add(chicken1);
        farmAnimals.add(chicken2);
        farmAnimals.add(chicken3);
        
        chickens.add(chicken1);
        chickens.add(chicken2);
        chickens.add(chicken3);
        
        
        
        System.out.println("\n");
        
        
        
        ArrayList<FarmAnimal> cows;
        cows = new ArrayList <>();
        cows.add(farmAnimal);
        
        Cow cow1 = new Cow(1, "Hereford", 2, 5, 2021, true);
        System.out.println("Cow 1 -> " + cow1);
        
        
        System.out.println("Cow is a -> " + cow1.getClass());
        System.out.println("The age is -> " + cow1.getAgeInMonths());
        
        
        Cow cow2 = new Cow(2,"Hereford", 4, 7, 2021, true);
        System.out.println("Cow 2 -> " + cow2);
        
        System.out.println("Cow is a -> " + cow2.getClass());
        System.out.println("The age is -> " + cow2.getAgeInMonths());
        
        
        Cow cow3 = new Cow(3,"Hereford", 5, 6, 2021, true);
        System.out.println("Cow 3 -> " + cow3);
        
        System.out.println("Cow is a -> " + cow3.getClass());
        System.out.println("The age is -> " + cow3.getAgeInMonths());
        
        farmAnimals.add(cow1);
        farmAnimals.add(cow2);
        farmAnimals.add(cow3);
        
        cows.add(cow1);
        cows.add(cow2);
        cows.add(cow3);
        

        
        System.out.println("\n");
        
        
        
        
        ArrayList<FarmAnimal> pigs;
        pigs = new ArrayList <>();
        pigs.add(farmAnimal);
        
        Pig pig1 = new Pig(0, "Pietrain", 3, 4, 2021);
        System.out.println("Pig 1 -> " + pig1);
        
        System.out.println("Pig is a -> " + pig1.getClass());
        System.out.println("The age is -> " + pig1.getAgeInMonths());
        
        
        Pig pig2 = new Pig(2, "Mulefoot", 4, 5, 2021);
        System.out.println("Pig 2 -> " + pig2);
        
        System.out.println("Pig is a -> " + pig2.getClass());
        System.out.println("The age is -> " + pig2.getAgeInMonths());
        
        Pig pig3 = new Pig(3, "Pietrain", 8, 3, 2021);
        System.out.println("Pig 3 -> " + pig3);
        
        System.out.println("Pig is a -> " + pig3.getClass());
        System.out.println("The age is -> " + pig3.getAgeInMonths());
        
        farmAnimals.add(pig1);
        farmAnimals.add(pig2);
        farmAnimals.add(pig3);
        
        pigs.add(pig1);
        pigs.add(pig2);
        pigs.add(pig3);
        
        System.out.println("\n");
        
        
        
        ArrayList<FarmAnimal> sheep;
        sheep = new ArrayList <>();
        sheep.add(farmAnimal);
        
        Ewe sheep1 = new Ewe(1, "Dorper", 3, 4, 2021, date);
        System.out.println("Ewe 1 -> " + sheep1);
        
        System.out.println("Ewe is a -> " + sheep1.getClass());
        System.out.println("The age is -> " + sheep1.getAgeInMonths());
        
        Ewe sheep2 = new Ewe(2, "Suffolk", 6, 4, 2021, date);
        System.out.println("Ewe 2 -> " + sheep2);
        
        System.out.println("Ewe is a -> " + sheep2.getClass());
        System.out.println("The age is -> " + sheep2.getAgeInMonths());
        
        
        Ewe sheep3 = new Ewe(3, "Merina",3 ,9, 2021, date);
        System.out.println("Ewe 3 -> " + sheep3);
        
        System.out.println("Ewe is a -> " + sheep3.getClass());
        System.out.println("The age is -> " + sheep3.getAgeInMonths());
        
        farmAnimals.add(sheep1);
        farmAnimals.add(sheep2);
        farmAnimals.add(sheep3);
        
        sheep.add(sheep1);
        sheep.add(sheep2);
        sheep.add(sheep3);
        
        System.out.println("LIST OF PIGS ->" + pigs);
        
        System.out.println("\n");
        
        
        System.out.println("LIST OF COWS -> " + cows);
        
        System.out.println("\n");
        
        System.out.println("LIST OF CHICKENS ->" + chickens);
        
        System.out.println("\n");
        
        System.out.println("LIST OF SHEEP -> " + sheep);
        
        System.out.println("\n");

        System.out.println("LIST OF ANIMALS -> " + farmAnimals);
    }
    
}
