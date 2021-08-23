/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.contactBook.controller;

import ec.edu.ec.contactBook.model.Book;
import ec.edu.ec.contactBook.model.Contact;

/**
 *
 * @author Jean Jaramillo
 */
public class ContactController {

    public boolean addContactToBook(Book book, Contact contact) {
        
        book.getContact().add(contact);
        //TODO add to database by calling utils
        
        return true;

    }

}
