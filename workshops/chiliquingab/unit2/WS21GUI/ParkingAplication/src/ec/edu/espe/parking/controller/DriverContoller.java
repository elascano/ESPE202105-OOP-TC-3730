/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.parking.controller;

import ec.edu.espe.parking.model.Driver;
import ec.edu.espe.parking.model.Type;
import ec.edu.espe.parking.view.FrmDriver;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class DriverContoller {
    private Driver drivers;
    private FrmDriver frmDriver;
    
    public void add(Driver drivers){
        //TODO add contact to datebase
        //TODO call the utils classes
    }
    
    public ArrayList <Driver> find(String email){
        ArrayList<Driver> driver = new ArrayList<>();
        //TODO find the contacts by mail using utils
        Driver driver1 = new Driver("Bryan", "Chiliquinga", "melanieteamo", "099782134", "bryanchiliquinga423@gmail.com", "Yo amo a la melanie", "Masculino", new ArrayList<Type>(), LocalDateTime.now(), 1);
        driver.add(driver1);
        return driver;
    }
    
    public boolean delete(String email){
        boolean delete = false;
        //TODO
        ArrayList<Driver> driver = new ArrayList<>();
        driver = find(email);
        if(driver.size()>0){
            delete = true;
        }
        return delete;
    }
    
    public boolean update(String email){
        boolean update = false;
        //TODO
        ArrayList<Driver> driver = new ArrayList<>();
        driver = find(email);
        if(driver.size()>0){
            update = true;
        }
        return update;
    }
    
    public DriverContoller(Driver drivers, FrmDriver frmDriver) {
        this.drivers = drivers;
        this.frmDriver = frmDriver;
    }

    /**
     * @return the drivers
     */
    public Driver getDrivers() {
        return drivers;
    }

    /**
     * @param drivers the drivers to set
     */
    public void setDrivers(Driver drivers) {
        this.drivers = drivers;
    }

    /**
     * @return the frmDriver
     */
    public FrmDriver getFrmDriver() {
        return frmDriver;
    }

    /**
     * @param frmDriver the frmDriver to set
     */
    public void setFrmDriver(FrmDriver frmDriver) {
        this.frmDriver = frmDriver;
    }
    
}
