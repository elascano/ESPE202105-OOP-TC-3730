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
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Main {
    
    public static void main(String[] args) {
        
       
        Date date =new Date();
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Cow> cows = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();
        ArrayList<Sheep> sheeps = new ArrayList<>();
        
        System.out.print("FARM ANIMAL SYSTEM \n");
        
        System.out.println("AUTHOR = Luis Alberto Heredia Iza\n");
        System.out.println("NRC= 3730");
        
        FarmAnimal farmAnimal = new FarmAnimal(0, "DUKOOO", 21, 06, 2001);
        System.out.println(); 
        
        farmAnimal = new Chicken(0,"Criolla",11,06,2021, true);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        chickens.add((Chicken) farmAnimal);
        
        farmAnimal = new Chicken(1,"Guarica", 10,05,2021, false);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        chickens.add((Chicken) farmAnimal);
        
        farmAnimal = new Chicken(2,"Chirapa", 9,03,2021, true);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        chickens.add((Chicken) farmAnimal);
       
        farmAnimal = new Cow(3, "Holstein" , 1,04,2020, true);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        cows.add((Cow) farmAnimal);
        
        farmAnimal = new Cow(4, "Beefmaster" , 11,03,2023, true);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        cows.add((Cow) farmAnimal);
        
        farmAnimal = new Cow(5, "Brahman" , 11,02,2023, true);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        cows.add((Cow) farmAnimal);
        
        farmAnimal = new Pig(6, "Landrace", 11,01,2023);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        pigs.add((Pig) farmAnimal);
        
        farmAnimal = new Pig(7, "Yorkshire", 11,12,2024);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        pigs.add((Pig) farmAnimal);
        
        farmAnimal = new Pig(8, "Hampshire", 11,11,2022);
        System.out.println("Farm Animal -> " + farmAnimal);
         FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        pigs.add((Pig) farmAnimal);
        
        farmAnimal = new Sheep(9, "Dorper", 11,10,2022, date);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        sheeps.add((Sheep) farmAnimal);
        
        farmAnimal = new Sheep(10, "Merina", 11,9,2022, date);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        sheeps.add((Sheep) farmAnimal);
        
        farmAnimal = new Sheep(11, "Suffolk", 11,07,2022, date);
        System.out.println("Farm Animal -> " + farmAnimal);
        FarmAnimal.getAgeInMonths();
        farmAnimals.add(farmAnimal);
        sheeps.add((Sheep) farmAnimal);
        
        System.out.println("My Farm has->" + farmAnimals.size()+" animals");
        System.out.println("My Farm Animals ar-> " + farmAnimals);
        System.out.println("My Farm Animals Chickens ar-> " + chickens);
        System.out.println("My Farm Animals Cows ar-> " + cows);
        System.out.println("My Farm Animals Pigs ar-> " + pigs);
        System.out.println("My Farm Animals Sheeps ar-> " + sheeps);
        
        
        

    }
    
}
