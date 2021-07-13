/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;


import ec.edu.espe.farm.model.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class FarmSystem09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal  ;
        Date date = new Date();
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        date = new Date(2021, 8, 15);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList <>();

        System.out.println("HW09");
         System.out.println("Mosquera Kerly");
        
        ArrayList<Chicken> chickens = new ArrayList <>();
        date = new Date(2021, 4, 15);
        chicken = new Chicken(0,"Criolla", date, true);
        farmAnimals.add(chicken);
        System.out.println("Chicken -> "+ chicken);
        chicken = new Chicken(1,"Plymounth Rock", date, true);
        farmAnimals.add(chicken);
        System.out.println("Chicken -> "+ chicken);
        chicken = new Chicken(2,"Orpington", date, true);
        farmAnimals.add(chicken);
        System.out.println("Chicken -> "+ chicken);
        System.out.println("The age of the Chicken is " + chicken.getAgeInMonths() +" mounth");
        
        ArrayList<Cow> cows = new ArrayList <>();
        date = new Date(2021, 5, 15);
        cow = new Cow(0,"Hereford", date, true);
        farmAnimals.add(cow);
        System.out.println("Cow -> " + cow);
        cow = new Cow(1,"Angus", date, true);
        farmAnimals.add(cow);
        System.out.println("Cow -> " + cow);
        cow = new Cow(2,"Holstein", date, true);
        farmAnimals.add(cow);
        System.out.println("Cow -> " + cow);
        System.out.println("The age of the Cow is " + cow.getAgeInMonths() +" mounth");
       
        ArrayList<Pig> pigs = new ArrayList <>();
        date = new Date(2021, 2, 15);
        pig = new Pig(0, "Duroc", date);
        farmAnimals.add(pig);
        System.out.println(" Pig -> "+ pig);
        pig = new Pig(1, "Large white", date);
        farmAnimals.add(pig);
        System.out.println(" Pig -> "+ pig);
        pig = new Pig(2, "Hampshire", date);
        farmAnimals.add(pig);
        System.out.println(" Pig -> "+ pig);
        System.out.println("The age of the pig is " + pig.getAgeInMonths() +" mounth");
        
        ArrayList<Sheep> sheeps = new ArrayList <>();
        date = new Date(2021, 1, 15);
        sheep = new Sheep(0, "Dorper", date, date);
        farmAnimals.add(sheep );
        System.out.println(" Sheep -> "+ sheep);
        sheep  = new Sheep(1, "Suffolk", date, date);
        farmAnimals.add(sheep );
        System.out.println(" Sheep -> "+ sheep);
        sheep  = new Sheep(2, "Merina", date, date);
        farmAnimals.add(sheep );
        System.out.println(" Sheep -> "+ sheep);
        System.out.println("The age of the Sheep is " + sheep.getAgeInMonths()+" mounth");
        
        System.out.println("My farm has -> "+ farmAnimals.size() + "animals");
        System.out.println("My FarmAnimals are -> "+ farmAnimals);
        
    }   
}
