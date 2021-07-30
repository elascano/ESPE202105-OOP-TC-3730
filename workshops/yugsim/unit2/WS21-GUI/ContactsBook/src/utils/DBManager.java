/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class DBManager implements PersistenceI{
    
    
    
    @Override
    public boolean create(String data, String table) {
        //TODO insert data in the database table 
        return true;
    }

    @Override
    public String read(String table) {
        //TODO read data from the database "table"
        return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TTODO update data in the database collection table accordind to the searchString
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from database collection to the searchString
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        //TOD Find a record in the table database collection according to searchString
        return "{}";
    }
}
