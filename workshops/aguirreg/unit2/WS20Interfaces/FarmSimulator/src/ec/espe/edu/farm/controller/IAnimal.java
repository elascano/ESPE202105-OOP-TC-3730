/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.controller;

import ec.espe.edu.farm.model.Location;
import ec.espe.edu.farm.model.Sound;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public interface IAnimal {
    public Sound makeSound(int time);
    public void eat(float amount);
    public Location move(int dx, int dy);
    
}
