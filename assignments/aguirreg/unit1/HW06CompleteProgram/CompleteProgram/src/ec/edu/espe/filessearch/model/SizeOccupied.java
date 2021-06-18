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
public class SizeOccupied {
    private String type;
    private float number;

    @Override
    public String toString() {
        return "SizeOccupied{" + "type=" + type + ", number=" + number + '}';
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the number
     */
    public float getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(float number) {
        this.number = number;
    }
}
