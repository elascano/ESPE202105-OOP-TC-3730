/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.productos.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Capacity {
    
    private String measurementSystem;
    private int dimension;

    @Override
    public String toString() {
        return "Capacity{" + "measurementSystem=" + measurementSystem + ", dimension=" + dimension + '}';
    }

    
    /**
     * @return the measurementSystem
     */
    public String getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * @param measurementSystem the measurementSystem to set
     */
    public void setMeasurementSystem(String measurementSystem) {
        this.measurementSystem = measurementSystem;
    }

    /**
     * @return the dimension
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * @param dimension the dimension to set
     */
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
        
}
