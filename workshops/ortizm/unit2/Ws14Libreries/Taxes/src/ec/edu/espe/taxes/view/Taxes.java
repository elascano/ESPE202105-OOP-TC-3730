/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.Tax;



/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float amount = 10.0F;
        float ivaPorcentaje = 12.0F;
        float ivaAmount = 0.0F;
        float totalPrice= 0.0F;
        //Todo impuoy keyboard
        
  
        
        ivaAmount= Tax.computeIva(amount);
        
        totalPrice= Tax.computerTotalPrice(amount);
        
        System.out.println("The total price of  " + amount + "<- is ->"
                + totalPrice + "this prices includes IVA");
        
        
        
    }
    
    
}
