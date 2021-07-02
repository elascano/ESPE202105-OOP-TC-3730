/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartPhone.model;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Smartphone {
    private String brand;
    private String model;
    private int ram;
    private int rom;
    private String color;

    @Override
    public String toString() {
        return "Smartphone{" + "brand=" + brand + ", model=" + model + ", ram=" + ram + ", rom=" + rom + ", color=" + color + '}';
    }

    public Smartphone(String brand, String model, int ram, int rom, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.rom = rom;
        this.color = color;
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

    /**
     * @return the rom
     */
    public int getRom() {
        return rom;
    }

    /**
     * @param rom the rom to set
     */
    public void setRom(int rom) {
        this.rom = rom;
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
    
}
