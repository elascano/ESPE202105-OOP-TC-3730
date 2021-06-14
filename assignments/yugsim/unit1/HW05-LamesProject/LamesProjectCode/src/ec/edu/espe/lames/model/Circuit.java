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
public class Circuit {
    private String elements;
    private float size;
    private float cost;
    private ArrayList<ElectronicMaterial> ems = new ArrayList<>();
    
    public void selectElement(ElectronicMaterial electronicMaterial){
    }

    @Override
    public String toString() {
        return "Circuit{" + "elements=" + elements + ", size=" + size + ", cost=" + cost + ", ems=" + ems + '}';
    }

    /**
     * @return the elements
     */
    public String getElements() {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(String elements) {
        this.elements = elements;
    }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
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
     * @return the ems
     */
    public ArrayList<ElectronicMaterial> getEms() {
        return ems;
    }

    /**
     * @param ems the ems to set
     */
    public void setEms(ArrayList<ElectronicMaterial> ems) {
        this.ems = ems;
    }
}
