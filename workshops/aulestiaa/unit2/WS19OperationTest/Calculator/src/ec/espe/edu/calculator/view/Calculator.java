/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.calculator.view;

import utils.Operation;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class Calculator {
    public static void main(String[] args) {
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        
        float result;
        
        result = Operation.add(addend1, addend2);
        System.out.println("the addition of " + addend1 + " + " + addend2 + " = " + result);
    }
}
