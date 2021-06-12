/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.Agency;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class TravelAgency {
    public static void main(String[] args) {
        Agency a = new Agency();
        a.setWorkers();
        System.out.println("a.workers ->"+ a.getWorkers() );
        
        System.out.println("From Class Diagram to Code, \n"
        + "Bryan Maisincho ");
    }
}
