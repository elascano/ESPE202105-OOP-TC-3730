/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryProducts.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Inventory {

    private ArrayList<Device> devices = new ArrayList<>();
    private ArrayList<Connectors> connectors = new ArrayList<>();

    public void saveDiveces() {

    }

    public void saveConnectors() {

    }

    @Override
    public String toString() {
        return "Inventory{" + "devices=" + devices + ", connectors=" + connectors + '}';
    }

    /**
     * @return the devices
     */
    public ArrayList<Device> getDevices() {
        return devices;
    }

    /**
     * @param devices the devices to set
     */
    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    /**
     * @return the connectors
     */
    public ArrayList<Connectors> getConnectors() {
        return connectors;
    }

    /**
     * @param connectors the connectors to set
     */
    public void setConnectors(ArrayList<Connectors> connectors) {
        this.connectors = connectors;
    }

}
