/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new FarmAnimal(0, "german sheperd", date);
        System.out.println("Farm Animal -> " + farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(0, "Criolla", date, true);
        System.out.println("farmAnimal -> " + farmAnimal);
        
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        
        Chicken chicken = new Chicken(2,"aguarico", date, true);
        System.out.println("chicken -> " + chicken);
        
        System.out.println("chicken is a " + chicken.getClass());
        System.out.println(" the age is -> " + chicken.getClass());
        
        farmAnimals.add(chicken);
        
        System.out.println("My farm has -> " + farmAnimals.size() + " animals");
        System.out.println("My FarmAnimals are -> " + farmAnimals);
        
        
        
    }
    
}