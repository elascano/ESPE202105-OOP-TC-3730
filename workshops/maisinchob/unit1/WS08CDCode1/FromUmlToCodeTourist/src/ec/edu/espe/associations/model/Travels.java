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
    private Destinations[]destinations = new Destinations[40];
    private Transports[]transports = new Transports[3];
    private int tickets;

    @Override
    public String toString() {
        return "Travels{" + "destinations=" + destinations + ", transports=" + transports + ", tickets=" + tickets + '}';
    }
   
    public void  costclassifications(){ 
   }
   
   public void updatedocuments(){
       
   }
   public void recommendeddestinations(){
       
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
     * @return the transports
     */
    public Transports[] getTransports() {
        return transports;
    }

    /**
     * @param transports the transports to set
     */
    public void setTransports(Transports[] transports) {
        this.transports = transports;
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