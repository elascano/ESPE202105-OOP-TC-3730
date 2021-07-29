/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.controler.CatController;
import ec.edu.espe.farm.controler.DogController;
import ec.edu.espe.farm.controler.IAnimal;
import ec.edu.espe.farm.controler.SharkController;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class FarmIntefaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IAnimal iAnimal;

        iAnimal = new DogController();
        iAnimal.makeSoun(5);
        iAnimal.eadt(3.5F);
        iAnimal.move(67, 23);

        iAnimal = new CatController();
        iAnimal.makeSoun(5);
        iAnimal.eadt(3.5F);
        iAnimal.move(67, 23);

        iAnimal = new SharkController();
        iAnimal.makeSoun(5);
        iAnimal.eadt(3.5F);
        iAnimal.move(67, 23);
    }

}
