/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Tax {
    private static float ivaPercentaje = 12.0F;
    
    public static float  computeIva(float amount) {
    float ivaValue= amount * ivaPercentaje/100;
    return ivaValue;
    
    }
    
     public static float computerTotalPrice(float amount){
         float totalPrice;
        totalPrice= amount + computeIva(amount);
        return totalPrice;
     
     }
}

    


