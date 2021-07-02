/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.car.model;

/**
 *
 * @author Camilo Ponce ESPE-DCCO
 */
public class Car {
 
private String color;
private String type;
private int size;
private int power;
private int velocity;

    public Car(String color, String type, int size, int power, int velocity) {
        this.color = color;
        this.type = type;
        this.size = size;
        this.power = power;
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", type=" + type + ", size=" + size + ", power=" + power + ", velocity=" + velocity + '}'+"\n";
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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

    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * @return the velocity
     */
    public int getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}