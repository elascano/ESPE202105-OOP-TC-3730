/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Tax {
 
     private static float ivaPercentage= 12.0F;
    
    
    public static float computerIva(float amount){
    
    float ivaValue = amount * ivaPercentage/100;
    return ivaValue;
  
    }
    
    public static float computerTotalPrice(float amount)
    {
    
    float totalPrice;
    totalPrice = amount + computerIva(amount);
    return totalPrice;
    
    }
    
}
