/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.FarmAnimal;
import ec.espe.edu.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new Chicken(0, "criolla", date, false);
        System.out.println("Farm Animal -> " + farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(farmAnimal);
        
        System.out.println("Farm Animal is a " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(1, "Criolla", date, true);
        System.out.println("Farm Animal -> " + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        System.out.println("Farm Animal is a " + farmAnimal.getClass());
        
        Chicken chicken = new Chicken(2, "aguarico", date, true);
        System.out.println("Chicken -> " + chicken);
        
        System.out.println("Chicken is a " + farmAnimal.getClass());
        System.out.println("The age is -> " + chicken.getAgeInMonths());
        
        farmAnimals.add(chicken);
        
        System.out.println("My farm has -> " + farmAnimals.size() + " animals");
        System.out.println("My FarmAnimals are -> " + farmAnimals);
        
        farmAnimal = new Pig(28.5F, 3, "nineature", new Date(2020,8,25));
        
        farmAnimals.add(farmAnimal);
        
        chicken.feed(1);
        farmAnimal.feed(5);
        
        chicken.vaccinate(3);
        farmAnimal.vaccinate(1);
        
        System.out.println("My Farm Animals are" + farmAnimals);
    }
}
