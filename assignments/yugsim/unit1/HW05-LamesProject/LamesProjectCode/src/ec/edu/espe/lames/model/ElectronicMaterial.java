/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.model;

import java.util.ArrayList;
/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class ElectronicMaterial {
    private String name;
    private String color;
    private float cost;
    private String typeOfMaterial;
    private ArrayList<Circuit> cs = new ArrayList<>();
    
    public void searchMaterials(Circuit circuit){
    }

    @Override
    public String toString() {
        return "ElectronicMaterial{" + "name=" + name + ", color=" + color + ", cost=" + cost + ", typeOfMaterial=" + typeOfMaterial + ", cs=" + cs + '}';
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return the typeOfMaterial
     */
    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    /**
     * @param typeOfMaterial the typeOfMaterial to set
     */
    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    /**
     * @return the cs
     */
    public ArrayList<Circuit> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<Circuit> cs) {
        this.cs = cs;
    }
}
