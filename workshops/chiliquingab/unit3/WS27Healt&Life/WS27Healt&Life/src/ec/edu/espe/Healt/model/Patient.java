/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Healt.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Patient {

    private String name;
    private Integer age;
    private Integer id;
    private String gener;
    private String direction;
    private String ocupation;
    private String email;
    private float weight;
    private String admissionDate;
    private int numberOfPhone;


    public Patient(String name, Integer age, Integer id, String gener, String direction, int numberOfPhone, String ocupation, String email, float weight, String admissionDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gener = gener;
        this.direction = direction;
        this.numberOfPhone = numberOfPhone;
        this.ocupation = ocupation;
        this.email = email;
        this.weight = weight;
        this.admissionDate = admissionDate;
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
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the gener
     */
    public String getGener() {
        return gener;
    }

    /**
     * @param gener the gener to set
     */
    public void setGener(String gener) {
        this.gener = gener;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the numberOfPhone
     */
    public int getNumberOfPhone() {
        return numberOfPhone;
    }

    /**
     * @param numberOfPhone the numberOfPhone to set
     */
    public void setNumberOfPhone(int numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    /**
     * @return the ocupation
     */
    public String getOcupation() {
        return ocupation;
    }

    /**
     * @param ocupation the ocupation to set
     */
    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
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

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the admissionDate
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * @param admissionDate the admissionDate to set
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

}
