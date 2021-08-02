/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.view;

import utils.Operation;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double addend1 = 1.0;
       double addend2 = 2.0;
       
       double result2;
        
       double result;
        
        result = Operation.add(addend1, addend2);
        System.out.println (" The addition of " + addend1 + " + " + addend2 + " = " + result  );
        result2 = Operation.subtract(addend2, addend2);
        
       
    }
    
}
