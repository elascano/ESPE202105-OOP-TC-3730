/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

/**
 *
 * @author Camilo Ponce PROGRAM BUILDER ESPE-DCCO
 */
public class Contact {
    
    String name;
    Integer numbersofFriends;
    float salary;
    String email;

    public Contact(String name, Integer numbersofFriends, float salary, String email) {
        this.name = name;
        this.numbersofFriends = numbersofFriends;
        this.salary = salary;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumbersofFriends(Integer numbersofFriends) {
        this.numbersofFriends = numbersofFriends;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Integer getNumbersofFriends() {
        return numbersofFriends;
    }

    public float getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }
    
    
}
