/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuide.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Citys {
    private String name;
    private String country;
    private String pasword;
    private ArrayList<Ticket> tickets;

    public Citys(String name, String country, String pasword, ArrayList<Ticket> tickets) {
        this.name = name;
        this.country = country;
        this.pasword = pasword;
        this.tickets = tickets;
    }

    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the pasword
     */
    public String getPasword() {
        return pasword;
    }

    /**
     * @param pasword the pasword to set
     */
    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    /**
     * @return the tickets
     */
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    /**
     * @param tickets the tickets to set
     */
    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    
    
    
}
