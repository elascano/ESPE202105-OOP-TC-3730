/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.view;

import ec.edu.espe.constructor.model.Dog;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Constructor {
    public static void main(String[] args) {
        System.out.println("Hello from Dog Object "
                + "Leslie Titoaña)");
        Dog dog = new Dog ("Argus", "black", 2);
        System.out.println(dog);  
    }

    
}
