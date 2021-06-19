/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;
import java.util.Seat;
import java.util.Fuel;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Car {
   private Tire tire;
   private Float speed;
   private String model;
   private Seat seats;
   private Fuel fuel;
   private int numberofmirrors; 
   private int type;
   private Accessory accessory;
   
   public void view(){ 
} 
   public int view(int type){
       
       return 0;
  
   }
   
   public Accessory custom(Accessory accessory){
       return new Accessory(); 
   }
      
}
