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
public class Measures {
    
    private double size;
    private double dimension;
    private double extension;
    private double quantity;
    private double portion;

    @Override
    public String toString() {
        return "Measures{" + "size=" + size + ", dimension=" + dimension + ", extension=" + extension + ", quantity=" + quantity + ", portion=" + portion + '}';
    }
    
    
    

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return the dimension
     */
    public double getDimension() {
        return dimension;
    }

    /**
     * @param dimension the dimension to set
     */
    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    /**
     * @return the extension
     */
    public double getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(double extension) {
        this.extension = extension;
    }

    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the portion
     */
    public double getPortion() {
        return portion;
    }

    /**
     * @param portion the portion to set
     */
    public void setPortion(double portion) {
        this.portion = portion;
    }
    
    
    
    
    
}
