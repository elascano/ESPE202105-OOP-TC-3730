/** Copyright ESPE-DECC
*/

package ec.edu.espe.contatcs.controller;

import ec.edu.espe.contatcs.model.Book;
import ec.edu.espe.contatcs.model.Contact;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactController implements ContactControllerI{
    public boolean addContactToBook(Book book, Contact contact){
        
        book.getContacts().add(contact);
        //TODO add to database by calling utils
        
        return true;
        
    }
}
