/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farmSystem.view;


import ec.espe.edu.farmSystem.model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;


/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class Main {
    
    public static void main(String[] args) {
        
       
        Date date =new Date();
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Cow> cows = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();
        ArrayList<Sheep> sheeps = new ArrayList<>();
        
        System.out.print("Farm Animal \n");
        
        System.out.println("Cristopher jossue Sarmiento Sanchez \n");
        System.out.println("NRC = 3730");
        
        FarmAnimal farmAnimal = new FarmAnimal(0, "Mike", 21, 07, 2000);
        System.out.println(); 
        
        farmAnimal = new Chicken(1,"Leghorn",15,07,2021, false);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        chickens.add((Chicken) farmAnimal);
        
        farmAnimal = new Chicken(2,"Orpigton", 9,06,2020, true);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        chickens.add((Chicken) farmAnimal);
        
        farmAnimal = new Chicken(3,"Leghorn", 8,04,2020, false);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        chickens.add((Chicken) farmAnimal);
       
        farmAnimal = new Cow(1, "Angus" , 5,05,2021, false);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        cows.add((Cow) farmAnimal);
        
        farmAnimal = new Cow(2, "Braford" , 10,04,2021, false);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        cows.add((Cow) farmAnimal);
        
        farmAnimal = new Cow(3, "Beefalo" , 12,06,2020, false);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        cows.add((Cow) farmAnimal);
        
        farmAnimal = new Pig(1, "Duroc", 7,04,2021);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        pigs.add((Pig) farmAnimal);
        
        farmAnimal = new Pig(2, "Meishan", 10,11,2020);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        pigs.add((Pig) farmAnimal);
        
        farmAnimal = new Pig(3, "Pietrain", 5,05,2021);
        System.out.println("Farm Animal -> " + farmAnimal);
         FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        pigs.add((Pig) farmAnimal);
        
        farmAnimal = new Sheep(1, "Texel", 7,06,2021, date);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        sheeps.add((Sheep) farmAnimal);
        
        farmAnimal = new Sheep(2, "Jacob", 14,07,2021, date);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        sheeps.add((Sheep) farmAnimal);
        
        farmAnimal = new Sheep(3, "Racka", 15,9,2020, date);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        sheeps.add((Sheep) farmAnimal);
        
        System.out.println("My Farm is->" + farmAnimals.size()+" FarmAnimals");
        System.out.println("My Farm Animals has-> " + farmAnimals);
        System.out.println("My Farm Animals Chickens are-> " + chickens);
        System.out.println("My Farm Animals Cows are-> " + cows);
        System.out.println("My Farm Animals Pigs are-> " + pigs);
        System.out.println("My Farm Animals Sheeps are-> " + sheeps);
        
        
        

    }
    
}
