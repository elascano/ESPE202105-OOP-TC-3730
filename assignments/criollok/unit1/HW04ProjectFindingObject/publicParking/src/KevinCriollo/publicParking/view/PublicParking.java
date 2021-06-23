/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinCriollo.publicParking.view;

import KevinCriollo.publicParking.model.*;
import java.util.Scanner;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class PublicParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car = new Car ();
        Driver driver = new Driver ();
        Observation ob = new Observation ();
        Place place = new Place();
        Ticket ticket = new Ticket ();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("select of the vehicle: ");
        System.out.println("option 0: truck");
        System.out.println("option 1: pickup truck");
        System.out.println("option 2: automobile");
        System.out.println("option 3: SUV");
        System.out.println("option 4: motorcycle");
        
        int option = sc.nextInt();
        type(option);
        
        
        car.setType(option);
        car.setMark("chevrolet");
        car.setLicensePlace("KOC-1997");
        car.setColor("rojo");
        car.setOb("perfect");
        
        driver.setName("Kevin");
        driver.setAge(24);
        driver.setGender('M');
        driver.setPreference("null");
        driver.setTicket(10);
        
        ob.setCollision(false);
        ob.setRupture(false);
        ob.setScratches(true);
        
        place.setArea(210.5);
        place.setDistance(0.8);
        place.setStreet("Av. shirys");
        
        ticket.setCode(00126);
        ticket.setPrice(2.50);
        
        System.out.println("Information of your vehicle: " + car + ob);
        System.out.println("data of the driver: " + driver);
        System.out.println("Number and price: "+ ticket);
        System.out.println("Direction of the Public Parking: " + place);
        System.out.println("Thanks for your visited");
        
    }
    
    public static void type (int option){
    
    if(option == 0){
        System.out.println("truck");
        }else
    if(option == 1){
        System.out.println("pickup truck");
        }else
    if(option == 2){
        System.out.println("automobile");
        }else
    if(option == 3){
        System.out.println("SUV");
        }else
    if(option == 4){
        System.out.println("motorcycle");
        }else{
    System.out.println(" the option is invalide");
    }
      
    };
}
