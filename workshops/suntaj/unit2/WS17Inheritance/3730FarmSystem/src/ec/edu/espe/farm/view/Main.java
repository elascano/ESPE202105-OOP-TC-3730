/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Main {
    public static void main(String[] args) {
        
        FarmAnimal farmAnimal;
        Date date = new Date();
        
        farmAnimal = new Chicken(2, "guarica", date, true);
        System.out.println("Farm Animal ->" + farmAnimal);
        date = new Date(2021 , 1 , 20);
        ArrayList<FarmAnimal> farmAnimals =  new ArrayList <>();
        System.out.println("farmAnimal is a:" + farmAnimal.getClass());
        
        farmAnimal = new Chicken(1,"Criolla", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        
        Chicken chicken = new Chicken(2,"aguarico", date, true);
        System.out.println( "Chicken ->" + chicken);
        
        System.out.println("chicken is a " + chicken.getClass());
        System.out.println( "the age is ->" + chicken.getAgeInMonths());
        
        farmAnimals.add(chicken);
        
        System.out.println(" My harm has ->" + farmAnimals.size() + "animals");
        System.out.println("my FarmAnimals are ->"+ farmAnimals);
        
        farmAnimal = new Pig(25.5F, 5,"miniature", new Date(2020,8,25));
        
    
        
        
    }

   
}
