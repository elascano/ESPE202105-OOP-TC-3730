/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contactsbook.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Contact {
    private String name;
    private Integer number0ffriends;
    private float salary;
    private String email;

    public Contact(String name, Integer number0ffriends, float salary, String email) {
        this.name = name;
        this.number0ffriends = number0ffriends;
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
     * @return the number0ffriends
     */
    public Integer getNumber0ffriends() {
        return number0ffriends;
    }

    /**
     * @param number0ffriends the number0ffriends to set
     */
    public void setNumber0ffriends(Integer number0ffriends) {
        this.number0ffriends = number0ffriends;
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
