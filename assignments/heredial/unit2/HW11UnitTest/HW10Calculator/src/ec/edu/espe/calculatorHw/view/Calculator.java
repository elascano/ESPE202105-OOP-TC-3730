/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatorHw.view;
import java.text.DecimalFormat;
import utils.Operations;
/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Calculator {
    
    static DecimalFormat df = new DecimalFormat("#0.00");
    
     public static void main(String[] args) {
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        
        float result;
        
        result = Operations.add(addend1, addend2);
        
         System.out.println("The addition of " + addend1 + " + " + addend2 + " = " + df.format(result));
         
        float minued = 1.2F;   
        float subtrahend = 1.0F;
        
        float difference;
        
        difference = Operations.substrat(minued, subtrahend);
         System.out.println("The residue of " + minued + " - " + subtrahend + " = " + df.format(difference));

         
     }
}