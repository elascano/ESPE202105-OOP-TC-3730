/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import ec.edu.associations.model.WashingMachine;



/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Constructor {
    public static void main(String[] args) {
        System.out.println ("Constructors Example (WashingMachine), \n"
            + "Alina Villavicencio");
        WashingMachine washingMachine = new WashingMachine("Blue","LG",10);
          
     System.out.println(washingMachine);
    }
}
