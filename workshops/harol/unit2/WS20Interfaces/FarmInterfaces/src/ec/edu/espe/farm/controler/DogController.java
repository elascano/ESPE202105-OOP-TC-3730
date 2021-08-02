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
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class DogController implements IAnimal{
  @Override  
  public Sound makeSoun(int time){
      Sound sound = new Sound();
      System.out.println(" barking for "+time+"secodn");
      return sound;
  }
  @Override  
    public void eadt(float amount){
       System.out.println(" dog esting "+amount+ "places"); 
    }
    @Override  
    public Location move(int dx,int dy){
     Location location = new Location(dx,dy);
        System.out.println(" the dog is walking to "+dx + " , "+dy + " , ");
        return location;
    } 
}
