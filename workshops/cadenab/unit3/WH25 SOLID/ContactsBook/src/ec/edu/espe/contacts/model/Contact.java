/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class Contact {
    
    private String name;
    private Integer namberOfFirends;
    private float salary;
    private String email;

    public Contact(String name, Integer namberOfFirends, float salary, String email) {
        this.name = name;
        this.namberOfFirends = namberOfFirends;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNamberOfFirends() {
        return namberOfFirends;
    }

    public void setNamberOfFirends(Integer namberOfFirends) {
        this.namberOfFirends = namberOfFirends;
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
