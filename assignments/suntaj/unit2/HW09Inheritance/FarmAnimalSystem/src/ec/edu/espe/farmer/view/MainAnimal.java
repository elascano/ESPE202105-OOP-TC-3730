/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmer.view;

import ec.edu.espe.farmer.model.Chicken;
import ec.edu.espe.farmer.model.Cow;
import ec.edu.espe.farmer.model.FarmAnimal;
import ec.edu.espe.farmer.model.Pig;
import ec.edu.espe.farmer.model.Sheep;
import java.util.ArrayList;
import java.util.Date;
//import ec.edu.espe.farmer.model.Cow;
//import ec.edu.espe.farmer.model.FarmAnimal;
//import ec.edu.espe.farmer.model.Pig;
//import ec.edu.espe.farmer.model.Sheep;
//import java.util.ArrayList;
//import java.util.Date;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class MainAnimal {
  public static void main(String[] args) {
       
        
        
   FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        Date date = new Date();
        date = new Date(2021, 11, 05);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        ArrayList<Chicken> chickens = new ArrayList<>();

        chicken = new Chicken(1, "Criolla", date, true);
        farmAnimals.add(chicken);
        
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(2, "Aguarico", date, false);
        farmAnimals.add(chicken);
        
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(6, "Menorca", date, true);
        farmAnimals.add(chicken);
        
        System.out.println("chicken ->" + chicken);

        ArrayList<Cow> cows = new ArrayList<>();
        date = new Date(2021, 03, 20);

        cow = new Cow("true", 3, "Holstein", date);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        
        cow = new Cow("true", 5,"Angus", date);
        
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow("false", 3,"Hereford", date);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);

        ArrayList<Pig> pigs = new ArrayList<>();
        date = new Date(2021, 04, 19);

        pig = new Pig(1, "Tamworth", date);
        farmAnimals.add(pig);
        
        System.out.println("pig -> " + pig);
        pig = new Pig(2, "Large Black", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig(3, "Large White", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);

        ArrayList<Sheep> sheeps = new ArrayList<>();
        date = new Date(2021,02, 10);

        sheep = new Sheep(5, "Dorper", date);
        farmAnimals.add(sheep);
        
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(5,"Merina", date);
        
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(2,"Suuffolk", date);
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
