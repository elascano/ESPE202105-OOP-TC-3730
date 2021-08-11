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
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FarmAnimal farmanimal;
        Date date = new Date();
        FarmAnimal farmAnimal = new FarmAnimal (0, "german shepherd",  date);
        System.out.println("FarmAnimal ->" + farmAnimal);
        
         date = new Date(2021, 1, 20);
       ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
       farmAnimals.add(farmAnimal);
       
       System.out.println("Far Animal is a ->" + farmAnimal.getClass());
       
       farmAnimal = new Chicken(1, "Criolla", date, true); 
       System.out.println("farm Animal -> " + farmAnimal);
       farmAnimals.add(farmAnimal);
       
       
       System.out.println("Far Animal is a ->" + farmAnimal.getClass());
       Chicken chicken = new Chicken(2, "Aguarico", date, true); 
       
       System.out.println("chicken -> " + chicken);
       System.out.println("Chicken is a ->" + chicken.getClass());
       System.out.println("The age is" + chicken.getAgeInMonths());
       
       farmAnimals.add(chicken);
       System.out.println("my farm has -> " + farmAnimals.size() + "animals");
       System.out.println("My FarmAnimals are -> " + farmAnimals);
    }
    
}
    
