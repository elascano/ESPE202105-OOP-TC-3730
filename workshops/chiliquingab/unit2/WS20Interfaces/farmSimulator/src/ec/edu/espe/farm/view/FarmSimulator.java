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
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IAnimal iAnimal;
        
        System.out.println("\nDog");
        
        iAnimal = new DogController();
        iAnimal.makeSound(5);
        iAnimal.move(67, 43);
        iAnimal.eat(9.0F);
        
        System.out.println("\nCat");
        
        iAnimal = new CatController();
        iAnimal.makeSound(8);
        iAnimal.move(77, 43);
        iAnimal.eat(8.3F);
        
        System.out.println("\nShark");
        
        iAnimal = new SharkController();
        iAnimal.makeSound(6);
        iAnimal.move(11, 66);
        iAnimal.eat(4.4F);

    }

}
