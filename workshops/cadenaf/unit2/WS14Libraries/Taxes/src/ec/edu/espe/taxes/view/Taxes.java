/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.Tax;


/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("TAXES LIBRARY -> Fernanda Cadena"); 
        float amount = 10.0F;
        float ivaPercentage = 12.0F; 
        float ivaAmount = 0.0F;
        float totalPrice = 0.0F;
        //TODO imput by keyboard
        
        ivaAmount = Tax.computeIva(amount);
        totalPrice=amount + ivaAmount; 
        
        System.out.println("the total price of -> " + amount + " <- ls ->"
                + totalPrice + ", this prices includes IVA");
        
        
    }
    
}
