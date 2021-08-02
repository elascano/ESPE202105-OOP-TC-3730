/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import ec.edu.espe.farm.controller.CatController;
import ec.edu.espe.farm.controller.DogController;
import ec.edu.espe.farm.controller.IAnimal;
import ec.edu.espe.farm.controller.SharkController;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IAnimal iAnimal;
        iAnimal= new DogController();
        iAnimal.makeSound(5);
        iAnimal.eat(3.5F);
        iAnimal.move(67,23);
        
        
        iAnimal= new CatController();
        iAnimal.makeSound(5);
        iAnimal.eat(3.5F);
        iAnimal.move(67,23);
        
        iAnimal= new SharkController();
        iAnimal.makeSound(5);
        iAnimal.eat(3.5F);
        iAnimal.move(67,23);
        
        
        
        
        
    }
    
}
