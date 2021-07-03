/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.Tax;

/**
 *
    public static void main(String[] args) {
        
        System.out.println("TAXES LIBRARY - ELIANA CUASPA");
        float amount = 10.0F;
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Taxes {

    public static void main(String[] args) {
        
        System.out.println("TAXES LIBRARY - ELIANA CUASPA");
        float amount = 10.0F;
        float ivaPercentage = 12.0F;
        float ivaAmount = 0.0F;
        float totalPrice = 0.0F;
        //TODO input by keyboard
        
        
        ivaAmount = Tax.computeIva(amount);        
        totalPrice =Tax.computeTotalPrice(amount);
        
        System.out.println("the total price of -->" + amount + "<-- is -->"
        + totalPrice + ", this price includes IVA");
                

    }
    
}
