/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.computer;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class ComputerData {
      private String brand;
      private String color;
      private float cost;
      private String processor;
      private int ram;

    public ComputerData(String brand, String color, float cost, String processor, int ram) {
        this.brand = brand;
        this.color = color;
        this.cost = cost;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "ComputerData{" + "brand=" + getBrand() + ", color=" + getColor() + ", cost=" + getCost() + ", processor=" + getProcessor() + ", ram=" + getRam() + '}';
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @param processor the processor to set
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

        
}
