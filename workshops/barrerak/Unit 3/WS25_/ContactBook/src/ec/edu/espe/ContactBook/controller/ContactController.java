/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ContactBook.controller;

import ec.edu.espe.ContactBook.model.Book;
import ec.edu.espe.ContactBook.model.Contact;



/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class ContactController {
    
    public boolean addContactToBook(Book book, Contact contact){
        
        book.getContacts().add(contact);
        //TODO add to dataBase by calling utils
        return true;
    }
}
