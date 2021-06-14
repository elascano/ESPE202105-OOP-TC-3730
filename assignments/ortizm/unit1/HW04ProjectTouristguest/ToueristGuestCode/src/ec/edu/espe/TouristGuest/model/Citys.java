/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.model;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Citys {
    private String name;
 
    public Citys(String name, int numberofuniversity, int numberofmuseum) {
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
    
    
}
