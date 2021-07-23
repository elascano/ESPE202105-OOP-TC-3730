/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.view;

import utils.Operation;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class HW10Calculator {
    public static void main(String[] args) {
        

        
        float addend1 =  1.2F;
        float addend2 = 3.4F;
        float resultSum;

        resultSum = Operation.add(addend1, addend2);
        System.out.println("the addition of \n" + addend1 + " + " + addend2 + "=" + resultSum);
       
        
        float minuend =  1.8F;
        float subtrahend = 3.07F;
        float resultDif ;

        
        resultDif = Operation.subtract(minuend, subtrahend );
        System.out.println("the  difference of \n " + minuend + " - " + subtrahend + "=" + resultDif);
      
    
        
    }
    
}
