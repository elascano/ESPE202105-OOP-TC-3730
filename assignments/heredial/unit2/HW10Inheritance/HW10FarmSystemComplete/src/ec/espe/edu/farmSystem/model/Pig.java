/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farmSystem.model;



/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Pig extends FarmAnimal{

    public Pig(int id, String breed, int day, int month, int year) {
        super(id, breed, day, month, year);
    }

      
    @Override
    public String toString() {
        return "Pig{" + super.toString()+ '}';
        
    }
    
    
    
    
    
}
