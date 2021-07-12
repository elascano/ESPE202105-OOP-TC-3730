/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3730farmsystem;

import ec.espe.edu.Farm.model.Chicken;
import ec.espe.edu.Farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new FarmAnimal(0, "german shepherd", date);
        System.out.println("Farm Animal -> " + farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is : " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(1, "Criolla", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is : " + farmAnimal.getClass());
        
        Chicken chicken = new Chicken(2, "Aguarico", date, true);
        System.out.println("chicken -> " + chicken);
        
        System.out.println("chicken is : " + chicken.getClass());
        
        System.out.println("the age is ->" + chicken.getAgeInMonths());
        farmAnimals.add(chicken);
        
        System.out.println("My farm has -> " + farmAnimals.size() + "Aniamls");
        System.out.println("My FarmAnimals are -> " + farmAnimals);
    }
   
    
}
