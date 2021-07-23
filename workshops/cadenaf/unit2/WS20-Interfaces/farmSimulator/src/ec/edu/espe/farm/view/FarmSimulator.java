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
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
    iAnimal.eat(0.5F);
    iAnimal.move(67, 23);

}
}
