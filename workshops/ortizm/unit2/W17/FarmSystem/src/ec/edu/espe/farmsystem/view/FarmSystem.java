/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.view;

import ec.edu.espe.farmsystem.controller.FarmAnimal;
import ec.edu.espe.farmsystem.modell.Chicken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date = new Date();
        farmAnimal = new FarmAnimal(0, "gerran shephere", date);
        System.out.println("Farm Animal ->" + farmAnimal);
        date = new Date(2021, 01, 20);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(farmAnimal);
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        farmAnimal = new Chicken(1, "Criolla", date, true);
        System.out.println("farm Animal ->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        Chicken chicken = new Chicken(2, "Agurico", date, true);
        System.out.println("Chicken ->" + chicken);
        System.out.println("farmAnimal is a " + farmAnimal.getClass());
        System.out.println("The age is ->" + chicken.getAgeInMonths());
        farmAnimals.add(chicken);

        System.out.println("My famr has -> " + farmAnimals.size() + "animals");
        System.out.println("My FarmAnimals are -> " + farmAnimals);

    }

}
