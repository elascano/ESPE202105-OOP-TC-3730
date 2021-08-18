/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.workshop.controller;

import ec.edu.espe.workshop.model.MongoDB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoSecurityException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gte;
import static com.mongodb.client.model.Updates.set;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class MongoDBManagement {
    MongoDB mongoDB = new MongoDB();

    public MongoDatabase conecction(String user, String password, String nameOfDatabase) {
        //mongodb+srv://Luis:123@cluster0.9ecwf.mongodb.net/myFirstDatabase?retryWrites=true&w=majority        
        String URI = "mongodb+srv://" + user + ":" + password + "@cluster0.9ecwf.mongodb.net/" + nameOfDatabase + "?retryWrites=true&w=majority";
        try {
            mongoDB.setUri(new MongoClientURI(URI));
            mongoDB.setMongoClient(new MongoClient(mongoDB.getUri()));
            mongoDB.setDatabase(mongoDB.getMongoClient().getDatabase(nameOfDatabase));
            mongoDB.setCollection(mongoDB.getDatabase().getCollection("Comprobation"));
            mongoDB.getCollection().drop();
        } catch (MongoSecurityException a) {
            mongoDB.setDatabase(null);
        }
        return mongoDB.getDatabase();
    }

    public void save(Document document, String collection, MongoDatabase database) {
        MongoCollection<Document> collectionDocument = database.getCollection(collection);
        collectionDocument.insertOne(document);
    }

    public void update(String col, String key, Object value, Object newValue, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection(col);
        Bson filter = eq(key, value);
        Bson update = set(key, newValue);
        collection.findOneAndUpdate(filter, update);
    }

    public String find(String col, String key, Object value, MongoDatabase database) {
        String find = "";
        MongoCollection<Document> collections = database.getCollection(col);
        FindIterable<Document> iterable = collections.find(gte(key, value));
        MongoCursor<Document> cursor = iterable.iterator();
        while (cursor.hasNext()) {
            find = cursor.next().toJson();
        }
        return find;
    }

    public void delete(String col, String key, Object value, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection(col);
        Bson filter = eq(key, value);
        collection.findOneAndDelete(filter);
    }

    public String completeModel(String col, MongoDatabase database) throws ParseException {
        String json = "";
        JSONArray jsonArray = new JSONArray();
        MongoCollection<Document> collection = database.getCollection(col);
        MongoCursor<Document> resultDocument = collection.find().iterator();
        while (resultDocument.hasNext()) {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(resultDocument.next().toJson());
            jsonObject.remove("_id");
            jsonArray.add(jsonObject);
            json = jsonArray.toJSONString();
        }
        return json;
    }


}
