/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.racket.model;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class TennisRacket {
    private String color;
    private String material;
    private String racketBrand;
    private float length;
    private float width;
    
    @Override
    public String toString() {
        return "TennisRacket{" + "color=" + color + ", material=" + material + ", racketModel=" + racketBrand + ", length=" + length + ", width=" + width + '}';
    }

    public TennisRacket(String color, String material, String racketModel, float length, float width) {
        this.color = color;
        this.material = material;
        this.racketBrand = racketModel;
        this.length = length;
        this.width = width;
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
     * @return the racketBrand
     */
    public String getRacketBrand() {
        return racketBrand;
    }

    /**
     * @param racketBrand the racketBrand to set
     */
    public void setRacketBrand(String racketBrand) {
        this.racketBrand = racketBrand;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }
}
