/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.Shoes;


/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class W07Constructions {
    public static void main(String[] args) {
        
        System.out.println("CRISTOPHER SARMIENTO");
        System.out.println("Constructor From Shoes");
        
        
        Shoes shoes = new Shoes();
        
        
        shoes.setColor("Brown");
        shoes.setSize(40);
        shoes.setMaterial("Cuero");
        
        
        System.out.println("shoes -> " + shoes);
    }
    
}
