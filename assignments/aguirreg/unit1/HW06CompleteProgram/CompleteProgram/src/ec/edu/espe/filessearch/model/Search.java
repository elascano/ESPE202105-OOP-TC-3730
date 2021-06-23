/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filessearch.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Search {
    private Capacity[] capacityCharacter;
    
    public void FindFiles(){
    
    }
    
    public Shortcuts UseShortcuts(){
        Shortcuts shortcuts = new Shortcuts();
          
        return shortcuts;
    }

    @Override
    public String toString() {
        return "Search{" + "capacityCharacter=" + capacityCharacter + '}';
    }

    /**
     * @return the capacityCharacter
     */
    public Capacity[] getCapacityCharacter() {
        return capacityCharacter;
    }

    /**
     * @param capacityCharacter the capacityCharacter to set
     */
    public void setCapacityCharacter(Capacity[] capacityCharacter) {
        this.capacityCharacter = capacityCharacter;
    }
    
}

