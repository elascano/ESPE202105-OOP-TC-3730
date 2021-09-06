/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Book;
import ec.edu.espe.contacts.model.Contact;
import ec.edu.espe.contacts.view.FrmContact;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.bson.Document;
import org.json.simple.parser.ParseException;
import utils.MongoDBManager;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class ContactController {

    MongoDBManager mongoDB = new MongoDBManager();

    public void addContact(JTextField txtName, JTextField txtNumberOfFriends, JTextField txtSalary, JTextField txtEmail, JTextField txtBook, 
            JComboBox comboBox, Component rootPane, JPanel pnl) {

        Contact contact = new Contact();
        contact.setName(txtName.getText());
        contact.setNumberOfFriends(Integer.parseInt(txtNumberOfFriends.getText()));
        contact.setSalary(Float.parseFloat(txtSalary.getText()));
        contact.setEmail(txtEmail.getText());

        Book book = new Book();
        if ("Friends".equals(comboBox.getSelectedItem().toString())) {
            ArrayList<Contact> contactFriends = new ArrayList<>();
            contactFriends.add(contact);
            book.setId(0);
            book.setDescription(comboBox.getSelectedItem().toString());
            book.setContacts(contactFriends);
        }

        if ("Family".equals(comboBox.getSelectedItem().toString())) {
            ArrayList<Contact> contactFamily = new ArrayList<>();
            contactFamily.add(contact);
            book.setId(1);
            book.setDescription(comboBox.getSelectedItem().toString());
            book.setContacts(contactFamily);
        }

        if ("Job".equals(comboBox.getSelectedItem().toString())) {
            ArrayList<Contact> contactJob = new ArrayList<>();
            contactJob.add(contact);
            book.setId(2);
            book.setDescription(comboBox.getSelectedItem().toString());
            book.setContacts(contactJob);
        }

        if ("Sport".equals(comboBox.getSelectedItem().toString())) {
            ArrayList<Contact> contactSport = new ArrayList<>();
            contactSport.add(contact);
            book.setId(3);
            book.setDescription(comboBox.getSelectedItem().toString());
            book.setContacts(contactSport);
        }

        Document document = new Document();
        document.put("name", contact.getName());
        document.put("numberOfFriends", contact.getNumberOfFriends());
        document.put("salary", contact.getSalary());
        document.put("email", contact.getEmail());
        document.put("book", book.getDescription());
        int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to save this information?");
        if (saveOption == 0) {
            mongoDB.add(document, "Contacts", FrmContact.database);
            JOptionPane.showMessageDialog(rootPane, "Save!");
            emptyFields(pnl);
        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, try again.");
        }

    }

    public void emptyFields(JPanel pnl) {
        JTextField box;
        for (int i = 0; i < pnl.getComponentCount(); i++) {
            if (pnl.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                box = (JTextField) pnl.getComponent(i);
                box.setText("");
            }
        }
    }

}
