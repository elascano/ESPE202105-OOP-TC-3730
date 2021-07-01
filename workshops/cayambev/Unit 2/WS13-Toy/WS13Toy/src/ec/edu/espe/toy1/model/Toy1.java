/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.toy1.model;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Toy1 {
    private String Name;
    private String Color;
    private float size;
    private float price;
    private String material;

    @Override
    public String toString() {
        return "Toy1{" + "Name=" + Name + ", Color=" + Color + ", size=" + size + ", price=" + price + ", material=" + material + '}';
    }

    public Toy1(String Name, String Color, float size, float price, String material) {
        this.Name = Name;
        this.Color = Color;
        this.size = size;
        this.price = price;
        this.material = material;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
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

    
    
}
