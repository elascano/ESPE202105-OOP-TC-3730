/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.controller;

import ec.edu.espe.farsimulator.model.Location;
import ec.edu.espe.farsimulator.model.Sound;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public interface IAnimal {
    
    public Sound makeSound(int time);
    public void eat(float amount);
    public Location move(int x, int y);

    
}
