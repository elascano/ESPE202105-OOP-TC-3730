/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Healt.controller;


import com.mongodb.*;
import ec.edu.espe.Healt.model.*;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *              TEAM 1 Healt&Life
 * @authors Bryan Chiliquinga 
 *          Gabriel Sebastian Aguirre Almache
 *          Bryan David Chiliquinga Lema
 *          Stefany Paola Guerrero Cordova
 *          Luis Alberto Heredia Iza
 *          Josselyn Gabriela Sunta Barzallo
 */
public class PatientController {

    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public  PatientController() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("HealtLife");
            collection = DataBase.getCollection("MedicalRoom");
            System.out.println("successful connection");
        } catch (UnknownHostException ex) {
                  Logger.getLogger(PatientController.class.getName()).log(Level.SEVERE, null, ex);
        }

     
    }

    public boolean addPatient(String name,
            Integer age,
            Integer ci,
            String gender,
            String address,
            Integer phoneNumber,
            String occupation,
            String email,
            float weight,
            String admissionDate) {

        ArrayList<Patient> patient = new ArrayList<>();
        patient.add(new Patient(name, age, ci, gender, address, phoneNumber, occupation, email, weight, admissionDate));
        for (Patient pueC : patient) {
            collection.insert(pueC.dBPatientObjectHealtLife());
        }

        return true;
    }

}
