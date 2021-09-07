/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventorymaterial.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.inventorymaterial.model.Inventory;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author LAMESTech ESPE-DCC0
 */
public class InventoryController {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public InventoryController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Inventory");
            collection = DataBase.getCollection("Inventory");
            System.out.println("Connected");
      } catch (UnknownHostException ex) {
            Logger.getLogger(InventoryController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
    public boolean add(String Product,String ID,String Fabricator, String Quantity){
        ArrayList<Inventory> materialss = new ArrayList<>();
        materialss.add(new Inventory(Product, ID, Fabricator,Quantity));
        for (Inventory pueC : materialss){
            collection.insert(pueC.dbMaterialObjectInventory());
            

    }
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;

       }
}


