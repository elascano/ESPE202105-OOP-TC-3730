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
  * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class MongoDBManager implements DBManager{
   DB dbMongo;
    DBCollection tableMongo;
    
     

    @Override
    public boolean add(String name, Integer numberOfFriends, float salary, String email) {
        BasicDBObject document = new BasicDBObject();
        document.put("Name", name);
        document.put("Number of friends", numberOfFriends);
        document.put("Salary", salary);
        document.put("Email", email);
        tableMongo.insert(document);
        return true;
    }
       

    @Override
    public String read(String table) {
        return "[{},{},{}]";
    }

    @Override
    public void update(String searchInfo, String table, String data) {
    }

    @Override
    public boolean delete(String searchInfo, String table) {
        return true;
    }

    @Override
    public String find(String seachInfo, String table) {
        return "[{},{}]";
    }

    @Override
    public boolean connect(String conectionString) {
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            dbMongo = mongo.getDB("Contacts");
            tableMongo = dbMongo.getCollection("Information-Contacts");
        } catch (UnknownHostException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }
    }
    

