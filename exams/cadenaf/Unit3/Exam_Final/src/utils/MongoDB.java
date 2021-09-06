/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.awt.List;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class MongoDB implements MongoDBManager{

    DB dbMongo;
    DBCollection tableMongo;
    
    @Override
    public boolean create() {
        try {
            Mongo mongo = new Mongo("Localhost", 27017);
            dbMongo = mongo.getDB("Exam");
            tableMongo = dbMongo.getCollection("Data");
        } catch (UnknownHostException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public int[] read(int[] data1, int[] data2) {
        BasicDBObject document = new BasicDBObject();
        document.put("Sin ordenar", data1);
        document.put("Ordenado", data2);
        tableMongo.insert(document);
        return null;
    }
    
}
