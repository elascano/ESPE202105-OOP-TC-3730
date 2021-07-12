/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.Cow;
import ec.espe.edu.farm.model.FarmAnimal;
import ec.espe.edu.farm.model.Pig;
import ec.espe.edu.farm.model.Sheep;
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
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        farmAnimal= new FarmAnimal(0,"german shephard", date);
        Pig pig;
        Cow cow;
        Chicken chicken;
        Sheep sheep;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Cow> cows = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();
        ArrayList<Sheep> sheeps = new ArrayList<>();
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        date = new Date(2021, 1, 20);
        date1 = new Date(2021, 2, 22);
        date2 = new Date(2021, 3, 23);
        date3 = new Date(2021, 4, 24);
        
        System.out.println("Farm Animal ->"+ farmAnimal);
        
        
        System.out.println("farmAnimal is a "+ farmAnimal.getClass());
        
        farmAnimal = new Chicken(1,"Criolla", date, true);
        System.out.println("farm Animal -> " + farmAnimal);
        
        
        chicken = new Chicken(1,"Criolla", date3, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(2,"Aguarico", date3, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        chicken = new Chicken(3, "fight", date3, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        System.out.println("The age of the cows are -> "+ chicken.getAgeInMonths() + " months");
        System.out.println("farmAnimal is a "+ chicken.getClass());
        System.out.println("");
        
        pig = new Pig(1,"Berkshire", date1, "Juris");
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig(2, "Tamwoth", date1,"Santa Maria");
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        pig = new Pig(3,"Mangalica", date1,"Mi comisariato");
        farmAnimals.add(pig);
        System.out.println("pig -> " + pig);
        System.out.println("The age of the cows are -> "+ pig.getAgeInMonths() + " months");
        System.out.println("farmAnimal is a "+ pig.getClass());
        System.out.println("");
        
        cow = new Cow(1,"Angus", date2,"Vita");
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(2,"Limounsi", date2,"Nutri milk");
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        cow = new Cow(3,"Red Poll", date2,"La Lechera");
        farmAnimals.add(cow);
        System.out.println("cow -> " + cow);
        System.out.println("The age of the cows are -> " + cow.getAgeInMonths() + " months");
        System.out.println("farmAnimal is a "+ cow.getClass());
        System.out.println("");
        
        sheep = new Sheep(1, "Dorper", date3,"Merino");
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(2, "Priangan", date3, "Lincoln");
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        sheep = new Sheep(3,"Karakul", date3,"Corriedale");
        farmAnimals.add(sheep);
        System.out.println("sheep -> " + sheep);
        System.out.println("The age of the cows are -> "+ sheep.getAgeInMonths() + " months");
        System.out.println("farmAnimal is a "+ sheep.getClass());
        System.out.println("");
        
        
        System.out.println("My farm has -> "+ farmAnimals.size()+" animals");
        System.out.println("My FarmAnimals are ->"+ farmAnimals);
        
        
        
    }
    
}
