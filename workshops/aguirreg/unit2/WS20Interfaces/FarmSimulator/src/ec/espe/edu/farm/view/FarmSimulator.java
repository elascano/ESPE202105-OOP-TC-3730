/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.controller.CatController;
import ec.espe.edu.farm.controller.DogController;
import ec.espe.edu.farm.controller.IAnimal;
import ec.espe.edu.farm.controller.SharkController;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
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
        iAnimal.makeSound(12);
        iAnimal.eat(5.6F);
        iAnimal.move(56, 43);
        
        iAnimal = new SharkController();
        iAnimal.makeSound(7);
        iAnimal.eat(1.9F);
        iAnimal.move(88, 12);
        
    }
    
}
