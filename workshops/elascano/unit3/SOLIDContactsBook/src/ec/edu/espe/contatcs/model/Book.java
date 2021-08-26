/** Copyright ESPE-DECC
*/

package ec.edu.espe.contatcs.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Book {
    private int id;
    private String description;
    private ArrayList<Contact> contacts;

    public Book(int id, String description, ArrayList<Contact> contacts) {
        this.id = id;
        this.description = description;
        this.contacts = contacts;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the contacts
     */
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    /**
     * @param contacts the contacts to set
     */
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    
    
}
