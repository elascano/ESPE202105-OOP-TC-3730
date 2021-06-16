/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.view;

import ec.edu.espe.constructor.model.Resistor;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class Constructor {
    public static void main(String[] args) {
        
        System.out.println("ObjectResistor"+"SolangeTupiza");
        Resistor resistor = new Resistor("Resistor", "Windings", 1);
        System.out.println(resistor);
      
    }
    
}

