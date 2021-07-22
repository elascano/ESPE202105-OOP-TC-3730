/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farmSystem.view;

import ec.espe.edu.farmSystem.model.Chicken;
import ec.espe.edu.farmSystem.model.FarmAnimal;
import ec.espe.edu.farmSystem.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Main {
    
    public static void main(String[] args) {
        Date date = new Date();
        FarmAnimal farmAnimal = new Chicken(0, "Chirapa", date, false);
        System.out.println("Farm Animal->" + farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>(); 
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(1,"criolla", date, true);
        System.out.println("Farm Animal->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        
        Chicken chicken = new Chicken(2, "Aguarico", date, true);
        System.out.println("Chicken->" + chicken);
        
        System.out.println("chicken is a " + chicken.getClass());
        System.out.println("the age is->"+ chicken.getAgeInMonths());
        
        farmAnimals.add(chicken);
        
        System.out.println("My farm has ->" + farmAnimals.size()+ "animals");
        System.out.println("my FarmAnimals ar-> " + farmAnimals);
        
        farmAnimal = new Pig(3, "niniaure", new Date(2020, 8, 25), 25.45F);
        System.out.println("Farm Animal->" + farmAnimal);

    }
}
