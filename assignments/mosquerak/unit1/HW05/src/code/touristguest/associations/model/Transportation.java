/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.touristguest.associations.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Transportation {
    private int id;
    private string name;

    @Override
    public String toString() {
        return "Transportation{" + "id=" + id + ", name=" + name + ", descripcion=" + descripcion + ", tour=" + tour + '}';
    }
    private string descripcion;
    private string tour;
    
    public Transportation (){
}
}