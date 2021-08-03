/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.view;

import ultils.Operation;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float addend1 = 1.0F;
         float addend2 = 2.0F;
        
         float result;
         
         result = Operation.add(addend1,addend2);
         System.out.println("the addition of" + addend1 + " + "  + addend2 +" ");
        
    }
    
}
