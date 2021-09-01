/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Healt.model;

import com.mongodb.BasicDBObject;

/**
 *              TEAM 1 Healt&Life
 * @authors Bryan Chiliquinga 
 *          Gabriel Sebastian Aguirre Almache
 *          Bryan David Chiliquinga Lema
 *          Stefany Paola Guerrero Cordova
 *          Luis Alberto Heredia Iza
 *          Josselyn Gabriela Sunta Barzallo
 */
public class Patient {

    String name;
    Integer age;
    Integer ci;
    String gender;
    String address;
    Integer phoneNumber;
    String occupation;
    String email;
    float weight;
    String admissionDate;

    public Patient(String name, Integer age, Integer ci, String gender, String address, Integer phoneNumber, String occupation, String email, float weight, String admissionDate) {
        this.name = name;
        this.age = age;
        this.ci = ci;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.email = email;
        this.weight = weight;
        this.admissionDate = admissionDate;
    }

  

    public Patient(BasicDBObject dBObjectPatient) {
        this.name = dBObjectPatient.getString("Name");
        this.age = dBObjectPatient.getInt("Age");
        this.ci = dBObjectPatient.getInt("CI");
        this.gender = dBObjectPatient.getString("Gender");
        this.address = dBObjectPatient.getString("Address");
        this.phoneNumber = dBObjectPatient.getInt("Phone Number");
        this.occupation = dBObjectPatient.getString("Occupation");
        this.email = dBObjectPatient.getString("Email");
        this.weight = (float) dBObjectPatient.getDouble("Weigth");
        this.admissionDate = dBObjectPatient.getString("Admission Date");

    }

    public BasicDBObject dBPatientObjectHealtLife(){

        BasicDBObject dBPatientObjectHealtLife = new BasicDBObject();

        dBPatientObjectHealtLife.append("Name", this.getName());
        dBPatientObjectHealtLife.append("Age", this.getAge());
        dBPatientObjectHealtLife.append("CI", this.getCi());
        dBPatientObjectHealtLife.append("gender", this.getGender());
        dBPatientObjectHealtLife.append("Address", this.getAddress());
        dBPatientObjectHealtLife.append("Phone Number", this.getPhoneNumber());
        dBPatientObjectHealtLife.append("Occupation", this.getOccupation());
        dBPatientObjectHealtLife.append("Email", this.getEmail());
        dBPatientObjectHealtLife.append("Weigth", this.getWeight());
        dBPatientObjectHealtLife.append("Admission Date", this.getAdmissionDate());
        
        return dBPatientObjectHealtLife;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    
}