/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.edu.espe.farsimulator.controller.CatController;
import ec.edu.espe.farsimulator.controller.DogController;
import ec.edu.espe.farsimulator.controller.IAnimal;
import ec.edu.espe.farsimulator.controller.SharkController;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class FarmSimulator {
    
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
        
        iAnimal = (IAnimal) new SharkController();
        iAnimal.makeSound(5);
        iAnimal.eat(3.5F);
        iAnimal.move(67, 23);
    }
    
}
