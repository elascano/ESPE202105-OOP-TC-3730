/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.kitchen.view;
import ec.edu.espe.kitchen.model.*;
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class Constructor {
    public static void main(String [] args){
        
        
        Kitchen kitchen = new Kitchen("induction","white","Whirlpool");
        System.out.println(kitchen);
        
         System.out.println("WS07 - Constructor, \n"
                        + "Jennifer Beltran");
      
    }
    
}
