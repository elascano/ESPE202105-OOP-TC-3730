/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.Cow;
import ec.espe.edu.farm.model.FarmAnimal;
import ec.espe.edu.farm.model.Ping;
import ec.espe.edu.farm.model.Sheep;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lizeh Taco ESPE-DCCO
 */
public class Main {
    


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
        
        cow = new Cow(0, "Angus", date, true);
        System.out.println("cow-> "+ cow);
        System.out.println("cow is a " + cow.getClass());
        farmAnimals.add(cow);
        
        cow = new Cow(1, "Holstein", date, true);
        System.out.println("cow-> " + cow);
        System.out.println("cow is a " + cow.getClass());
        farmAnimals.add(cow);
        
        cow = new Cow(2, "Hereford", date, true);
        System.out.println("cow-> " + cow);
        System.out.println("cow is a " + cow.getClass());
        farmAnimals.add(cow);
        
        
        Ping ping;
        ArrayList< Ping>pings = new ArrayList<>();
        
        ping = new Ping(0, "Kunekune", date);
        System.out.println("ping-> " + ping);
        System.out.println("ping is a " + ping.getClass());
        farmAnimals.add(ping);
        
        ping = new Ping(1, "Duroc", date);
        System.out.println("ping-> " + ping);
        System.out.println("ping is a " + ping.getClass());
        farmAnimals.add(ping);
        
        
        ping = new Ping(2, "Berkshire", date);
        System.out.println("ping-> " + ping);
        System.out.println("ping is a " + ping.getClass());
        farmAnimals.add(ping);
        
        
        Sheep sheep;
        ArrayList< Sheep>sheeps = new ArrayList<>();
        date = new Date(35);
        
        sheep = new Sheep(0, "Priangan", date, date);
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