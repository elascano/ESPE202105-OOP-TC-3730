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
public class System1 {
    private boolean adaptable;
    private float capacity;
    private ArrayList<ElectronicMaterial> ems = new ArrayList<>();
    
    public void receiveInformation(ElectronicMaterial electronicMaterial){
    }

    @Override
    public String toString() {
        return "System{" + "adaptable=" + adaptable + ", capacity=" + capacity + ", ems=" + ems + '}';
    }

    /**
     * @return the adaptable
     */
    public boolean isAdaptable() {
        return adaptable;
    }

    /**
     * @param adaptable the adaptable to set
     */
    public void setAdaptable(boolean adaptable) {
        this.adaptable = adaptable;
    }

    /**
     * @return the capacity
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(float capacity) {
        this.capacity = capacity;
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
