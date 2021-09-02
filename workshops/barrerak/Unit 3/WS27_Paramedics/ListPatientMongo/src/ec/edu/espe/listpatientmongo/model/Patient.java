/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.listpatientmongo.model;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Patient {
    
    private String NameofPatient;
    private String Address;
    private String DateOfAdmision;
    private String DeparturdDate;

    public Patient(){
        
    }
    public Patient(String NameofPatient, String Address, String DateOfAdmision, String DeparturdDate) {
        this.NameofPatient = NameofPatient;
        this.Address = Address;
        this.DateOfAdmision = DateOfAdmision;
        this.DeparturdDate = DeparturdDate;
    }

    @Override
    public String toString() {
        return "Patient{" + "NameofPatient=" + getNameofPatient() + ", Address=" + getAddress() + ", DateOfAdmision=" + getDateOfAdmision() + ", DeparturdDate=" + getDeparturdDate() + '}';
    }

    /**
     * @return the NameofPatient
     */
    public String getNameofPatient() {
        return NameofPatient;
    }

    /**
     * @param NameofPatient the NameofPatient to set
     */
    public void setNameofPatient(String NameofPatient) {
        this.NameofPatient = NameofPatient;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the DateOfAdmision
     */
    public String getDateOfAdmision() {
        return DateOfAdmision;
    }

    /**
     * @param DateOfAdmision the DateOfAdmision to set
     */
    public void setDateOfAdmision(String DateOfAdmision) {
        this.DateOfAdmision = DateOfAdmision;
    }

    /**
     * @return the DeparturdDate
     */
    public String getDeparturdDate() {
        return DeparturdDate;
    }

    /**
     * @param DeparturdDate the DeparturdDate to set
     */
    public void setDeparturdDate(String DeparturdDate) {
        this.DeparturdDate = DeparturdDate;
    }


}
