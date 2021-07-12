/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Cow;
import ec.espe.edu.farm.model.Sheep;
import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.Pig;
import ec.espe.edu.farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class FarmSystem {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        Date date = new Date();
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        ArrayList<Chicken> chickens = new ArrayList<>();
        date = new Date(2021, 7, 14);
        
        chicken = new Chicken(1, "Criolla", date, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(2, "Aguarico", date, false);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(3, "Carioca", date, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);

        ArrayList<Cow> cows = new ArrayList<>();
        date = new Date(2021, 7, 16);

        cow = new Cow(1, "Belmont", date, false);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(2, "Romagnola", date, true);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(3, "Nelore", date, false);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);

        ArrayList<Pig> pigs = new ArrayList<>();
        date = new Date(2021, 7, 20);

        pig = new Pig(1, "Hampshire", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig(2, "Landrace", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig(3, "Yorkshire", date);
        farmAnimals.add(pig);

        ArrayList<Sheep> sheeps = new ArrayList<>();
        date = new Date(2021, 7, 22);

        sheep = new Sheep(1, "Latxa", date, date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(2, "Assaf", date, date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(3, "Awassi", date, date);
        farmAnimals.add(sheep);

        System.out.println("Chickens age is -> " + chicken.getAgeInMonths());
        System.out.println("Cows age is -> " + cow.getAgeInMonths());
        System.out.println("Pigs age is -> " + pig.getAgeInMonths());
        System.out.println("Sheeps age is -> " + sheep.getAgeInMonths());

        System.out.println("My farm has -> " + farmAnimals.size() + " animals");
        System.out.println("My FarmAnimals are -> " + farmAnimals);

    }

}
