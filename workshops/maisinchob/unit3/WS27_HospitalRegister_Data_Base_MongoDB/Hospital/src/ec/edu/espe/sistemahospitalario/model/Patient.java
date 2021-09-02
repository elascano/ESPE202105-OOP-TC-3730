/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sistemahospitalario.model;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class Patient {
    private int id;
    private String name;
    private String direction;
    private int phone;
    private String email;

    public Patient() {
    }

    public Patient(int cedula, String nombre, String direccion, int telefono, String correoElectronico) {
        this.id = cedula;
        this.name = nombre;
        this.direction = direccion;
        this.phone = telefono;
        this.email = correoElectronico;
    }

    public int getCedula() {
        return id;
    }

    public void setCedula(int cedula) {
        this.id = cedula;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getDireccion() {
        return direction;
    }

    public void setDireccion(String direccion) {
        this.direction = direccion;
    }

    public int getTelefono() {
        return phone;
    }

    public void setTelefono(int telefono) {
        this.phone = telefono;
    }

    public String getCorreoElectronico() {
        return email;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.email = correoElectronico;
    }
    
    
}
