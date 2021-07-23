/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.controller.CatController;
import ec.edu.espe.farmsimulator.controller.DogController;
import ec.edu.espe.farmsimulator.controller.IAnimal;
import ec.edu.espe.farmsimulator.controller.SharkController;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("LILIAN IZA - NRC 3730 ");
      IAnimal iAnimal ;
      iAnimal = new DogController();
      iAnimal.makeSound(5);
      iAnimal.eat(3.5F);
      iAnimal.move(70, 25);
      
      iAnimal = new CatController();
      iAnimal.makeSound(4);
      iAnimal.eat(3.5F);
      iAnimal.move(70, 25);
      
      
      iAnimal = new SharkController();
      iAnimal.makeSound(0);
      iAnimal.eat(3.5F);
      iAnimal.move(70, 25);
    }
    
}
