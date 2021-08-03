/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FarmSimulator.view;

import ec.edu.espe.FarmSimulator.controller.CatController;
import ec.edu.espe.FarmSimulator.controller.DogController;
import ec.edu.espe.FarmSimulator.controller.IAnimal;
import ec.edu.espe.FarmSimulator.controller.SharkController;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    IAnimal iAnimal;
    
    
    iAnimal = new DogController();
    iAnimal.makeSound(5);
    iAnimal.eat(3.5F);
    iAnimal.move(67, 23);
    
    iAnimal = new CatController();
    iAnimal.makeSound(5);
    iAnimal.eat(3.5F);
    iAnimal.move(67, 23);
    
    iAnimal = new SharkController();
    iAnimal.makeSound(5);
    iAnimal.eat(3.5F);
    iAnimal.move(67, 23);
    
    
    
    
    
    
    
    
    }
    
}
