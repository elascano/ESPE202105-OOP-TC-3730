/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.controller.CatController;
import ec.edu.espe.farm.controller.DogController;
import ec.edu.espe.farm.controller.IAnimal;
import ec.edu.espe.farm.controller.SharkController;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class FarmSimulator {
    public static void main(String[] args) {
        
        IAnimal iAnimal;
        
        iAnimal = new DogController();
        iAnimal.makeSound(5);
        iAnimal.eat(3.5F);
        iAnimal.move(67, 23);
        
        iAnimal = new CatController();
        iAnimal.makeSound(10);
        iAnimal.eat(6F);
        iAnimal.move(12, 24);
        
        iAnimal = new SharkController();
        iAnimal.makeSound(7);
        iAnimal.eat(19F);
        iAnimal.move(25, 75);
    }
 
}
