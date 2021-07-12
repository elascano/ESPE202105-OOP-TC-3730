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
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Main {
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
        
       Chicken chicken1 = new Chicken(1, "Criolla", date, true);
       System.out.println("chicken -> " + chicken1);
       farmAnimals.add(chicken1);
       chickens.add(chicken1); 

            
       Chicken chicken2 = new Chicken(2, "Guarico", date, true); 
       System.out.println("chicken -> " + chicken2);
       farmAnimals.add(chicken2);
       chickens.add(chicken2); 

       
       date = new Date(2021, 3, 24); 
       Chicken chicken3 = new Chicken(3, "Runa", date, true); 
       System.out.println("chicken -> " + chicken3);
       farmAnimals.add(chicken3);
       chickens.add(chicken3); 
       
       System.out.println("Chicken is a ->" + chicken1.getClass());
       System.out.println("The age of my chickens are " + chicken1.getAgeInMonths() + " months");
  
       System.out.println("The arrangement has -> " + chickens.size() + " chickens");
       System.out.println("The arrangement are -> " + chickens);
       
       ArrayList<Cow> cows = new ArrayList<>();
     
       date = new Date(2021, 3, 34); 
       Cow cow1 = new Cow(true, 1, "Angus", date); 
       System.out.println("Cow -> " + cow1);
       farmAnimals.add(cow1); 
       cows.add(cow1); 

       
       Cow cow2 = new Cow(true, 2, "Holstein", date); 
       System.out.println("Cow -> " + cow2);
       farmAnimals.add(cow2); 
       cows.add(cow2); 

       Cow cow3 = new Cow(true, 3, "Hereford", date); 
       System.out.println("Cow -> " + cow3);       
       farmAnimals.add(cow3);
       cows.add(cow3); 
       
       System.out.println("Cow is a -> " + cow1.getClass());
       System.out.println("The age of my cows are " + cow1.getAgeInMonths() +  " months");
       
       System.out.println("The arrangement has -> " + cows.size() + " cows");
       System.out.println("The arrangement are -> " + cows);
       
       ArrayList<Sheep> sheeps = new ArrayList<>();

       date = new Date(2021, 6, 34);
       Sheep sheep1 = new Sheep(date, 1, "Merina", date);        
       System.out.println("Sheep -> " + sheep1);
       farmAnimals.add(sheep1);
       sheeps.add(sheep1); 

           
       Sheep sheep2 = new Sheep(date, 2,"Dorper", date); 
       System.out.println("Sheep -> " + sheep2);
       farmAnimals.add(sheep2);
       sheeps.add(sheep2); 

        
       Sheep sheep3 = new Sheep(date, 3,"Karakul", date); 
       System.out.println("Sheep -> " + sheep3); 
       farmAnimals.add(sheep3); 
       sheeps.add(sheep3); 
       
       System.out.println("Sheep is a -> " + sheep1.getClass());
       System.out.println("The age of my sheeps are " + sheep1.getAgeInMonths() + " months");       

       System.out.println("The arangement has -> " + sheeps.size() + " sheeps");
       System.out.println("The arrangement are -> " + sheeps);
       
       ArrayList<Pig> pigs = new ArrayList<>(); 
       
       date = new Date(2021, 9, 19); 
       Pig pig1 = new Pig(1,"Duroc", date);        
       System.out.println("Pig -> " + pig1);
       farmAnimals.add(pig1); 
       pigs.add(pig1); 

       Pig pig2 = new Pig(2, "Vietnamita", date); 
       System.out.println("Pig -> " + pig2);
       farmAnimals.add(pig2); 
       pigs.add(pig2); 

       
       Pig pig3 = new Pig(3, "Hampshire", date); 
       System.out.println("Pig -> " + pig3);              
       farmAnimals.add(pig3);
       pigs.add(pig3); 
       
       System.out.println("Pig is a -> " + pig1.getClass());
       System.out.println("The age of my pigs are " + pig1.getAgeInMonths() + " months");              

       System.out.println("The arrangement has -> " + pigs.size() + " pigs");
       System.out.println("The arrangement are -> " + pigs);
       
       System.out.println("My farm has -> " + farmAnimals.size() + " animals");
       System.out.println("My FarmAnimals are -> " + farmAnimals);
       
   } 
}