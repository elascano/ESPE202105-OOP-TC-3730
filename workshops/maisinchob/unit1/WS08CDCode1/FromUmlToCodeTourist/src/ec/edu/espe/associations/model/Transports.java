/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Transports {
    
   private int fuel;
   private int maximumcapacity;
   private  String driver;

    @Override
    public String toString() {
        return "Transports{" + "fuel=" + fuel + ", maximumcapacity=" + maximumcapacity + ", driver=" + driver + '}';
    }
   
   public void destinationtime(){    
   }
   public void transportcost(){   
   }
   public void driverbackground(){
       
   }

    /**
     * @return the fuel
     */
    public int getFuel() {
        return fuel;
    }

    /**
     * @param fuel the fuel to set
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     * @return the maximumcapacity
     */
    public int getMaximumcapacity() {
        return maximumcapacity;
    }

    /**
     * @param maximumcapacity the maximumcapacity to set
     */
    public void setMaximumcapacity(int maximumcapacity) {
        this.maximumcapacity = maximumcapacity;
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }
}