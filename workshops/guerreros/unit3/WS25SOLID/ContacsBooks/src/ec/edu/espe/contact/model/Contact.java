/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contact.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Contact {
    
    private String name;
    private Integer numberfriends;
    private float salary;
    private String email;

    public Contact(String name, Integer numberfriends, float salary, String email) {
        this.name = name;
        this.numberfriends = numberfriends;
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
     * @return the numberfriends
     */
    public Integer getNumberfriends() {
        return numberfriends;
    }

    /**
     * @param numberfriends the numberfriends to set
     */
    public void setNumberfriends(Integer numberfriends) {
        this.numberfriends = numberfriends;
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
