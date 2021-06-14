/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.model;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class ElectronicMaterial {
    private String name;
    private String fabricator;
    private String description;
    private float cost;
    private boolean available;

    @Override
    public String toString() {
        return "ElectronicMaterial{" + "name=" + name + ", fabricator=" + fabricator + ", description=" + description + ", cost=" + cost + ", available=" + available + '}';
    }
    
    
    
    public Program giveSomeInformation(){
        Program p = new Program();
        return p;
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
     * @return the fabricator
     */
    public String getFabricator() {
        return fabricator;
    }

    /**
     * @param fabricator the fabricator to set
     */
    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
}
