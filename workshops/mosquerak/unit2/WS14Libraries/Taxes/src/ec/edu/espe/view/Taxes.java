/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.taxes.Tax;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("TAXES LIBRARY - Kerly Mosquera");
       float amount = 10.0F;
       float ivaPercentage =12.0F;
       float ivaAmount = 0.0F;
       float totalPrice = 0.0F;
       
       ivaAmount = Tax.computeIva(amount);
       
       totalPrice =Tax.computarTotalPrice(amount);
       
       System.out.println("the total proce of -"+ amount + "- is -" + totalPrice + " this princes includes IVA");
    }
    
}
