/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Main {
    public static void main(String[] args) {
        FarmAnimal farmAnimal = null;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        Date date = new Date();
        
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        ArrayList<Chicken> chickens = new ArrayList<>();
        date = new Date(2021, 10, 16);
        chicken = new Chicken(1, "Criolla", date, true);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        chicken = new Chicken(2, "Aguario", date, true);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        chicken = new Chicken(3, "Colorada", date, false);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        
        ArrayList<Cow> cows = new ArrayList<>(); 
        date = new Date(2021,8,10);
        cow = new Cow(true, 1, "Angus", date);
        cows.add(cow);
        farmAnimals.add(cow);
        cow = new Cow(false, 2, "Holstein", date);
        cows.add(cow);
        farmAnimals.add(cow);
        cow = new Cow(true, 3, "Hereford", date);
        cows.add(cow);
        farmAnimals.add(cow);
        
        ArrayList<Pig> pigs = new ArrayList<>();
        date = new Date(2021,2,12);
        pig = new Pig(1, "Duroc", date);
        pigs.add(pig);
        farmAnimals.add(pig);
        pig = new Pig(2, "Berkshire", date);
        pigs.add(pig);
        farmAnimals.add(pig);
        pig = new Pig(3, "Large Black", date);
        farmAnimals.add(pig);
        pigs.add(pig);
        
        ArrayList<Sheep> sheeps = new ArrayList<>();
        date = new Date(2021,7,16);
        sheep = new Sheep(date, 1, "Dorper", date);
        sheeps.add(sheep);
        farmAnimals.add(sheep);
        sheep = new Sheep(date, 1, "Merina", date);
        sheeps.add(sheep);
        farmAnimals.add(sheep);
        sheep = new Sheep(date, 1, "Priangan", date);
        sheeps.add(sheep);
        farmAnimals.add(sheep);

        System.out.println("My farm has → " + chickens.size() + " chickens");
        System.out.println("The age of the chickens are -> " + chicken.getAgeInMonths() + " months");     
        System.out.println("My farm has → " + cows.size() + " cows");
        System.out.println("The age of the cows are -> " + cow.getAgeInMonths() + " months");
        System.out.println("My farm has → " + pigs.size() + " pigs");
        System.out.println("The age of the pigs are -> " + pig.getAgeInMonths() + " months");
        System.out.println("My farm has → " + sheeps.size() + " sheeps");
        System.out.println("My farm has → " + farmAnimals.size() + " animals");
        System.out.println("The age of the sheeps are -> " + sheep.getAgeInMonths() + " months");
        System.out.println("\n\t\t\t🐔🐑🐔🐑   FARM   🐔🐑🐔🐑");
        System.out.println("My farm animals are:");
        System.out.println("•Chickens "+chickens);
        System.out.println("•Cows "+cows);
        System.out.println("•Pigs "+pigs);
        System.out.println("•Sheeps "+sheeps);
            
    }
    
}
