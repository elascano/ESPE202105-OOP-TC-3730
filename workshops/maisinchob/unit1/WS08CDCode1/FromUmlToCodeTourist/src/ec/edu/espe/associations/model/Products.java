/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

import java.util.Services;
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Products {
     private int workers;
     private int computers;
     private Services[] services;

    /**
     * @return the workers
     */
    public int getWorkers() {
        return workers;
    }

    /**
     * @param workers the workers to set
     */
    public void setWorkers(int workers) {
        this.workers = workers;
    }

    /**
     * @return the computers
     */
    public int getComputers() {
        return computers;
    }

    /**
     * @param computers the computers to set
     */
    public void setComputers(int computers) {
        this.computers = computers;
    }

    /**
     * @return the services
     */
    public Services[] getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(Services[] services) {
        this.services = services;
    }
     
}
