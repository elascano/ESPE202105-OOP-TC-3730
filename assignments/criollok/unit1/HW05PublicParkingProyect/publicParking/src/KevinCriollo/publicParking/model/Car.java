/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinCriollo.publicParking.model;

import java.util.ArrayList;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class Car { 
    private int type;
    private String mark;
    private String licensePlace;
    private String color;
    private String ob;

    @Override
    public String toString() {
        return "\n type = " + getType() + "\n mark = " + getMark() + "\n LP = " + getLicensePlace() + 
                "\n color = " + getColor() + "\n ob = " + getOb();
       
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the licensePlace
     */
    public String getLicensePlace() {
        return licensePlace;
    }

    /**
     * @param licensePlace the licensePlace to set
     */
    public void setLicensePlace(String licensePlace) {
        this.licensePlace = licensePlace;
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
     * @return the ob
     */
    public String getOb() {
        return ob;
    }

    /**
     * @param ob the ob to set
     */
    public void setOb(String ob) {
        this.ob = ob;
    }
   




   
}
 