/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.medical.controller;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.medical.model.Patient;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class PatientController {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public PatientController() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Patient");
            collection = DataBase.getCollection("Patients");
            System.out.println("Connected");
        } catch (UnknownHostException ex) {
            Logger.getLogger(PatientController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public boolean addPatientToBook(String name, String lastName, Integer age, String gender, String email, String address, Integer phone) {

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient(name, lastName, age, gender, email, address, phone));

        for (Patient pueC : patients) {
            collection.insert(pueC.dbPatient());

        }
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);

       
        return true;

    }
    
    public boolean delete(String lastName){
        document.put("lastName", lastName);
        collection.remove(document);
        int input = JOptionPane.showConfirmDialog(null, "Delete Record", "OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
               
                
    }
    
    
}
