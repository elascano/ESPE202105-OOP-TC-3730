/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new FarmAnimal (0, "german shepherd", date);
        System.out.println("Farm Animal -->" + farmAnimal);
        date= new Date (2021,1 ,20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(farmAnimal);
        
        farmAnimal = new Chicken(0, "Criolla", date, true);
        System.out.println("farmAnimal -->" + farmAnimal);
        
        System.out.println("farmAnimal is a: " +farmAnimal.getClass());
        
        Chicken chicken = new Chicken (2, "aguarico", date, true);
        System.out.println("Chicken-->"+ chicken);
        
        System.out.println("Chicken is a: " + chicken.getClass());
        System.out.println("The age is -->"+ chicken.getAgeInMonths());
        
        farmAnimals.add(chicken);
        
        System.out.println("My farm has-->"+ farmAnimals.size()+"animals");
        System.out.println("My FarmAnimals are-->"+farmAnimals);
        
    }
    
}
