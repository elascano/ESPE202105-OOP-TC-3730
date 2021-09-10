/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Pachacama Alexander ESPE-DCCO
 */
public class Connection {
    private String cluster;
    private MongoClientURI uri;
    private MongoClient mongoClient;
    private MongoDatabase database; 
    private MongoCollection collection;

    public Connection() {
        cluster = "mongodb+srv://DarwinValdiviezo:darwin123@sorting.f92g4.mongodb.net/SortingStrategy?retryWrites=true&w=majority";
        uri = new MongoClientURI(getCluster());
        mongoClient = new MongoClient(getUri());
        database= mongoClient.getDatabase("Sorting");
        collection = database.getCollection("Strategy");
    }

    /**
     * @return the cluster
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * @param cluster the cluster to set
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * @return the uri
     */
    public MongoClientURI getUri() {
        return uri;
    }

    /**
     * @param uri the uri to set
     */
    public void setUri(MongoClientURI uri) {
        this.uri = uri;
    }

    /**
     * @return the mongoClient
     */
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    /**
     * @param mongoClient the mongoClient to set
     */
    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    /**
     * @return the database
     */
    public MongoDatabase getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }

    /**
     * @return the collection
     */
    public MongoCollection getCollection() {
        return collection;
    }

    /**
     * @param collection the collection to set
     */
    public void setCollection(MongoCollection collection) {
        this.collection = collection;
    }
}