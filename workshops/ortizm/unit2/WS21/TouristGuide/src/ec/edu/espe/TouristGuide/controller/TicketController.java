/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuide.controller;

import ec.edu.espe.TouristGuide.model.Ticket;

import ec.edu.espe.TouristGuide.view.FRMTicket;
import java.util.ArrayList;
import utils.DBManager;
import utils.PersistensInterface;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class TicketController {
    private Ticket ticket;
    private FRMTicket frmticket;
    private PersistensInterface persistence;
    
    
    public void add(Ticket ticket){
        persistence = new DBManager();
        //Todo convert a contact json;
        String CityJson= "{}";
        persistence.create(CityJson, "Citys");
        
    
    }
    
    public ArrayList<Ticket> find (String City){
    ArrayList<Ticket> tickets = new ArrayList();
    Ticket ticket= new Ticket(0, City);
    tickets.add(0, ticket);
   return tickets;
    }
    
    public boolean delete(String City){
    boolean deleted = false;
    ArrayList<Ticket> tickets = new ArrayList<>();
    tickets= find(City);
    return deleted;
    }

    public TicketController(Ticket ticket, FRMTicket frmticket) {
        this.ticket = ticket;
        this.frmticket = frmticket;
    }

   
    /**
     * @return the ticket
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the frmticket
     */
    public FRMTicket getFrmticket() {
        return frmticket;
    }

    /**
     * @param frmticket the frmticket to set
     */
    public void setFrmticket(FRMTicket frmticket) {
        this.frmticket = frmticket;
    }
    
    
    
    
}
