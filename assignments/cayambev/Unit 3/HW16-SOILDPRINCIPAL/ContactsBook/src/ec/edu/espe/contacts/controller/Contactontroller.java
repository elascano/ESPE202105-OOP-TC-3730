/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.contacts.model.Book;
import ec.edu.espe.contacts.model.Contact;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Contactontroller {
   
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public Contactontroller() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("ContactsBook");
            collection = DataBase.getCollection("Contacts");
            System.out.println("Welcome - successful connection");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Contactontroller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public boolean addContactToBook(String name, Integer numberOfFriends, float salary, String email) {

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(name, numberOfFriends, salary, email));

        for (Contact pueC : contacts) {
            collection.insert(pueC.dbContact());
        }

        int input = JOptionPane.showConfirmDialog(null, "Has been successfully registered", "OK", JOptionPane.DEFAULT_OPTION);
        System.out.println(input);

        return true;

    }
}
