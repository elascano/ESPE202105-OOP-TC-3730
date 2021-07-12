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
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal= new FarmAnimal(0,"german shephard", date);
        
        System.out.println("Farm Animal ->"+ farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        ArrayList<FarmAnimal> farmPig = new ArrayList<>();
        
        System.out.println("farmAnimal is a "+ farmAnimal.getClass());
        
        farmAnimal = new Chicken(1,"Criolla", date, true);
        System.out.println("farm Animal -> " + farmAnimal);
        
        Chicken chicken = new Chicken(2, "aguarico", date, true);
        System.out.println("chicken->"+ chicken);
        
        System.out.println("farmAnimal is a "+ chicken.getClass());
        System.out.println("the age is ->" +chicken.getAgeInMonths());
        
        farmAnimals.add(chicken);
        System.out.println("My farm has -> "+ farmAnimals.size()+"animals");
        System.out.println("My FarmAnimals are ->"+ farmAnimals);
        
        Pig pig = new Pig(1,"Largewith", date,"Juris" );
        System.out.println("Pig->"+ pig);
        
        Pig pig2 = new Pig(2,"Poland China", date,"Isabel" );
        System.out.println("Pig->"+ pig2);
        
        Pig pig3 = new Pig(3,"Largewith", date,"Santa Maria");
        System.out.println("Pig->"+ pig3);
        
        
        
        
    }
    
}
