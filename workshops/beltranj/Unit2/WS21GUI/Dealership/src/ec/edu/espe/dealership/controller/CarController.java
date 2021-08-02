/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dealership.controller;


import ec.edu.espe.dealership.model.Accessory;
import ec.edu.espe.dealership.model.Car;
import ec.edu.espe.dealership.view.FrmCar;
import java.util.ArrayList;
import utils.DBManager;
import utils.PersistenceI;

/**
 *
 * @author hecto
 */
public class CarController {
    private Car car;
    private FrmCar frmCar; 
    private PersistenceI persistence;

    public void add(Car car){
        //TODO add car to database
        //TODO call the util classses
        persistence = new DBManager();
        //Todo convert contact to json
        String carJson ="{"
    }
    public ArrayList<Car> find(String email){
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car("Jennifer", "Beltran", "password", "chevrolet", "aveo",new ArrayList<Accessory>());
        cars.add(car);
        return cars;
    }
    
    public boolean update(String email){
        boolean updated=false;
        ArrayList<Car> cars = new ArrayList<>();
        cars = find (email);
        if(cars.size()>0){
            updated =true;
       }
        return updated;
    }
    public CarController(Car car, FrmCar frmCar) {
        this.car = car;
        this.frmCar = frmCar;
    }

    /**
     * @return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     * @param car the car to set
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * @return the frmCar
     */
    public FrmCar getFrmCar() {
        return frmCar;
    }

    /**
     * @param frmCar the frmCar to set
     */
    public void setFrmCar(FrmCar frmCar) {
        this.frmCar = frmCar;
    }
}
