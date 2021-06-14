/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07constructions;

import ec.edu.espe.constructors.model.*;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class WS07Constructions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Printer printer = new Printer();
        
        
        System.out.println("Hello From Constructors" + "Gabriel Aguirre");
        
        printer.setMarc("EPSON");
        printer.setModel("L395");
        printer.setColor("Black");
        printer.setMaterial("plastic");
        printer.setWeight(4.2F);
        
        
        
    }
    
}
