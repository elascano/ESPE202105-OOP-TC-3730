/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.joystick.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Joystick {
    private int price;
    private String trademark;
    private String color;
    private boolean ergonomic;
    private boolean wireless;

    public Joystick(int price, String trademark, String color, boolean ergonomic, boolean wireless) {
        this.price = price;
        this.trademark = trademark;
        this.color = color;
        this.ergonomic = ergonomic;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Joystick{" + "price=" + getPrice() + ", trademark=" + getTrademark() + ", color=" + getColor() + ", ergonomic=" + isErgonomic() + ", wireless=" + isWireless() + '}';
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
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
