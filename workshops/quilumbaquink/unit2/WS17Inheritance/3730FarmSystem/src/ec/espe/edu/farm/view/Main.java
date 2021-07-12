package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.Cow;
import ec.espe.edu.farm.model.FarmAnimal;
import ec.espe.edu.farm.model.Pig;
import ec.espe.edu.farm.model.Sheep;
import java.util.ArrayList;
import java.util.Date;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Date date=new Date();
        farmAnimal=new FarmAnimal(0, "german shephard", date);
        System.out.println("Farm Animal -> "+farmAnimal);
        date=new Date(2021,1,20);
        ArrayList <FarmAnimal> farmAnimals=new ArrayList<>();
        ArrayList <Chicken> chickens=new ArrayList<>();
        ArrayList <Cow> cows=new ArrayList<>();
        ArrayList <Pig> pigs=new ArrayList<>();
        ArrayList <Sheep> sheeps=new ArrayList<>();
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal is a  "+ farmAnimal.getClass());
        
        farmAnimal=new Chicken(0, "Criolla", date, true);
        System.out.println("farmAnimal -> "+ farmAnimal);
        
        System.out.println("farmAnimal is a  "+ farmAnimal.getClass());
        
        
        Chicken chicken=new Chicken(2, "aguarico", date,true);
        System.out.println("chicken -> " + chicken);
        chickens.add(chicken);
        
        System.out.println("chicken is a " + chicken.getClass());
        System.out.println("the age is -> " + chicken.getAgeInMonths());
        
        farmAnimals.add(chicken);
        Chicken chicken1=new Chicken(0, "Orpington", date,false);
        System.out.println("chicken -> " + chicken1);
        Chicken chicken2=new Chicken(1, "plymouth", date,true);
        System.out.println("chicken -> " + chicken);
        chickens.add(chicken1);
        chickens.add(chicken2);
        farmAnimals.add(chicken1);
        farmAnimals.add(chicken2);
        
        //System.out.println("My farm has -> " + farmAnimals.size() + "animals");
        //System.out.println("My FarmAnimals are -> " + farmAnimals);
        
        
        Cow cow=new Cow(0, "angus", date,4);
        System.out.println("cow -> " + cow);
        Cow cow1=new Cow(1, "holstein", date,5);
        System.out.println("cow -> " + cow1);
        Cow cow2=new Cow(2, "hereford", date,6);
        System.out.println("cow -> " + cow2);
        cows.add(cow);
        cows.add(cow1);
        cows.add(cow2);
        farmAnimals.add(cow);
        farmAnimals.add(cow1);
        farmAnimals.add(cow2);
        System.out.println("My cows has -> " + cows.size());
        
        Pig pig=new Pig(0, "duroc", date, 36 );
        System.out.println("pig -> " + pig);
        Pig pig1=new Pig(1, "yorkshire", date, 45 );
        System.out.println("pig -> " + pig1);
        Pig pig2=new Pig(2, "pietrain", date, 26 );
        System.out.println("pig -> " + pig2);
        pigs.add(pig);
        pigs.add(pig1);
        pigs.add(pig2);
        farmAnimals.add(pig);
        farmAnimals.add(pig1);
        farmAnimals.add(pig2);
        System.out.println("My pigs has -> " + pigs.size());
        
        Sheep sheep=new Sheep(0, "dorper", date, "white" );
        System.out.println("sheep -> " + sheep);
        Sheep sheep1=new Sheep(1, "merina", date, "brown" );
        System.out.println("sheep -> " + sheep1);
        Sheep sheep2=new Sheep(2, "suffolk", date, "white and black" );
        System.out.println("sheep -> " + sheep2);
        sheeps.add(sheep);
        sheeps.add(sheep1);
        sheeps.add(sheep2);
        farmAnimals.add(sheep);
        farmAnimals.add(sheep1);
        farmAnimals.add(sheep2);
        System.out.println("My sheeps has -> " + sheeps.size());
        
        System.out.println("My farm has -> " + farmAnimals.size() + "animals");
        System.out.println("My FarmAnimals are -> " + farmAnimals);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
