/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxes;

import ec.edu.espe.taxes.Tax;



/**
 *
 * @author Jean Jaramillo
 */
public class Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("TAXES LIBRARY - JEAN CARLOS JARAMILLO");
        float amount = 10.0F;
        float ivaPercentage = 12.0F;
        float ivaAmount = 0.0F;
        float totalPrice = 0.0F;
        //IMPUT BY KEYBOARD
        
        ivaAmount = Tax.computeIVA(amount);
        totalPrice = Tax.computeTotalPrice(amount);
        System.out.println("the total price of ->" + amount + "<- is -> " 
                + totalPrice + "This price include IVA");
        
        
        
        
    }
    
}
