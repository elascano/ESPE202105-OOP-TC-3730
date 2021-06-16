/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.view;

import ec.edu.espe.constructor.model.Concessionaire; 
/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Constructor {
    public static void main (String[] args) {
        System.out.println("Hello From Concessionaire Object");
        
        Concessionaire concessionaire = new Concessionaire("Things", 1987, false);
        System.out.println(concessionaire);
    }
    
}
