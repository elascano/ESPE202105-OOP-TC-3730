/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

import java.util.Destinations;
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Travels {
    private Destinations[]destinations = new Destinations[20];
    private int tickets;
   public void  costclassifications(){ 
   }

    /**
     * @return the destinations
     */
    public Destinations[] getDestinations() {
        return destinations;
    }

    /**
     * @param destinations the destinations to set
     */
    public void setDestinations(Destinations[] destinations) {
        this.destinations = destinations;
    }

    /**
     * @return the tickets
     */
    public int getTickets() {
        return tickets;
    }

    /**
     * @param tickets the tickets to set
     */
    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}
