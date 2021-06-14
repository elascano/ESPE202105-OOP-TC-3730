/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class User {
    private String name;
    private String lastName;
    private String city;

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastName=" + lastName + ", city=" + city + '}';
    }
    
public void searchElements(){
    
}

 public Information analyzeInformation(){
        Information information= new Information();
      return information;
      
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
}
