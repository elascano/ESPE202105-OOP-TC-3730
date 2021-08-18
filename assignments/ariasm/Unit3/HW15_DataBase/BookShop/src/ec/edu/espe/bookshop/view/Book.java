/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookshop.view;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class Book {

    String Name;
    String Author;
    String Id;
    String Price;

    public Book(String Name, String Author, String Id, String Price) {
        this.Name = Name;
        this.Author = Author;
        this.Id = Id;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
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
