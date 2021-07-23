/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculation.view;

import Utils.Operation;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Calculator {
        
         public static void main(String[] args) {
             
         
        float addend1 =  1.0F;
        float addend2 = 2.0F;
        
        float result;
        
        result = Operation.add(addend1, addend2);
        System.out.println("the addition of" + addend1 + " + " + addend2);
        
        float minued = 1.2F;
        float subtrahend = 1.0F;
        
        
        float difference ;
        
        difference = Operation.subtract(minued, subtrahend);
        System.out.println("The residue of" + addend1 + "-" + subtrahend + "-" + addend2);
        
        
        
         }
         
}
