/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.constructors.model;

/**
 *
 * @author Estefania
 */
public class Computer {
    private String model;
    private String brandtype;
    private String serie;
    
    public Computer(String model, String brandtype, String serie){
        this.model = model;
        this.brandtype = brandtype;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Computer{" + "model=" + model + ", brandtype=" + brandtype + ", serie=" + serie + '}';
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the brandtype
     */
    public String getBrandtype() {
        return brandtype;
    }

    /**
     * @param brandtype the brandtype to set
     */
    public void setBrandtype(String brandtype) {
        this.brandtype = brandtype;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }
}
