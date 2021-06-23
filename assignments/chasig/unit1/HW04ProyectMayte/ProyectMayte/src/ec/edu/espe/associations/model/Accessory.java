/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;
import java.util.FloorMats; 
import java.util.Vinyls;
import java.util.Illumination; 
 
 /* @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Accessory {
   
    private FloorMats  floorMats;
    private Vinyls vinils;
    private Illumination illumination;
    
    public void view(){
    }
    public FloorMats custom(FloorMats floorMats){
        return new FloorMats();
    } 
     public Vinyls custom(Vinyls viniyls){
         return new Vinyls();
     }
     public Illumination custom(Illumination illumination) {
         return new Illumination();
     }
    
}
