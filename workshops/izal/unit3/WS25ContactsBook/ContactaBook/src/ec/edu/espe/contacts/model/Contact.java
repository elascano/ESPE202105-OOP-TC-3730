/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class Contact {
    private String name;
    private Integer numberofFriends;
    private float salary;
    private String email;

    public Contact(String name, Integer numberofFriends, float salary, String email) {
        this.name = name;
        this.numberofFriends = numberofFriends;
        this.salary = salary;
        this.email = email;
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
     * @return the numberofFriends
     */
    public Integer getNumberofFriends() {
        return numberofFriends;
    }

    /**
     * @param numberofFriends the numberofFriends to set
     */
    public void setNumberofFriends(Integer numberofFriends) {
        this.numberofFriends = numberofFriends;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
