/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Populate_Table.view;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Tourist {
    private String Fist_Name;
    private String User;
    private String Address;
    private String CI;
    private String Travel_Thoughts;

    public Tourist(String Fist_Name, String User, String Address, String CI, String Travel_Thoughts) {
        this.Fist_Name = Fist_Name;
        this.User = User;
        this.Address = Address;
        this.CI = CI;
        this.Travel_Thoughts = Travel_Thoughts;
    }

    public String getFist_Name() {
        return Fist_Name;
    }

    public void setFist_Name(String Fist_Name) {
        this.Fist_Name = Fist_Name;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getTravel_Thoughts() {
        return Travel_Thoughts;
    }

    public void setTravel_Thoughts(String Travel_Thoughts) {
        this.Travel_Thoughts = Travel_Thoughts;
    }

    
    
    
}