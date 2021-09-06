/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.electronicmaterial.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.electronicmaterial.modell.ElectronicMaterial;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Erick Yánez LAMESTech
 */
public class ElectronicMaterialController {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public ElectronicMaterialController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("ElectronicMaterial");
            collection = DataBase.getCollection("Electronic Materials");
            System.out.println("Connected");
      } catch (UnknownHostException ex) {
            Logger.getLogger(ElectronicMaterialController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
    public boolean add(String ID,String Model,String RegistrationNumber, String Color){
        ArrayList<ElectronicMaterial> carss = new ArrayList<>();
        carss.add(new ElectronicMaterial(ID, Model, RegistrationNumber,Color));
        for (ElectronicMaterial pueC : carss){
            collection.insert(pueC.dbCarObjectConcessionaire());
            

    }
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;

       }
}


