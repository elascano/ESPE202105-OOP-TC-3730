/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Operation {

    public static double add(double addend1, double addend2) {
        double sum;
        int digitos = 10;
        sum = addend1 + addend2;
        double resultado;
        resultado = sum * Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado / Math.pow(10, digitos);
        return resultado;
    }

    public static double subtract(double minuend, double subtrahend) {
        double difference;
        int digitos = 10;
        difference = minuend - subtrahend;
        double resultado;
        resultado = difference * Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado / Math.pow(10, digitos);
        return resultado;
    }

}
