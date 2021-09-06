/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
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
public class MongoDBManager implements DBManager {

    private static MongoClientURI uri;
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;

    @Override
    public boolean add(Document document, String collection, MongoDatabase database) {
        boolean isAdded = true;
        try {
            MongoCollection<Document> collectionDocument = database.getCollection(collection);
            collectionDocument.insertOne(document);
        } catch (MongoException e) {
            isAdded = false;

        }
        return isAdded;
    }

    @Override
    public String read(String col, MongoDatabase database) throws ParseException{
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

    @Override
    public void update(String col, String key, Object value, Object newValue, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection(col);
        Bson filter = eq(key, value);
        Bson update = set(key, newValue);
        collection.findOneAndUpdate(filter, update);
    }

    @Override
    public boolean delete(String col, String key, Object value, MongoDatabase database) {
        boolean isDeleted = true;
        try {
            MongoCollection<Document> collection = database.getCollection(col);
            Bson filter = eq(key, value);
            collection.findOneAndDelete(filter);
        } catch (MongoException e) {
            isDeleted = false;
        }
        return isDeleted;
    }

    @Override
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

    @Override
    //mongodb+srv://Luis:123@cluster0.9ecwf.mongodb.net/myFirstDatabase?retryWrites=true&w=majority
    public MongoDatabase connect(String user, String password, String nameOfDatabase) {
        String URI = "mongodb+srv://" + user + ":" + password + "@cluster0.9ecwf.mongodb.net/" + nameOfDatabase + "?retryWrites=true&w=majority";
        try {
            uri = new MongoClientURI(URI);
            mongoClient = new MongoClient(uri);
            database = mongoClient.getDatabase(nameOfDatabase);

            database.createCollection("Comprobation");
            collection = database.getCollection("Comprobation");
            collection.drop();

        } catch (MongoSecurityException a) {
            database = null;
        }

        return database;
    }

}
