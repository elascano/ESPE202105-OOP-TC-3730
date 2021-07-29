/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.controler;

import ec.edu.espe.farm.model.Location;
import ec.edu.espe.farm.model.Sound;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public interface IAnimal {
    public Sound makeSoun(int time);
    public void eadt(float amount);
    public Location move(int dx,int dy);
}
