/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;

import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jean Jaramillo
 */
public class Main {

    private static String breed;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new FarmAnimal(0, "german shepherd", date);
        System.out.println("Farm Animal ->" + farmAnimal);
        date = new Date(2021, 1, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(farmAnimal);
        
        System.out.println("farAnimal is a " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(1, "Criolla", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        
        farmAnimal = new Chicken(2, "Plymount", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        
        farmAnimal = new Chicken(3, "Aguarico", date, true);
        System.out.println("farm Animal ->" + farmAnimal);

        farmAnimal = new Cow(1, "Angus", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        
        farmAnimal = new Cow(2, "Holstein", date, true);
        System.out.println("farm Animal ->" + farmAnimal);

        farmAnimal = new Cow(3, "Hereford", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        farmAnimal = new Pig(1, "Duroc", date);
        System.out.println("farm Animal ->" + farmAnimal);
        
        farmAnimal = new Pig(2, "Tanworth", date);
        System.out.println("farm Animal ->" + farmAnimal);
        
        farmAnimal = new Pig(3, "Hampshire", date);
        System.out.println("farm Animal ->" + farmAnimal);
        
        
        farmAnimal = new Sheep(date, 1, "Dorper", date);
        System.out.println("farm Animal ->" + farmAnimal);
        
        farmAnimal = new Sheep(date, 2, "Merina", date);
        System.out.println("farm Animal ->" + farmAnimal);
        
        farmAnimal = new Sheep(date, 3, "Suffolk", date);
        System.out.println("farm Animal ->" + farmAnimal);
        
        System.out.println("My farm has -> " + farmAnimals.size() + " animals ");
        System.out.println("my FarmAnimals are -> " + farmAnimals);
    }   
           
}









































