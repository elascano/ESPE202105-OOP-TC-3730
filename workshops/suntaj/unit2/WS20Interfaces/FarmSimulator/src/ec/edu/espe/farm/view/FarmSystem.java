/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.controler.CatControler;
import ec.edu.espe.farm.controler.DogControler;
import ec.edu.espe.farm.controler.IAnimal;
import ec.edu.espe.farm.controler.SharkControler;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class FarmSystem {
    
    public static void main(String[] args) {
        
        IAnimal iAnimal;
        
        iAnimal = new DogControler();
        iAnimal.makeSound(5);
        iAnimal.eat(3.5F);
        iAnimal.move(67, 23);
        
        iAnimal = new CatControler();
        iAnimal.makeSound(5);
        iAnimal.eat(3.5F);
        iAnimal.move(67, 23);
        
        iAnimal = new SharkControler();
        iAnimal.makeSound(5);
        iAnimal.eat(3.5F);
        iAnimal.move(67, 23);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
