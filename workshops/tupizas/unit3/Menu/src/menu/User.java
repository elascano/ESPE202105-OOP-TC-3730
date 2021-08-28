/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class User {
    
    String Fabricador,Producto,Id,Quantity;

    public User(String Fabricador, String Producto, String Id, String Quantity) {
        this.Fabricador = Fabricador;
        this.Producto = Producto;
        this.Id = Id;
        this.Quantity = Quantity;
    }

    public String getFabricador() {
        return Fabricador;
    }

    public void setFabricador(String Fabricador) {
        this.Fabricador = Fabricador;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }
    
    
    
}
