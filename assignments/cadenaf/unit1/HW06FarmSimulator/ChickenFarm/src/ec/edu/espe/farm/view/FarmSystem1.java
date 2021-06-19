/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken1;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class FarmSystem1 {
    public static void main(String[] args){
    int Chicken1Id;
    String name;
    String color;
    Date date = new Date();
    boolean molting;
    Arraylist<Chicken1> chicken1 = new ArrayList<>();
    Chicken1 chicken1Array[] = new Chicken1[5];
    
    //emput by keyboard
    Chicken1Id = 1;
    name = "Francisca";
    color = "Black";
    boolean isMolting = true;
    
    Chicken1 chicken1 = new Chicken1());
    System.out.println("Chicken1 object -> " + chicken1);
        int chicken1Id = 0;
     
    chicken1 = new Chicken1(chicken1Id, name, color, date, ismolting);
    System.out.println("chicken1 object -> " + chicken1);
    
    Chicken1 chicken12 = new chicken1(2, "Ana", "Pink", new Date(), false);
    System.out.println("chicken12 object ->" + chicken12);
     
    chicken1.add(chicken1);
    chicken.add(chicken12);
    
    System.out.println("chicken1 -> " + chicken1);
        String[] chicken1Array;
    
    chicken1Array[0] = chicken; 
    
    System.out.println("chichen1Array ->" + chicken1Array[0]);
}
}