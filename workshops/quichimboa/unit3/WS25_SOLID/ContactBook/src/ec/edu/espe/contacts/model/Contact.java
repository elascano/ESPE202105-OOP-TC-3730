/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class Contact {
    String name;
    Integer numerOfFriends;
    float salary;
    String email;

    public Contact(String name, Integer numerOfFriends, float salary, String email) {
        this.name = name;
        this.numerOfFriends = numerOfFriends;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumerOfFriends() {
        return numerOfFriends;
    }

    public void setNumerOfFriends(Integer numerOfFriends) {
        this.numerOfFriends = numerOfFriends;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
