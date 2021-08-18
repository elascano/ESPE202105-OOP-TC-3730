/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.Tax;



/**
 *
 * @author Camilo Ponce  PROGRAM BUILDER ESPE-DCCO
 */
public class Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("TAXES LIBRARY - Erick Oña");
        float amount = 10.0F;
        float ivaPercentage = 12.0F;
        float ivaAmount = 0.0F;
        float totalPrice = 0.0F;
        //TODO input by keyboard
        
        Tax tax = new Tax();
        
        ivaAmount = Tax.computeIva(amount);
        
        totalPrice = Tax.computeTotalPrice(amount);
        
        System.out.println(amount + "<- is ->" 
                + totalPrice + ", this price includes IVA" );
        
      
                
    }
    
}
