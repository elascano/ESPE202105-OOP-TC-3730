/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.view;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class Product {

    String Product;
    String Fabricator;
    String Id;
    String Price;

    public Product(String Name, String Author, String Id, String Price) {
        this.Product = Name;
        this.Fabricator = Author;
        this.Id = Id;
        this.Price = Price;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    public String getFabricator() {
        return Fabricator;
    }

    public void setFabricator(String Fabricator) {
        this.Fabricator = Fabricator;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

}
