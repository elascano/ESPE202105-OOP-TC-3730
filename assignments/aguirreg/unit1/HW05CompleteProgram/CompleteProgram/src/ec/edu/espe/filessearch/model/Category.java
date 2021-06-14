/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filessearch.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Category {
    private String nameCategory;
    private float number;

    @Override
    public String toString() {
        return "Category{" + "nameCategory=" + nameCategory + ", number=" + number + '}';
    }

    /**
     * @return the nameCategory
     */
    public String getNameCategory() {
        return nameCategory;
    }

    /**
     * @param nameCategory the nameCategory to set
     */
    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    /**
     * @return the number
     */
    public float getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(float number) {
        this.number = number;
    }
}
