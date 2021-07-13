/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.view;

import ec.edu.espe.farmsystem.modell.Chicken;
import ec.edu.espe.farmsystem.modell.Cow;
import ec.edu.espe.farmsystem.controller.FarmAnimal;
import ec.edu.espe.farmsystem.modell.Pig;
import ec.edu.espe.farmsystem.modell.Sheep;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Josselyn Sigcha Codes ESPE-DCCO
 */
public class farmSystem {
    
  /**
   * @param args the command line arguments
   */  
  public static void main(String[] args){
      FarmAnimal farmAnimal;
         
        Date date = new Date();
       
        ArrayList<  FarmAnimal>farmAnimals = new ArrayList<>();
                
     
        
        
        ArrayList< Chicken>chickens = new ArrayList<>();
        Chicken chicken = new Chicken(0,"Aguarico", date, true);
        System.out.println("chicken->" + chicken);
        
        System.out.println("chicken-> " + chicken.getClass());
        System.out.println("the age is -> " + chicken.getAgeInMonths());
        farmAnimals.add(chicken);
       
       chicken = new Chicken(1, "Australorp", date, true);
      System.out.println("chiken-> " + chicken);
       
        System.out.println("chicken is a " + chicken.getClass());
        System.out.println("the age is -> " + chicken.getAgeInMonths());
        farmAnimals.add(chicken);
        
        chicken = new Chicken(2, "Brahma", date, true);
       System.out.println("chiken->" + chicken);
        
        System.out.println("chicken is a " + chicken.getClass());
        System.out.println("the age is -> " + chicken.getAgeInMonths());
        farmAnimals.add(chicken);
        
        Cow cow;
        ArrayList<  Cow>cows = new ArrayList<>();
        
        cow = new Cow(0, "Simmental", date, true);
        System.out.println("cow-> "+ cow);
        System.out.println("cow is a " + cow.getClass());
        farmAnimals.add(cow);
        
        cow = new Cow(1, "Holstein", date, true);
        System.out.println("cow-> " + cow);
        System.out.println("cow is a " + cow.getClass());
        farmAnimals.add(cow);
        
        cow = new Cow(2, "Limousin", date, true);
        System.out.println("cow-> " + cow);
        System.out.println("cow is a " + cow.getClass());
        farmAnimals.add(cow);
        
        
        Pig pig;
        ArrayList< Pig>pigs = new ArrayList<>();
        
        pig = new Pig(0, "Tamworth", date);
        System.out.println("ping-> " + pig);
        System.out.println("ping is a " + pig.getClass());
        farmAnimals.add(pig);
        
        pig = new Pig(1, "Duroc", date);
        System.out.println("ping-> " + pig);
        System.out.println("ping is a " + pig.getClass());
        farmAnimals.add(pig);
        
        
        pig = new Pig(2, "Mulefoot", date);
        System.out.println("ping-> " + pig);
        System.out.println("ping is a " + pig.getClass());
        farmAnimals.add(pig);
        
        
        Sheep sheep;
        ArrayList< Sheep>sheeps = new ArrayList<>();
        date = new Date(35);
        
        sheep = new Sheep(0, "Hampshire", date, date);
        System.out.println("sheep-> " + sheep);
        System.out.println("sheep is a " + sheep.getClass());
        farmAnimals.add(sheep);
        
        sheep = new Sheep(1, "Suffolk", date, date);
        System.out.println("sheep-> " + sheep);
        System.out.println("sheep is a " + sheep.getClass());
        farmAnimals.add(sheep);
        
                
        sheep = new Sheep(2, "Merina", date, date);
        System.out.println("sheep-> " + sheep);
        System.out.println("sheep is a " + sheep.getClass());
        farmAnimals.add(sheep);
        
        
        
        
        System.out.println("My farm has -> " + farmAnimals.size() + " animals");
        System.out.println("my FarmAnimals are -> " + farmAnimals);
  }
}