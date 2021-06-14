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
public class Agency {

   private int workers;
   private int travels;
   private Services[] services = new Services[3];
   private TravelPackage[] travelpackage = new TravelPackage[4];  

    @Override
    public String toString() {
        return "Agency{" + "workers=" + workers + ", travels=" + travels + ", services=" + services + ", travelpackage=" + travelpackage + '}';
    }
  
   
   public void travelinsurance(){
    }
    public void marketingpromoter(){    
    }
   public Gain investment(){
       
       Gain gain =new Gain();
       return gain;
   }

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
     * @return the travels
     */
    public int getTravels() {
        return travels;
    }

    /**
     * @param travels the travels to set
     */
    public void setTravels(int travels) {
        this.travels = travels;
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