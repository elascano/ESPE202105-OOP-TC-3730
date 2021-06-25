/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Mundo {
    ListadoPais listaPais;
    ListadoCiudad listaCiudad;
    public Mundo(){
        this.listaPais = new ListadoPais();
        this.listaCiudad = new ListadoCiudad();
    }
    public void agregarPais(Pais p){
        this.listaPais.agregarPias(p);
    }
    public void agregarCiudad(Ciudad c){
        this.listaCiudad.agregarCiudad(c);
    }
    public String getCiudadesPorPais(String paisBuscado){
        Pais p = this.listaPais.buscarPais(paisBuscado);
        if (p != null){
            return p .getListadoCiudades();
        }
        return "Pais no encontrado. ";
    }
    
    public String getDatosCiudad(String ciudadBuscada){
        Ciudad c = this.listaCiudad.bucarCiudad(ciudadBuscada);
        if (c ! = null){
        return c.getNombrePais();
    }
        return ""
    }
    
    
    
    
}
