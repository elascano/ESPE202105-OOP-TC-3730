/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.Cow;
import ec.espe.edu.farm.model.FarmAnimal;
import ec.espe.edu.farm.model.Horse;
import ec.espe.edu.farm.model.Pig;
import ec.espe.edu.farm.model.Sheep;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;

        Date date = new Date();
        farmAnimal = new FarmAnimal(0, "german shepherd", date);
       

        System.out.println("FarmAnimal: " + farmAnimal);

        date = new Date(2021, 1, 20);

        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Cow> cows = new ArrayList<>();
        ArrayList<Horse> horses = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();
        ArrayList<Sheep> sheeps = new ArrayList<>();
        farmAnimals.add(farmAnimal);

        /*
        farmAnimal = new Chicken(1, "Criolla", date, true);
        System.out.println("farm Animal is a -> " + farmAnimal);
        System.out.println("farm Animal is a -> " + farmAnimal.getClass());
        farmAnimals.add(farmAnimal);*/
        System.out.println("-----------------------Chickens----------------------\n");
        //chicken1
        Date bornOnChicken1 = new Date(119, 5, 12);
        Chicken firstChicken = new Chicken(1, "ponedora", bornOnChicken1, true, 6, "Good", true);
        System.out.println("Chicken -> " + firstChicken);
        /*System.out.println("chicken is a " + chicken.getClass());*/
        System.out.println("Age in Months of Chicken = " + farmAnimal.getAgeInMonths(bornOnChicken1));
        //chicken2
        Date bornOnChicken2 = new Date(118, 3, 11);
        Chicken secondChicken = new Chicken(2, "Leghorn", bornOnChicken2, false, 4, "Good", true);
        System.out.println("Chicken -> " + secondChicken);
        System.out.println("Age in Months of Chicken = " + farmAnimal.getAgeInMonths(bornOnChicken2));
        //chicken3
        Date bornOnChicken3 = new Date(117, 5, 11);
        Chicken thirdChicken = new Chicken(3, "Brahma", bornOnChicken3, true, 3, "Bad", false);
        System.out.println("Chicken -> " + thirdChicken);
        System.out.println("Age in Months of Chicken = " + farmAnimal.getAgeInMonths(bornOnChicken3));
        //chicken4
        Date bornOnChicken4 = new Date(121, 2, 11);
        Chicken fourthChicken = new Chicken(4, "Orpington", bornOnChicken4, false, 7, "Good", true);
        System.out.println("Chicken -> " + fourthChicken);
        System.out.println("Age in Months of Chicken = " + farmAnimal.getAgeInMonths(bornOnChicken4));
        //chicken5
        Date bornOnChicken5 = new Date(120, 2, 11);
        Chicken fifthChicken = new Chicken(5, "Brahma", bornOnChicken5, false, 8, "Good", false);
        System.out.println("Chicken -> " + fifthChicken);
        System.out.println("Age in Months of Chicken = " + farmAnimal.getAgeInMonths(bornOnChicken5));

        //chicken6
        Date bornOnChicken6 = new Date(119, 5, 12);
        Chicken sixthChicken = new Chicken(6, "ponedora", bornOnChicken6, true, 6, "Good", true);
        System.out.println("Chicken -> " + sixthChicken);
        /*System.out.println("chicken is a " + chicken.getClass());*/
        System.out.println("Age in Months of Chicken = " + farmAnimal.getAgeInMonths(bornOnChicken6));
        chickens.add(firstChicken);
        chickens.add(secondChicken);
        chickens.add(thirdChicken);
        chickens.add(fourthChicken);
        chickens.add(fifthChicken);
        chickens.add(sixthChicken);
        System.out.println("My farm has -> " + chickens.size() + " chickens");
        System.out.println("My chickens are -> " + chickens);

        System.out.println("-----------------------Cows----------------------\n");
        //cow1
        Date bornOnCow1 = new Date(118, 2, 11);
        Cow firstCow = new Cow(1, "Jersey", bornOnCow1, false, (float) 10.2, true, "Good");
        System.out.println("Cow -> " + firstCow);
        System.out.println("Age in Months of Cow = " + farmAnimal.getAgeInMonths(bornOnCow1));
        //cow2
        Date bornOnCow2 = new Date(116, 2, 11);
        Cow secondCow = new Cow(2, "Jersey", bornOnCow2, false, (float) 10.2, true, "Good");
        System.out.println("Cow -> " + secondCow);
        System.out.println("Age in Months of Cow = " + farmAnimal.getAgeInMonths(bornOnCow2));
        cows.add(firstCow);
        cows.add(secondCow);

        System.out.println("My farm has -> " + cows.size() + " cows");
        System.out.println("My cows are -> " + cows);
        System.out.println("-----------------------Pigs----------------------\n");
        //pig
        Date bornOpig1 = new Date(119, 2, 11);
        Pig firstPig = new Pig(1, "Largue Black", bornOpig1, "Good", (float) 3.02, 10);
        System.out.println("Pig -> " + firstPig);
        System.out.println("Age in Months of Pig = " + farmAnimal.getAgeInMonths(bornOpig1));
        //pig2
        Date bornOpig2 = new Date(120, 1, 1);
        Pig secondPig = new Pig(2, "Largue Black", bornOpig2, "Bad", (float) 2.1, 9);
        System.out.println("Pig -> " + secondPig);
        System.out.println("Age in Months of Pig = " + farmAnimal.getAgeInMonths(bornOpig2));
        pigs.add(firstPig);
        pigs.add(secondPig);

        System.out.println("My farm has -> " + pigs.size() + " pigs");
        System.out.println("My pigs are -> " + pigs);
        //sheep1
         System.out.println("-----------------------Sheep----------------------\n");
        Date bornSheep1 = new Date(117, 2, 4);
        Date sheering1 = new Date(120, 1, 1);
        Sheep firstSheep = new Sheep(1, "Jersey", bornSheep1, sheering1, "Not Good", "Black");
        System.out.println("Sheep -> " + firstSheep);
        System.out.println("Age in Months of Sheep = " + farmAnimal.getAgeInMonths(bornSheep1));
        //sheep2
        Date bornSheep2 = new Date(118, 2, 4);
        Date sheering2 = new Date(115, 3, 1);
        Sheep secondSheep = new Sheep(2, "Jersey2", bornSheep2, sheering2, "Good", "White");
        System.out.println("Sheep -> " + secondSheep);
        System.out.println("Age in Months of Sheep = " + farmAnimal.getAgeInMonths(bornSheep2));
        sheeps.add(firstSheep);
        sheeps.add(secondSheep);

        System.out.println("My farm has -> " + sheeps.size() + " sheeps");
        System.out.println("My sheeps are -> " + sheeps);
        //Horse1
         System.out.println("-----------------------Horses----------------------\n");
        Date bornHorse1 = new Date(117, 1, 3);
        Horse firstHorse = new Horse(1, "Pure Blood", bornHorse1, 15, true, 100);
        System.out.println("Horse -> " + firstHorse);
        System.out.println("Age in Months of Horse = " + farmAnimal.getAgeInMonths(bornHorse1));
        //Horse2
        Date bornHorse2 = new Date(118, 2, 4);
        Horse secondHorse = new Horse(2, "Pure Blood", bornHorse2, 13, false, 90);
        System.out.println("Horse -> " + secondHorse);
        System.out.println("Age in Months of Horse = " + farmAnimal.getAgeInMonths(bornHorse2));

        horses.add(firstHorse);
        horses.add(secondHorse);
        System.out.println("My farm has -> " + horses.size() + " horses");
        System.out.println("My horses are -> " + horses);

    }

}
