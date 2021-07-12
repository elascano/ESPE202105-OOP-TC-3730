/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
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

        System.out.println("FarmSystem -> Bryan Chiliquinga NRC: 3730");

        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        ArrayList<Chicken> chickens = new ArrayList<>();
        Date date1 = new Date(2020, 3, 2);

        System.out.println("\nChicken");
        chicken = new Chicken(1, "Criolla", date1, true);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        System.out.println("\nchicken ->" + chicken);
        chicken = new Chicken(2, "Aguarico", date1, false);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(3, "Brahma", date1, true);
        chickens.add(chicken);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);

        System.out.println("There are " + chickens.size() + " chickens");

        System.out.println("The age of the chickens is " + chicken.getAgeInMonths(2, 3, 2020) + " months");

        ArrayList<Cow> cows = new ArrayList<>();
        Date date2 = new Date(2019, 7, 3);

        System.out.println("\nCow");
        cow = new Cow(4, "Angus", date2, true);
        cows.add(cow);
        farmAnimals.add(cow);
        System.out.println("\ncow -> " + cow);
        cow = new Cow(5, "Holstein", date2, true);
        cows.add(cow);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(6, "Hereford", date2, false);
        cows.add(cow);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);

        System.out.println("There are " + cows.size() + " cows");

        System.out.println("The age of the cows is " + cow.getAgeInMonths(3, 7, 2019) + " months");

        ArrayList<Pig> pigs = new ArrayList<>();
        Date date3 = new Date(2019, 7, 3);

        System.out.println("\nPig");
        pig = new Pig(7, "Berkshire", date3);
        pigs.add(pig);
        farmAnimals.add(pig);
        System.out.println("\npig -> " + pig);
        pig = new Pig(8, "Tamworth", date3);
        pigs.add(pig);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pigs.add(pig);
        pig = new Pig(9, "Meishan", date3);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);

        System.out.println("There are " + pigs.size() + " pigs");

        System.out.println("The age of the pigs is " + pig.getAgeInMonths(4, 4, 2020) + " months");

        ArrayList<Sheep> sheeps = new ArrayList<>();
        Date date4 = new Date(2018, 11, 4);

        System.out.println("\nSheep");
        sheep = new Sheep(10, "Merina", date4, date4);
        sheeps.add(sheep);
        farmAnimals.add(sheep);
        System.out.println("\nsheep -> " + sheep);
        sheep = new Sheep(11, "Suffolk", date4, date4);
        sheeps.add(sheep);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(12, "Texel", date4, date4);
        sheeps.add(sheep);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);

        System.out.println("There are " + sheeps.size() + " sheep");

        System.out.println("The age of the sheeps is " + sheep.getAgeInMonths(4, 11, 2018) + " months");

        System.out.println("\nMy farm has " + farmAnimals.size() + " animals");
        System.out.println("\nMy FarmAnimals are: ");
        System.out.println(farmAnimals);

    }
}
