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
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        Date date = new Date();
        date = new Date(2021, 10, 16);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        ArrayList<Chicken> chickens = new ArrayList<>();

        chicken = new Chicken(1, "Criolla", date, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(2, "Aguarico", date, false);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(3, "Menorca", date, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);

        ArrayList<Cow> cows = new ArrayList<>();
        date = new Date(2021, 8, 16);

        cow = new Cow(1, "Guzerat", date, true);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(2, "Brangus", date, true);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(3, "Bradford", date, false);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);

        ArrayList<Pig> pigs = new ArrayList<>();
        date = new Date(2021, 3, 16);

        pig = new Pig(1, "Duroc", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig(2, "Hampshire", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig(3, "Poland", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);

        ArrayList<Sheep> sheeps = new ArrayList<>();
        date = new Date(2021, 7, 16);

        sheep = new Sheep(1, "Suffolk", date, date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(2, "Dorper", date, date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(3, "Priangan", date, date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);

        System.out.println("The age of the chickens are -> "
                + chicken.getAgeInMonths() + " months");
        System.out.println("The age of the cows are -> "
                + cow.getAgeInMonths() + " months");
        System.out.println("The age of the pigs are -> "
                + pig.getAgeInMonths() + " months");
        System.out.println("The age of the sheeps are -> "
                + sheep.getAgeInMonths() + " months");

        System.out.println("My farm has -> " + farmAnimals.size() + " animals");
        System.out.println("My FarmAnimals are -> " + farmAnimals);

    }

}
