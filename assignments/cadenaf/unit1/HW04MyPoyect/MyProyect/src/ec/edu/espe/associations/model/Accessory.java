/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;
import java.util.TouchScreens;
import java.util.Alarm;
import java.util.DoorSecurity; 
/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Accessory {
    private String technology; 
    private TouchScreens touchScreens; 
    private Alarm alarm;
    private DoorSecurity doorSecurity; 
    
    public TouchScreens custom(TouchScreens touchScreens){
        
        return new TouchScreens();  
        
    }
    
    public Alarm custom(Alarm alarm){
        
        return new Alarm(); 
    }
    
    public DoorSecurity custom(DoorSecurity doorSecurrity){
        
        return new DoorSecurity();
    }
    
}
