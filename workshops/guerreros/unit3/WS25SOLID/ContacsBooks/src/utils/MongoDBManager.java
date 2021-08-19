/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class MongoDBManager implements DBmanager {

    @Override
    public boolean add(String data, String table) {
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
    public String find(String searchInfo, String table) {
       return "[{},{}]";
    }

    @Override
    public boolean connect(String connectionString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
