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
import ec.edu.espe.book.model.Book;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class MongoDBManager implements DBManager {

    DB dbMongo;
    DBCollection tableMongo;

    @Override
    public boolean add(Book book) {
        BasicDBObject document = new BasicDBObject();
        //document.put("Name", name);
        //document.put("Number of friends", numberOfFriends);
        //document.put("Salary", salary);
        //document.put("Email", email);
        document.put("Book", book);
        tableMongo.insert(document);
        return true;
    }

    @Override
    public String read(String table) {
        return "{}";
    }

    @Override
    public void update(String searchInfo, String table, String data) {

    }

    @Override
    public boolean delete(String searchInfo, String table) {
        return true;
    }

    @Override
    public String find(String serachInfo, String table) {
        return "{}";
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

 
