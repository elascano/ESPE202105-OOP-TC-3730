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
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;

        System.out.println("FarmSystem -> Cuaspa Eliana ");

        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        ArrayList<Chicken> chickens = new ArrayList<>();
        Date date1 = new Date(2020, 3, 2);

        System.out.println("\nChicken");
        chicken = new Chicken(1, "\nCriolla", date1, true);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        System.out.println("\nChicken ->" + chicken);
        chicken = new Chicken(2, "Aguarico", date1, false);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        System.out.println("Chicken ->" + chicken);
        chicken = new Chicken(3, "Araucana", date1, true);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        System.out.println("Chicken ->" + chicken);

        System.out.println("There are " + chickens.size() + " Chickens");

        System.out.println("The age of the Chickens is " + chicken.getAgeInMonths(10, 1, 2019) + " Months");

        ArrayList<Cow> cows = new ArrayList<>();
        Date date2 = new Date(2019, 7, 3);

        System.out.println("\nCow");
        cow = new Cow(4, "Jersey", date2, true);
        cows.add(cow);
        farmAnimals.add(cow);
        System.out.println("\nCow -> " + cow);
        cow = new Cow(5, "Simmental", date2, true);
        cows.add(cow);
        farmAnimals.add(cow);
        System.out.println("Cow -> " + cow);
        cow = new Cow(6, "Holstein", date2, false);
        cows.add(cow);
        farmAnimals.add(cow);
        System.out.println("Cow -> " + cow);

        System.out.println("There are " + cows.size() + " cows");

        System.out.println("The age of the cows is " + cow.getAgeInMonths(11, 2, 2019) + " months");

        ArrayList<Pig> pigs = new ArrayList<>();
        Date date3 = new Date(2019, 7, 3);

        System.out.println("\nPig");
        pig = new Pig(7, "Duroc", date3);
        pigs.add(pig);
        farmAnimals.add(pig);
        System.out.println("\nPig -> " + pig);
        pig = new Pig(8, "Landrace", date3);
        pigs.add(pig);
        farmAnimals.add(pig);
        System.out.println("Pig -> " + pig);
        pigs.add(pig);
        pig = new Pig(9, "Yorkshire", date3);
        farmAnimals.add(pig);
        System.out.println("Pig -> " + pig);

        System.out.println("There are " + pigs.size() + " pigs");

        System.out.println("The age of the pigs is " + pig.getAgeInMonths(13, 3, 2019) + " months");

        ArrayList<Sheep> sheeps = new ArrayList<>();
        Date date4 = new Date(2018, 11, 4);

        System.out.println("\nSheep");
        sheep = new Sheep(10, "Sarda", date4, date4);
        sheeps.add(sheep);
        farmAnimals.add(sheep);
        System.out.println("\nSheep -> " + sheep);
        sheep = new Sheep(11, "Lacaune", date4, date4);
        sheeps.add(sheep);
        farmAnimals.add(sheep);
        System.out.println("Sheep -> " + sheep);
        sheep = new Sheep(12, "Churra", date4, date4);
        sheeps.add(sheep);
        farmAnimals.add(sheep);
        System.out.println("Sheep -> " + sheep);

        System.out.println("There are " + sheeps.size() + " Sheep");

        System.out.println("The age of the sheeps is " + sheep.getAgeInMonths(14, 3, 2019) + " months");

        System.out.println("\nMy farm has " + farmAnimals.size() + " animals");
        System.out.println("\nMy FarmAnimals are: ");
        System.out.println(farmAnimals);

    }
    
    
}
