/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.controller;

import ec.edu.espe.farm.model.*;


/**
 *
 *  @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public interface IAnimal {
    public Sound makeSound(int time);
    public void eat(float amount);
    public Location move(int dx, int dy);
    
}
