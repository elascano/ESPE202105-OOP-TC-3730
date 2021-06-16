/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.view;

import ec.edu.espe.constructor.model.Chair;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Constructor {
public static void main (String [] args){
    System.out.println("CONSTRUCTOR OBJECT= CHAIR  ");
    Chair chair = new Chair("Chestnut","padded",50);
    System.out.println(chair);
    }
}
