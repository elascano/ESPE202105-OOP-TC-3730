/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.joysticks;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Features {
    
    private int unit;
    private String trademark;
    private String color;
    private boolean ergonomic;
    private boolean wireless;

    @Override
    public String toString() {
        return "Features{" + "unit=" + getUnit() + ", trademark=" + getTrademark() + ", color=" + getColor() + ", ergonomic=" + isErgonomic() + ", wireless=" + isWireless() + '}';
    }


    public Features(int unit, String trademark, String color, boolean ergonomic, boolean wireless) {
        this.unit = unit;
        this.trademark = trademark;
        this.color = color;
        this.ergonomic = ergonomic;
        this.wireless = wireless;
    }

    /**
     * @return the unit
     */
    public int getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(int unit) {
        this.unit = unit;
    }

    /**
     * @return the trademark
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * @param trademark the trademark to set
     */
    public void setTrademark(String trademark) {
        this.trademark = trademark;
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
     * @return the ergonomic
     */
    public boolean isErgonomic() {
        return ergonomic;
    }

    /**
     * @param ergonomic the ergonomic to set
     */
    public void setErgonomic(boolean ergonomic) {
        this.ergonomic = ergonomic;
    }

    /**
     * @return the wireless
     */
    public boolean isWireless() {
        return wireless;
    }

    /**
     * @param wireless the wireless to set
     */
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

}
