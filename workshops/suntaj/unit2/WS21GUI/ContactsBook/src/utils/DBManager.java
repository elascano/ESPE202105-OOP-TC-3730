/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class DBManager implements PersistenceI {

    public void connect(String database, String user, String password){
        
    }
    
    @Override
    public boolean create(String data, String table) {
        //TODO inserte data in the database collection table
        return true;
    }

    @Override
    public String read(String table) {
        //TODO read data from the database collection "table"
        return "{";        
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data in the database collection table according to the searching
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from database collection according to searchString
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find a record in the database collection file according to searchString
        return "{";
    }
    
}
