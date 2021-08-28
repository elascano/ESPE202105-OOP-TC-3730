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
public class City {
    private String name;
    private int numberOfUniversity;
    private int numberOfMuseum;

    public City(String name, int numberofuniversity, int numberofmuseum) {
        this.name = name;
        this.numberOfUniversity = numberofuniversity;
        this.numberOfMuseum = numberofmuseum;
    }
 

     public String getinfocity(){
        String n= "";
        n += "\n Info of "+ this.getName() + ":";
        n +="\n number of universitys: "+ this.getNumberOfUniversity() ;
        n +="\n number of museum : "+ this.getNumberOfMuseum();
        return n; 
 
    
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
     * @return the numberOfUniversity
     */
    public int getNumberOfUniversity() {
        return numberOfUniversity;
    }

    /**
     * @param numberOfUniversity the numberOfUniversity to set
     */
    public void setNumberOfUniversity(int numberOfUniversity) {
        this.numberOfUniversity = numberOfUniversity;
    }

    /**
     * @return the numberOfMuseum
     */
    public int getNumberOfMuseum() {
        return numberOfMuseum;
    }

    /**
     * @param numberOfMuseum the numberOfMuseum to set
     */
    public void setNumberOfMuseum(int numberOfMuseum) {
        this.numberOfMuseum = numberOfMuseum;
    }
    
    
}
