/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.view;

import utils.Operation;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        
        float minuend = 3.0F;
        float subtrahend = 4.0F;
       
        float result;
        float result1;
        
        result = Operation.add(addend1, addend2);
        result1 = Operation.subtract(minuend, subtrahend);
        
        System.out.println("The addition of " + addend1 + " + " + addend2 + " is " + result);
        System.out.println("The difference of " + minuend + " - " + subtrahend + " is " + result1);
        
    }
    
}