/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.construction.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Client {
    private String name;
    private String last_Name;
    private int age;

    public Client(String name, String last_Name, int age) {
        this.name = name;
        this.last_Name = last_Name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", last_Name=" + last_Name + ", age=" + age + '}';
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
     * @return the last_Name
     */
    public String getLast_Name() {
        return last_Name;
    }

    /**
     * @param last_Name the last_Name to set
     */
    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
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
