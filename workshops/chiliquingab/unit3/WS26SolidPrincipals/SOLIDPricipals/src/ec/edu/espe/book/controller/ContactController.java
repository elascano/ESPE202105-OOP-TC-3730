/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.controller;

import ec.edu.espe.book.model.Book;
import ec.edu.espe.book.model.Contact;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class ContactController {

    public boolean addContactToBook(Book book, Contact contact) {
        book.getContacts().add(contact);
        //TODO add to database by calling utils
        return true;
    }
}
