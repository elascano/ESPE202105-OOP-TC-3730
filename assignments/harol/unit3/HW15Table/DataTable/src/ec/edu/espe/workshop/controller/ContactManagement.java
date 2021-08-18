/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.workshop.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.workshop.model.Contact;
import ec.edu.espe.workshop.view.FrmDatabaseSetup;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class ContactManagement {

    MongoDBManagement mongoDB = new MongoDBManagement();

    public void loadTableNames(JTable jTable, DefaultTableModel tableModel) {
        tableModel.addColumn("Contact");
        tableModel.addColumn("Email");
        tableModel.addColumn("Address");
        tableModel.addColumn("Phone Number");
        jTable.setModel(tableModel);
    }

    public void fillTableData(DefaultTableModel tableModel) throws ParseException {
        ArrayList<Contact> customers = new ArrayList<>();
        Gson gson = new Gson();
        String json = mongoDB.completeModel("Users", FrmDatabaseSetup.database);
        Type customerType = new TypeToken<ArrayList<Contact>>() {}.getType();
        customers = gson.fromJson(json, customerType);

        for (Contact customer : customers) {
            String[] rowProviders = {
                customer.getContact(), 
                customer.getEmail(),
                customer.getEmail(), 
                customer.getEmail()};
            tableModel.addRow(rowProviders);
        }
    }
}
