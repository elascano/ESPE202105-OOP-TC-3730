/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import ec.edu.associations.model.Chicken;
import ec.edu.associations.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Main {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date= new Date();
        farmAnimal=new FarmAnimal(0, "german shephard", date);
        System.out.println("Farm Animal -> " + farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is a" + farmAnimal.getClass());
        
        farmAnimal = new Chicken(1, "Criolla", date, true);
        System.out.println("farmAnimal ->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is a" + farmAnimal.getClass());
        
        Chicken chicken = new Chicken(2, "aguarico", date, true);
        System.out.println("chicken ->" + chicken);
        
        
        System.out.println("chicken is a" + chicken.getClass());
        System.out.println("the age is -> " + chicken.isIsMolting());
        
        farmAnimals.add(chicken);
        
        System.out.println("My farm has ->" + farmAnimals.size()+ "animals");
        System.out.println("my FarmAnimals are ->" + farmAnimals);
    }
   
}
