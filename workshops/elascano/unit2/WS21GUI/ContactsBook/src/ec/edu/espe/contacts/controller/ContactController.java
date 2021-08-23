/** Copyright ESPE-DECC
*/

package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Contact;
import ec.edu.espe.contacts.model.Sport;
import ec.edu.espe.contacts.view.FrmContact;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.PersistenceI;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmCOntact;
    private PersistenceI persistence;

    public void add(Contact contact){
        //TODO add contact to database
        //TODO call the utils classes
        persistence = new DBManager();
        //TODO convert contact to json;
        String contactJson= "{\"firstname\":\"Edison\"}";
        persistence.create(contactJson, "contacts");
    }
    
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO find the contact(s) by email using utils
        Contact contact = new Contact("ed", "lascano", "password", "0961194040", "ed@ed.espe.edu.ec", "descrption", "male", new ArrayList<Sport>(), LocalDateTime.MIN, 0);
        contacts.add(contact);
        return contacts;
    }
    
    public boolean delete(String email){
        boolean deleted=false;
        //TODO 
        ArrayList<Contact> contacts= new ArrayList<>();
        contacts = find(email);
        if (contacts.size()>0){
            //TODO delete from data base
            deleted = true;
        }
        return deleted;
    }
    
    public boolean update(String email){
        boolean updated=false;
        //TODO 
        ArrayList<Contact> contacts= new ArrayList<>();
        contacts = find(email);
        if (contacts.size()>0){
            //TODO save from data base
            updated = true;
        }
        return updated;
    }
    
    
    public ContactController(Contact contact, FrmContact frmCOntact) {
        this.contact = contact;
        this.frmCOntact = frmCOntact;
    }

    
    
    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @return the frmCOntact
     */
    public FrmContact getFrmCOntact() {
        return frmCOntact;
    }

    /**
     * @param frmCOntact the frmCOntact to set
     */
    public void setFrmCOntact(FrmContact frmCOntact) {
        this.frmCOntact = frmCOntact;
    }
    
    
    
    

}
