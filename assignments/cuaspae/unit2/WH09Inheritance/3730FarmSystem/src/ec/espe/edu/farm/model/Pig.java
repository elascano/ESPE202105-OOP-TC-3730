/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Pig extends FarmAnimal{
    public Pig(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public String toString() {
        return "Pig{" + super.toString() + '}' + "\n";
    }
}
