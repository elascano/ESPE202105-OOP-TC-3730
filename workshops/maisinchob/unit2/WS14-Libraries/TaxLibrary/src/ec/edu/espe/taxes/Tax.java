/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Tax {
    private static float ivaPorcentage=12.0F;
      
    public static float computeIva(float amount){
        float ivaValue =amount * ivaPorcentage/100;
        return ivaValue;
    }
    public static float computeTotalPrice(float amount){
        float totalPrice;
        totalPrice =amount + computeIva(amount);
        return totalPrice;
    }
}
