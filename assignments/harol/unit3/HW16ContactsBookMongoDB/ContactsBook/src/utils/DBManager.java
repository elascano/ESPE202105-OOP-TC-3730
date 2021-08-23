/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */

public interface DBManager {

    public MongoDatabase connect(String user, String password, String nameOfDatabase);
    
    public boolean add(Document document, String collection, MongoDatabase database);

    public String read(String col, MongoDatabase database )throws ParseException;

    public void update(String col, String key, Object value, Object newValue, MongoDatabase database);

    public boolean delete(String col, String key, Object value, MongoDatabase database);

    public String find(String col, String key, Object value, MongoDatabase database);

}
