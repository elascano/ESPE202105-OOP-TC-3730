/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class User {
    private String name;
    private String lastname;
    private int age;
    public void doStuff(){
        
    }
    public Information searchInformation(){
     Information information = new Information(); 
        
     return information;
     

    }
    public ElectronicMaterial searchBestMaterial(){
     ElectronicMaterial electronicMaterial = new ElectronicMaterial(); 
        
     return electronicMaterial;
 
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastname=" + lastname 
                + ", age=" + age + '}';
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
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
