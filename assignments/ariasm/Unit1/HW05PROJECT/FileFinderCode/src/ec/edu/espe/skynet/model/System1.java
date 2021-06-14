/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

import java.util.ArrayList;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class System1 {
    private int year;
    private int mechanisms;
    private String dataThatStores;
    private ArrayList<Application> structure = new ArrayList<>();

    @Override
    public String toString() {
        return "System{" + "year=" + year + ", mechanisms=" + mechanisms + ", dataThatStores=" + dataThatStores + ", structure=" + structure + '}';
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the mechanisms
     */
    public int getMechanisms() {
        return mechanisms;
    }

    /**
     * @param mechanisms the mechanisms to set
     */
    public void setMechanisms(int mechanisms) {
        this.mechanisms = mechanisms;
    }

    /**
     * @return the dataThatStores
     */
    public String getDataThatStores() {
        return dataThatStores;
    }

    /**
     * @param dataThatStores the dataThatStores to set
     */
    public void setDataThatStores(String dataThatStores) {
        this.dataThatStores = dataThatStores;
    }

    /**
     * @return the structure
     */
    public ArrayList<Application> getStructure() {
        return structure;
    }

    /**
     * @param structure the structure to set
     */
    public void setStructure(ArrayList<Application> structure) {
        this.structure = structure;
    }
    
}
