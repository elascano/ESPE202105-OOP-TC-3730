/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Operation {
    public static double add (double addend1, double addend2){
        double sum;
        sum = addend1 + addend2;
        int digitos = 10;
        double result;
        result = sum*Math.pow(10, digitos);
        result = Math.round(result);
        result = result/Math.pow(10, digitos);
        return result;
        
        
    }
    public static double subtract(double minuend, double subtrahend){
        double difference;
        difference = minuend - subtrahend;
        int digitos = 10;
        double result;
        result = difference*Math.pow(10, digitos);
        result = Math.round(result);
        result = result/Math.pow(10, digitos);
        return result;
    }
}
