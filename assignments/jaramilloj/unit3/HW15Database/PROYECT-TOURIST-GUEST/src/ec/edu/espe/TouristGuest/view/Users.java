/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristGuest.view;

/**
 *
 * @author Jean Jaramillo
 */
public class Users {
    String FirstName,LastName,UserName,Age,Address,Ci,CellPhone;

    public Users(String FirstName, String LastName, String UserName, String Age, String Address, String Ci, String CellPhone) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserName = UserName;
        this.Age = Age;
        this.Address = Address;
        this.Ci = Ci;
        this.CellPhone = CellPhone;
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }

    public String getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(String CellPhone) {
        this.CellPhone = CellPhone;
    }
    
    
}
