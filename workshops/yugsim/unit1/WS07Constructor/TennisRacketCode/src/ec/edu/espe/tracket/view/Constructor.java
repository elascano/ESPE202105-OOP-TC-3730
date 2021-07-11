/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tracket.view;

import ec.edu.espe.tracket.model.TennisRacket;
/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class Constructor {
    public static void main(String[] args) {
        
        System.out.println("WS07Constructor, \n"
                        + "Pamela Yugsi");
        
        TennisRacket tennisRacket = new TennisRacket("Red and black", "Wood", "Butterfly");
        System.out.println(tennisRacket);
    }
}
