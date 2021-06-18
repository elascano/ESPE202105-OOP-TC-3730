/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;
import java.util.Motor;
/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Car {
    private Accessory accessory;
    private Motor motor;
    private String technology;
    private int sizeOfTheCar;
    private int size;
    
    public void price(){
        
    }
    
    public int view(int sizeOfTheCar){
        
        return 0;  
    }
    
    public Accessory custom(Accessory accessory){
        
        return new Accessory();
    }
    
}
