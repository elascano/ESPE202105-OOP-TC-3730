/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.controller.*;
import ec.edu.espe.farm.controller.IAnimal;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IAnimal iAnimal;
        
        iAnimal = new DogController();
        iAnimal.makeSound(5);
        iAnimal.eat((float) 3.5);
        iAnimal.move(67, 23);
        
        iAnimal = new CatController();
        iAnimal.makeSound(5);
        iAnimal.eat((float) 3.5);
        iAnimal.move(67, 23);
        
        iAnimal = new SharkController();
        iAnimal.makeSound(5);
        iAnimal.eat((float) 3.5);
        iAnimal.move(67, 23);
        
        
        
        
    }
    
}
