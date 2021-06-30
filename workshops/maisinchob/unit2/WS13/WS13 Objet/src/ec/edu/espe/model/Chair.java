/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Chair {
    private String composition;
    private String design;
    private String color;
    private String support;
    private int bearingCapacity; 

    public Chair(String composition, String design, String color, String support, int bearingCapacity) {
        this.composition = composition;
        this.design = design;
        this.color = color;
        this.support = support;
        this.bearingCapacity = bearingCapacity;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public int getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(int bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }

    @Override
    public String toString() {
        return "Chair{" + "composition=" + composition + ", design=" + design + ", color=" + color + ", support=" + support + ", bearingCapacity=" + bearingCapacity + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
