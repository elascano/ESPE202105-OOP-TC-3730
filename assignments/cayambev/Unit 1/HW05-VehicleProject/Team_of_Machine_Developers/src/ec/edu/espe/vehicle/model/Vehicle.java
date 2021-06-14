/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.model;

import java.util.ArrayList;

/**
 *
 * @author Vanessa Cayambe Team of machine Developers
 */
public class Vehicle {
        private String price;
        private ArrayList<Accessory> accessory = new ArrayList<>();

    @Override
    public String toString() {
        return "Vehicle{" + "price=" + price + ", accessory=" + accessory + '}';
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the accessory
     */
    public ArrayList<Accessory> getAccessory() {
        return accessory;
    }

    /**
     * @param accessory the accessory to set
     */
    public void setAccessory(ArrayList<Accessory> accessory) {
        this.accessory = accessory;
    }

}
