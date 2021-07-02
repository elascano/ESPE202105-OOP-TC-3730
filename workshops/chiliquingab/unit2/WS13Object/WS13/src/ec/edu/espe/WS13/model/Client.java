/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.WS13.model;

import java.io.FileReader;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Client {

    public static Object parse(FileReader fileReader) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static char[] toJSONString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String name;
    private int age;
    private int id;
    private long phone;
    private float heigth;

    public Client() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Client{" + "name = " + name + ", age = " + age + ", id = " + id + ", phone = " + phone + ", heigth = " + heigth + '}';
    }

    public Client(String name, int age, int id, long phone, float heigth) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.phone = phone;
        this.heigth = heigth;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * @return the heigth
     */
    public float getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
    
}
