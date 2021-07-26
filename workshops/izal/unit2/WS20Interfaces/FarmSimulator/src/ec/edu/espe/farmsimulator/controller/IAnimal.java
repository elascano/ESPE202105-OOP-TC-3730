/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Location;
import ec.edu.espe.farmsimulator.model.Sound;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public interface IAnimal {
 public Sound makeSound(int time);
 public void eat(float amount);
 public Location move(int dx, int dy);

}
