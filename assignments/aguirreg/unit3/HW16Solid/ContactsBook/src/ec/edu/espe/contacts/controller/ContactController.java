
package ec.edu.espe.contacts.controller;

import com.mongodb.*;
import ec.edu.espe.contacts.model.*;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ContactController {

    DB db;
    DBCollection table;
    BasicDBObject document = new BasicDBObject();

    public ContactController() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            db = mongo.getDB("Contact");
            table = db.getCollection("Contacts");
         
        } catch (UnknownHostException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean addContact(String name, Integer numberOfFriends, float salary, String email, String book) {

        ArrayList<Contact> inventory = new ArrayList<>();
        inventory.add(new Contact(name, numberOfFriends, salary, email,book));
        for (Contact pueC : inventory) {
            table.insert(pueC.dbContactObjectContactBook());

        }

        return true;

    }

}
