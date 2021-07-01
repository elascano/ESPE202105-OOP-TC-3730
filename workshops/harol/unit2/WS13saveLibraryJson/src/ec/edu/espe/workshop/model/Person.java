/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.workshop.model;

/**
 *
 * @author Fernando
 */
public class Person {

    private String cedula;
    private String names;
    private String lastName;
    private String address;
    private String phone;

    public Person() {
    }

    public Person(String cedula, String names, String lastName, String phone, String direction, String email) {
        super();
        this.cedula = cedula;
        this.names = names;
        this.lastName = lastName;
        this.address = direction;
        this.phone=phone;

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
}
