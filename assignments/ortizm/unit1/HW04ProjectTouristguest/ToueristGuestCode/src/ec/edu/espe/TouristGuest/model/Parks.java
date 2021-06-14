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
public class Parks {
    private String name;
    private int yearsold;
    private ArrayList<Parks> listParks;
    
     public String getinfo2(){
        String m= "";
        m += "\n Info of "+ this.getName() + ":";
        m +="\n Parks"+ this.listParks;
       
        
        
      for(Parks parks : this.getListParks()) {
            
            m +="\n\t"+parks.getName();
        }
        return m;
    
    }

    public Parks(String name, int yearsold) {
        this.name = name;
        this.yearsold = yearsold;
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
     * @return the yearsold
     */
    public int getYearsold() {
        return yearsold;
    }

    /**
     * @param yearsold the yearsold to set
     */
    public void setYearsold(int yearsold) {
        this.yearsold = yearsold;
    }

    /**
     * @return the listParks
     */
    public ArrayList<Parks> getListParks() {
        return listParks;
    }

    /**
     * @param listParks the listParks to set
     */
    public void setListParks(ArrayList<Parks> listParks) {
        this.listParks = listParks;
    }
    
    
}
