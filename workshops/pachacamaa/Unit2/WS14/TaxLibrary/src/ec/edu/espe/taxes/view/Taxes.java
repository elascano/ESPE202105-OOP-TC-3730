/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;
import utils.Tax;

/**
 *

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
public class Taxes {
    public static void main(String[] args) {
        System.out.println("\t TAXES LIBRARY \n"
                + "Anlexander Pachacama");
        
        float amount =10.0F;
        float ivaPercentage = 12.0F;
        float ivaAmount = 0.0F;
        float totalPrice = 0.0F;
    
        ivaAmount = Tax.computeIva (amount);
        
        totalPrice = Tax.computeTotalPrice(amount);
        
        System.out.println("The total price of->" + amount + "<- is ->" + totalPrice + ", this prices includes IVA");   
    }
}
