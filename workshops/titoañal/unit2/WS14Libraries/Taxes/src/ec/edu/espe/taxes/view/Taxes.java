/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.Tax;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float amount = 10.0F;
        float ivaPercentage = 12.0F;
        float ivaAmount = 0.0F;
        float totalPrice = 0.0F;
        
        ivaAmount = Tax.computeIva(amount);
        
        totalPrice =Tax.computeTotalPrice(amount);
        
        System.out.println("the total price of →" + amount + " ← is → "
                + totalPrice + ", this prices includes IVA");
       
    }
    
}
