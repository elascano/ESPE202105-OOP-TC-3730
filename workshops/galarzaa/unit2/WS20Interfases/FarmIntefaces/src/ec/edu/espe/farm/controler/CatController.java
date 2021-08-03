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
public class CatController implements IAnimal{
    @Override  
  public Sound makeSoun(int time){
      Sound sound = new Sound();
      System.out.println(" Meaw for "+time +"secodn");
      return sound;
  }
  @Override  
    public void eadt(float amount){
       System.out.println(" cat is esting "+amount + "chicken"); 
    }
    @Override  
    public Location move(int dx,int dy){
     Location location = new Location(dx,dy);
        System.out.println(" the cat jumps to "+dx + " , "+dy + " , ");
        return location;
    }   
}
