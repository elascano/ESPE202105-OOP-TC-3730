/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JosselynSigcha.unitTransformation.model;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class Conversion {
    
    private double units;
    private double transformation;
    private double change;
    private double modification;

    @Override
    public String toString() {
        return "Conversion{" + "units=" + units + ", transformation=" + transformation + ", change=" + change + ", modification=" + modification + '}';
    }
    
    
    

    /**
     * @return the units
     */
    public double getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(double units) {
        this.units = units;
    }

    /**
     * @return the transformation
     */
    public double getTransformation() {
        return transformation;
    }

    /**
     * @param transformation the transformation to set
     */
    public void setTransformation(double transformation) {
        this.transformation = transformation;
    }

    /**
     * @return the change
     */
    public double getChange() {
        return change;
    }

    /**
     * @param change the change to set
     */
    public void setChange(double change) {
        this.change = change;
    }

    /**
     * @return the modification
     */
    public double getModification() {
        return modification;
    }

    /**
     * @param modification the modification to set
     */
    public void setModification(double modification) {
        this.modification = modification;
    }
    
    
    
    
}
