/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryProducts.view;

import InventoryProducts.model.Inventory;
import InventoryProducts.model.Available;
import InventoryProducts.model.Connectors;
import InventoryProducts.model.Device;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class InventoryProducts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Connectors connectors = new Connectors();
        Device device = new Device();
        Available available = new Available();

        connectors.setName("Router");
        connectors.setPrice((float) 150.20);
        connectors.setType("coaxial");
        device.setModel("T0152Y");
        device.setName("cable");
        device.setPrice((float) 32.5);
        available.setAmount(5);
        available.setStock(true);
        System.out.println("Inventory Of Telecommunications Equipment And Devices, \n "
                + "Andres Galarza");

        System.out.println("Inventory ->" + inventory);
        System.out.println("Connectors ->" + connectors);
        System.out.println("Device ->" + device);
        System.out.println("Available ->" + available);

    }

}
