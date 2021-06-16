/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrtizMarlon.constructor.view;

import OrtizMarlon.constructor.model.Country;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class ConstructorModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Marlon Ortiz");
        Country country= new Country("Ecuator","American","Spanish");
        
        System.out.println(country);
        
    }
    
 
    
}
