/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class ChickenSystem {
    public static void main(String[] args){
    Chicken chicken;
    
    int id =0;
    String name;
    String color;
    Date age;
    Date bornOn;
    boolean molting = false;
    int eggCounter;
    //TODO reading from keyboard
    id = 0;
    name= "lucy";
    color="white";
    age = new Date();
    bornOn = new Date();
    eggCounter = 0;
    chicken = new Chicken(id, name, color, age, bornOn, molting);
    System.out.println("chiken->"+ chicken);
    
    }
    
}
