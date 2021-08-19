/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controler;

import ec.edu.espe.contacts.model.Book;
import ec.edu.espe.contacts.model.Contact;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class ContactController {
    public boolean addContactToBook(Book book, Contact contac){
       
       book.getContacts().add(contac);
       //TODO add to database by calling utils
       
        return true;
    }
}
