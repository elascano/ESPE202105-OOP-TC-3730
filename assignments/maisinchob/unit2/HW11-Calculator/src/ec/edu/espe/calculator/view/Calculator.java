/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.view;

import utils.Operation;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        
        float result;
        
        //subtraction of floating operations
        float minuend = 4.0F;
        float subtraend = 6.2F;
        float difference;
        result = Operation.add(addend1, addend2);
        System.out.println("the addition of " + addend1 + " + " + addend2);
        
        difference = Operation.subtract(minuend, subtraend);
        System.out.println("the difference of " + minuend + "-" + subtraend);
    }
    
}
