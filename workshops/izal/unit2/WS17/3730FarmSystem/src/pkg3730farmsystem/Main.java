/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3730farmsystem;

import ec.espe.edu.Farm.model.Chicken;
import ec.espe.edu.Farm.model.Cow;
import ec.espe.edu.Farm.model.FarmAnimal;
import ec.espe.edu.Farm.model.Pig;
import ec.espe.edu.Farm.model.Sheep;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        FarmAnimal farmAnimal;
        Date date = new Date(2020, 3, 11);
        
        Period age = Period.between(LocalDate.of(1987, 4, 8), LocalDate.now());
        System.out.println(String.format("%d años, %d meses y %d días", age.getYears(), age.getMonths(), age.getDays()));
        
        farmAnimal = new FarmAnimal(0, "german shepherd", date);
        System.out.println("Farm Animal -> " + farmAnimal);
        
        
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        date = new Date(2021, 9, 24);
        date = new Date(2021, 10, 25);
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is : " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(0, "Name of Chicken", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        farmAnimal = new Cow(0, "Name of Cow", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        farmAnimal = new Pig(0, "Name of Pig ", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        farmAnimal = new Sheep(0, "Name of Sheep", date, true);
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is : " + farmAnimal.getClass());
        
        
        Chicken chicken = new Chicken(1, "Aguarico", date, true);
        Chicken chicken2 = new Chicken(2, "Piroca", date, true);
        Chicken chicken3 = new Chicken(3, "Guinea", date, true);
        
        Cow cow = new Cow(1, "Holstein", date, true);
        Cow cow2 = new Cow(2, "Hereford", date, true);
        Cow cow3 = new Cow(3, "Simmental", date, true);
        
        Pig pig = new Pig(1, "Large white", date, true);
        Pig pig2 = new Pig(2, "Duroc", date, true);
        Pig pig3 = new Pig(3, "Berkshire", date, true);
        
        Sheep sheep = new Sheep(1, "Doper", date, true);
        Sheep sheep2 = new Sheep(2, "Merina", date, true);
        Sheep sheep3 = new Sheep(3, "Suffolk", date, true);
        
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("chicken -> " + chicken);
        System.out.println("chicken2 ->" + chicken2);
        System.out.println("chicken3 ->" + chicken3);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("cow ->" + cow);
        System.out.println("cow ->" + cow2);
        System.out.println("cow ->" + cow3);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("pig ->" + pig);
        System.out.println("pig ->" + pig2);
        System.out.println("pig ->" + pig3);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("sheep ->" + sheep);
        System.out.println("sheep ->" + sheep2);
        System.out.println("sheep ->" + sheep3);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        
        System.out.println("chicken is : " + chicken.getClass());
        
        System.out.println("the age Chicken is ->" + chicken.getAgeInMonths() + "\tMonths");
        System.out.println("the age Cow is ->" + cow.getAgeInMonths() +  "\tMonths");
        System.out.println("the age pig is ->" + pig.getAgeInMonths() + "\tMonths");
        System.out.println("the age sheep is ->" + sheep.getAgeInMonths() + "\tMonths");
        
        farmAnimals.add(chicken);
        farmAnimals.add(chicken2);
        farmAnimals.add(chicken3);
        farmAnimals.add(cow);
        farmAnimals.add(cow2);
        farmAnimals.add(cow3);
        farmAnimals.add(pig);
        farmAnimals.add(pig2);
        farmAnimals.add(pig3);
        farmAnimals.add(sheep);
        farmAnimals.add(sheep2);
        farmAnimals.add(sheep3);
        
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("My farm has -> " + farmAnimals.size() + "Aniamls");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("My FarmAnimals are -> " + farmAnimals);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }
   
    
}
