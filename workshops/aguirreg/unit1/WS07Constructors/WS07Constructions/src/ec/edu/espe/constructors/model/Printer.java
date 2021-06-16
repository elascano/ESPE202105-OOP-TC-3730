/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructors.model;

import java.util.Arrays;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Printer {
       private String marc;
       private Model[] model;
       private String color;
       private String material;
       private float weight;

    @Override
    public String toString() {
        return "Printer{" + "marc=" + marc + ", model=" + Arrays.toString(model) + ", color=" + color + ", material=" + material + ", weight=" + weight + '}';
    }

    /**
     * @return the marc
     */
    public String getMarc() {
        return marc;
    }

    /**
     * @param marc the marc to set
     */
    public void setMarc(String marc) {
        this.marc = marc;
    }

    /**
     * @return the model
     */
    public Model[] getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(Model[] model) {
        this.model = model;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setModel(String l395) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
