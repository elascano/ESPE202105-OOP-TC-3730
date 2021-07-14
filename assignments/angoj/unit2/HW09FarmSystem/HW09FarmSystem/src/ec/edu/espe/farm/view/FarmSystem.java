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
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FarmAnimal farmAnimal;
       Date date = new Date(); 
       farmAnimal = new FarmAnimal(0, "german shepherd", date);
       System.out.println("Farm Animal -> " + farmAnimal);
       date = new Date(2021, 1, 20);
       ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
       farmAnimals.add(farmAnimal);
       
       System.out.println("Far Animal is a ->" + farmAnimal.getClass());
       ArrayList<Chicken> chickens = new ArrayList<>();
       farmAnimal = new Chicken(1, "Andrea", date, true); 
       System.out.println("farm Animal -> " + farmAnimal);
       farmAnimals.add(farmAnimal);
       
       
       System.out.println("Far Animal is a ->" + farmAnimal.getClass());
       Chicken chicken = new Chicken(2, "Victor", date, true); 
       System.out.println("chicken -> " + chicken);
       
       Chicken chicken1 = new Chicken(3, "Johny", date, true); 
       System.out.println("chicken -> " + chicken1);
       
       
       System.out.println("Chicken is a ->" + chicken.getClass());
       System.out.println("The age is" + chicken.getAgeInMonths());
       System.out.println("Chicken is a ->" + chicken1.getClass());
       System.out.println("The age is" + chicken1.getAgeInMonths());
       
       farmAnimals.add(chicken);
       farmAnimals.add(chicken1);
       chickens.add(chicken);
       chickens.add(chicken1);
       
       System.out.println("My farm has ->" + chickens.size() +"chickens");
       System.out.println("My chicken has ->" + chickens);
       
       ArrayList<Cow> cows = new ArrayList<>();
      date=new Date(2021,7,11); 
      farmAnimal = new Cow(true, 1, "angus", date);
        System.out.println("farmAnimal-> "  + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        Cow cow = new Cow(true, 2, "Limousin", date);
        System.out.println("cow->" + cow); 
        
        Cow cow1 = new Cow(true, 2, "Limousin", date);
        System.out.println("cow->" + cow1); 
        
        System.out.println("cow is a ->" + cow.getClass());
        System.out.println("The age is -> "  + cow.getAgeInMonths());
        System.out.println("cow is a ->" + cow1.getClass());
        System.out.println("The age is -> "  + cow1.getAgeInMonths());
        
        farmAnimals.add(cow);
        farmAnimals.add(cow1);
        cows.add(cow);
        cows.add(cow1);
         
       System.out.println("My farm has ->" + cows.size() +"cows");
       System.out.println("My cow are ->" + cows);
       
       ArrayList<Sheep> sheeps = new ArrayList<>();
       
      date = new Date(2021,11,7);
      farmAnimal = new  Sheep(date, 1, "Merina", date);
       System.out.println("farm animal -> " + farmAnimal);
       farmAnimals.add(farmAnimal);
       
       Sheep sheep =new Sheep(date, 2, "Awassi", date);
       System.out.println("sheep -> " +sheep);
       
       Sheep sheep1 =new Sheep(date, 2, "Awassi", date);
       System.out.println("sheep -> " +sheep1);
       
       System.out.println("sheep is a -> "  + sheep.getClass());
       System.out.println("the Age is ->"  + sheep.getAgeInMonths());
       System.out.println("sheep is a -> "  + sheep1.getClass());
       System.out.println("the Age is ->"  + sheep1.getAgeInMonths());
       
       farmAnimals.add(sheep);
       farmAnimals.add(sheep1);
       sheeps.add(sheep);
       sheeps.add(sheep1);
       
        System.out.println("My farm animal has -> " + sheeps.size() +"sheeps");
        System.out.println("My sheeps are ->" + sheeps);
    
        ArrayList<Pig> pigs = new ArrayList<>();
        date = new Date(2021,11,7);
        farmAnimal = new Pig(1, "Mangalica", date);
        System.out.println("farm animal ->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        Pig pig =new  Pig(2, "Meishan", date);
        System.out.println("Pig ->" +  pig);
        
        Pig pig1 =new  Pig(2, "Meishan", date);
        System.out.println("Pig ->" +  pig1);
        System.out.println("Pig is a ->"  + pig.getClass());
        System.out.println("The age is  -> " + pig.getAgeInMonths());
        System.out.println("Pig is a ->"  + pig1.getClass());
        System.out.println("The age is  -> " + pig1.getAgeInMonths());
        
        farmAnimals.add(pig);
        farmAnimals.add(pig1);
        pigs.add(pig);
        pigs.add(pig1);
        
        System.out.println("My farm animas has ->" + pigs.size() + "pigs");
        System.out.println("My pigs are ->" + pigs);
        
        
        
        
       System.out.println("my farm has -> " + farmAnimals.size() + "animals");
       System.out.println("My FarmAnimals are -> " + farmAnimals);
       
       
       
    }
    
}