/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.*;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class ContactController {

    public boolean addContactToBook(Contact contact, Book book) {
        book.getContacts().add(contact);
        //TODO add to dataBase by calling utils
        return true;
    }
}
