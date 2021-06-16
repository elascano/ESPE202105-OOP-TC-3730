/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.model;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Chair {
private String wood;
private String support;
private int  size;

    public Chair(String wood, String support, int size) {
        this.wood = wood;
        this.support = support;
        this.size = size;
    }

   






@Override
    public String toString() {
        return "Chair{" + "wood=" + getWood() + ", support=" + getSupport() + ", size=" + getSize() + '}';
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     * @return the wood
     */
    public String getWood() {
        return wood;
    }

    /**
     * @param wood the wood to set
     */
    public void setWood(String wood) {
        this.wood = wood;
    }

    /**
     * @return the support
     */
    public String getSupport() {
        return support;
    }

    /**
     * @param support the support to set
     */
    public void setSupport(String support) {
        this.support = support;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
