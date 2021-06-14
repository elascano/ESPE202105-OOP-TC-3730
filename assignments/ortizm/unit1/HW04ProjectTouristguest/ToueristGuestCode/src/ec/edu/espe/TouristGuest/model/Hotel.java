/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Hotel {
     private String name;
     private ArrayList<Hotel> listHotel;
     
      public String getinfo1(){
        String m= "";
        m += "\n Info of "+ this.getName() + ":";
        m +="\n Hotel"+ this.getListHotel();
       
        
        
      for(Hotel Hotel : this.getListHotel()) {
            
            m +="\n\t"+Hotel.getName();
        }
        return m;
    
    }

    public Hotel(String name) {
        this.name = name;
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
     * @return the listHotel
     */
    public ArrayList<Hotel> getListHotel() {
        return listHotel;
    }

    /**
     * @param listHotel the listHotel to set
     */
    public void setListHotel(ArrayList<Hotel> listHotel) {
        this.listHotel = listHotel;
    }
     
    
}
