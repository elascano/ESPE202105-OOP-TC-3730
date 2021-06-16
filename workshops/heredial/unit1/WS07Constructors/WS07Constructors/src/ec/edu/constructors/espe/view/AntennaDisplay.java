/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.constructors.espe.view;

import ec.edu.constructors.espe.model.Antenna;




/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class AntennaDisplay {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    System.out.println("Hello Wellcome to Antenna\n" + "Luis Alberto Heredia Iza");
    
    Antenna antenna = new Antenna("Ubiquiti Spain", "Parabolic", 1745, true, 'A');    

    System.out.println(antenna);
            

    }
    
}
