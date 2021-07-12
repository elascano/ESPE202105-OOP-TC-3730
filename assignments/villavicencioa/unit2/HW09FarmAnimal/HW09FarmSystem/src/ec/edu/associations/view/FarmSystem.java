/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import ec.edu.associations.model.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        Date date= new Date();
        date = new Date(2021, 3, 15);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        
        ArrayList<Chicken> chickens = new ArrayList<>();
      
        chicken = new Chicken(1, "Carioca", date, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(2, "Polaca", date, false );
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(3, "Menorca", date, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        
        
        ArrayList<Cow> cows = new ArrayList<>();
        date = new Date(2021, 4, 15);
        
        cow = new Cow(1, "Angus", date, true);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(2, "Boran", date, true);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(3, "Lownline", date, false);
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        
        ArrayList<Pig> pigs = new ArrayList<>();
        date = new Date(2021, 5, 15);
        
        pig = new Pig (1, "Duroc", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig (2, "Large white", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig (3, "Meishan", date);
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        
        ArrayList<Sheep> sheeps = new ArrayList<>();
        date = new Date(2021, 6, 15);
        
        sheep = new Sheep(1, "Dorper", date, date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(2, "Merina", date, date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(3, "Texel", date, date);
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        
        System.out.println("Chickens age -> "+ chicken.getAgeInMonths()+ " months");
        System.out.println("Cows age -> "+ cow.getAgeInMonths() + " months");
        System.out.println("Pigs age -> " + pig.getAgeInMonths() + " months");
        System.out.println("Sheeps age -> " + sheep.getAgeInMonths() + " months");
        
        System.out.println("My farm has ->" + farmAnimals.size()+ "animals");
        System.out.println("my FarmAnimals are ->" + farmAnimals);

    }
    
}
