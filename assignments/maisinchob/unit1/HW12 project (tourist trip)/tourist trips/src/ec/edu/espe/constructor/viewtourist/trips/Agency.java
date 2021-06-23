/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.viewtourist.trips;

import java.util.ArrayList;


/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Agency {
    
    /* Agency ;*/
private String workers;
private String travels;
private String Services;

    @Override
    public String toString() {
        return "Agency{" + "workers=" + workers + ", travels=" + travels + ", Services=" + Services + ", security=" + security + ", serviceDescription=" + serviceDescription + ", name=" + name + ", lastname=" + lastname + ", money=" + money + ", age=" + age + ", height=" + height + ", skincolor=" + skincolor + ", destinations=" + destinations + ", tickets=" + tickets + ", transports=" + transports + ", fuel=" + fuel + ", capacity=" + capacity + ", driver=" + driver + ", contents=" + contents + ", cost=" + cost + ", promotions=" + promotions + ", id=" + id + ", benefit=" + benefit + '}';
    }











   /* Services*/
private String security;
private String serviceDescription;

/* Client*/
private String name;
private String lastname;
private int money;

/*TouristGuide*/
private int age;
private  int height;
private String skincolor;

/*Travels*/

 private ArrayList<Destination> destinations = new ArrayList<>();

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSkincolor() {
        return skincolor;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }

    public ArrayList<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(ArrayList<Destination> destinations) {
        this.destinations = destinations;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Transports[] getTransports() {
        return transports;
    }

    public void setTransports(Transports[] transports) {
        this.transports = transports;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public ArrayList<Content> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Content> contents) {
        this.contents = contents;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Promotion[] getPromotions() {
        return promotions;
    }

    public void setPromotions(Promotion[] promotions) {
        this.promotions = promotions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }
 class Destination {  
}
 private int  tickets;
 private Transports[] transports = new Transports[3];
 class Transports{   
}

 /* Transports*/
 private float fuel;
 private int capacity;
 private String driver;       

   /*TravelPackage*/
 private ArrayList<Content> contents = new ArrayList<>();
 class Content{
 }
 private float cost;
 private Promotion[] promotions = new Promotion[3];
 class Promotion{
 }


/*Time*/
 private int id;
 
/*Gain*/
private int benefit; 




 

   
    



    public Agency(String workers, String travels, String Services) {
        this.workers = workers;
        this.travels = travels;
        this.Services = Services;
    }

    public String getWorkers() {
        return workers;
    }

    public void setWorkers(String workers) {
        this.workers = workers;
    }

    public String getTravels() {
        return travels;
    }

    public void setTravels(String travels) {
        this.travels = travels;
    }

    public String getServices() {
        return Services;
    }

    public void setServices(String Services) {
        this.Services = Services;
    }

    public Agency(String security, String serviceDescription, String name, String lastname, int money, int age, int height, String skincolor, int tickets, float fuel, int capacity, String driver, float cost, int id, int benefit) {
        this.security = security;
        this.serviceDescription = serviceDescription;
        this.name = name;
        this.lastname = lastname;
        this.money = money;
        this.age = age;
        this.height = height;
        this.skincolor = skincolor;
        this.tickets = tickets;
        this.fuel = fuel;
        this.capacity = capacity;
        this.driver = driver;
        this.cost = cost;
        this.id = id;
        this.benefit = benefit;
    }

    
}
