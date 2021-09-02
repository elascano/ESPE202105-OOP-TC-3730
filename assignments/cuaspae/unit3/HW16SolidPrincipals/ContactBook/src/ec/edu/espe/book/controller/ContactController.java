/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.controller;

import ec.edu.espe.book.model.Book;
import ec.edu.espe.book.model.Contact;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class ContactController {
    public boolean addContactToBook(Book book, Contact contact) {
        book.getContacts().add(contact);
        //TODO add to database by calling utils
        return true;
    }

    public void emptyBoxes(JPanel panel) {

        for (Object obj : panel.getComponents()) {
            if (obj instanceof JTextField) {
                ((JTextField) obj).setText("");
            }
        }

    }

    public ContactController() {
    }
    
}
