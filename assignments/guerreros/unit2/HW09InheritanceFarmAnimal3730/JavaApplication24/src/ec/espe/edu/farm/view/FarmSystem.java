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
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class FarmSystem {

    
    public static void main(String[] args) {
       
        System.out.println("Name: Stefany Guerrero");
        System.out.println("NRC: 3730");
        System.out.println("Welcome Farm System");
        System.out.println("\n ");
        
        
        FarmAnimal farmAnimal=new FarmAnimal(0, "ksksmkw", 0, 0, 0);
        Date date = new Date();
      
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        ArrayList<Sheep> sheeps = new ArrayList<>();
        ArrayList<Cow> cows = new ArrayList<>();
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();

        
        
        farmAnimal = new Chicken(1, "Criolla",  12, 6, 2021, true);
        farmAnimals.add(farmAnimal);
        System.out.println("chicken ->" + farmAnimal);
        FarmAnimal.getAgeInMonths();
        chickens.add((Chicken) farmAnimal);
        farmAnimal = new Chicken(2, " Aguarica ",  15, 3, 2021, true);
        farmAnimals.add(farmAnimal);
        System.out.println("chicken ->" + farmAnimal);
        FarmAnimal.getAgeInMonths();
        chickens.add((Chicken) farmAnimal);
        farmAnimal = new Chicken(3, "Orpington", 4, 5, 2021, true);
        farmAnimals.add(farmAnimal);
        System.out.println("farmAnimal->" + farmAnimal);
        FarmAnimal.getAgeInMonths();
        chickens.add((Chicken) farmAnimal);
       


       farmAnimal = new Cow(1, "Angus",16,5,2021, true);
        farmAnimals.add(farmAnimal);
        System.out.println("cow -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        cows.add((Cow) farmAnimal);
        farmAnimal = new Cow(2, "Hostein",13,4,2021, true);
        farmAnimals.add(farmAnimal);
        System.out.println("cow -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        cows.add((Cow) farmAnimal);
        farmAnimal = new Cow(3, "Bradford", 9,6,2021, false);
        farmAnimals.add(farmAnimal);
        System.out.println("cow -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        cows.add((Cow) farmAnimal);
        
    

        farmAnimal = new Pig(1, "Duroc",4,6,2021);
        farmAnimals.add(farmAnimal);
        System.out.println("pig -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        pigs.add((Pig) farmAnimal);
        farmAnimal = new Pig(2, "Tamworth", 5,3,2021);
        farmAnimals.add(farmAnimal);
        System.out.println("pig -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        pigs.add((Pig) farmAnimal);
        farmAnimal = new Pig(3, "Meishan", 3,6,2021);
        farmAnimals.add(farmAnimal);
        System.out.println("pig -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        pigs.add((Pig) farmAnimal);
       
    

        farmAnimal = new Sheep(1, "Merina",2,4,2021, date);
        farmAnimals.add(farmAnimal);
        System.out.println("sheep -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        sheeps.add((Sheep) farmAnimal);
        farmAnimal = new Sheep(2, "Texel",2,5,2021 , date);
        farmAnimals.add(farmAnimal);
        System.out.println("sheep -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        sheeps.add((Sheep) farmAnimal);
        farmAnimal = new Sheep(3, "Lacaune", 6,4,2021, date);
        farmAnimals.add(farmAnimal);
        System.out.println("sheep -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        sheeps.add((Sheep) farmAnimal);
        

        
        System.out.println("My farm has -> " + farmAnimals.size() + " animals");
        System.out.println("My FarmAnimals are -> " + farmAnimals);
        System.out.println("My Farm Animals Chickens are-> " + chickens);
        System.out.println("My Farm Animals Cows are-> " + cows);
        System.out.println("My Farm Animals Pigs are-> " + pigs);
        System.out.println("My Farm Animals Sheeps are-> " + sheeps);

        
    }
    
}
