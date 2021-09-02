/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Herbalife.controller;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.Herbalife.model.Doctor;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class DoctorController {
    
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public DoctorController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Doctor");
            collection = DataBase.getCollection("Doctor");
            System.out.println("successful connection");
        }catch(UnknownHostException ex){
            Logger.getLogger(DoctorController.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
    
    
     public boolean add(String name, String email, int age, String adress, String specialization){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor(name, email, age, adress, specialization));
        for (Doctor pueC : doctors){
            collection.insert(pueC.dbDataDoctor());
            
        }
        
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;

       }
}
