/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Files {
    private String name;
    private String bestMaterial;

     public void add (Information information){
    }

    @Override
    public String toString() {
        return "Files{" + "name=" + name + ", bestMaterial=" 
                + bestMaterial + '}';
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
     * @return the bestMaterial
     */
    public String getBestMaterial() {
        return bestMaterial;
    }

    /**
     * @param bestMaterial the bestMaterial to set
     */
    public void setBestMaterial(String bestMaterial) {
        this.bestMaterial = bestMaterial;
    }
     
}
