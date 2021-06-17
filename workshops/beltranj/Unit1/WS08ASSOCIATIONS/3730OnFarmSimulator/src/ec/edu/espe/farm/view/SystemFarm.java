/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;
import java.util.Date;
import ec.edu.espe.farm.model.Chicken;
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemFarm {
    public static void main(String[] args ){
        Chicken chicken;
          int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        id=0;
        name ="Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter =0;
 
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chicken ->"+ chicken);
        
        Chicken chickens[] = new Chicken[10];
        
        chickens[0] = chicken;
        chickens [1] = new Chicken(1, "Maruja", "black", age, bornOn, false);
     
        System.out.println("WS08 - Associations, \n"
                        + "Jennifer Beltran");
    }

 
}
