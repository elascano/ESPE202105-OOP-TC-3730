/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fatm.controller;

import ec.edu.espe.fatm.model.Location;
import ec.edu.espe.fatm.model.Sound;

/**
 *
 * @author Jean Jaramillo
 */
public interface IAnimal {
    
    public Sound makeSound(int time);
    
    public void eat(float amount);
    
    public Location move(float dx, float dy);
    

 
}
