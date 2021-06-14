/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.model;

/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class Client {
    private String esconomicstatus;
    private String name;
    private String address;

    @Override
    public String toString() {
        return "Client{" + "esconomicstatus=" + esconomicstatus + ", name=" + name + ", address=" + address + '}';
    }

    /**
     * @return the esconomicstatus
     */
    public String getEsconomicstatus() {
        return esconomicstatus;
    }

    /**
     * @param esconomicstatus the esconomicstatus to set
     */
    public void setEsconomicstatus(String esconomicstatus) {
        this.esconomicstatus = esconomicstatus;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
