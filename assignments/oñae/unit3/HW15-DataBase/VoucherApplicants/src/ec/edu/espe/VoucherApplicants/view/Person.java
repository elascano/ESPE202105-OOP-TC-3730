/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.VoucherApplicants.view;

/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class Person {
    String Name,LastName,Address,Email,Phone,Gender;

    public Person(String Name, String LastName, String Address, String Email, String Phone, String Gender) {
        this.Name = Name;
        this.LastName = LastName;
        this.Address = Address;
        this.Email = Email;
        this.Phone = Phone;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
}
