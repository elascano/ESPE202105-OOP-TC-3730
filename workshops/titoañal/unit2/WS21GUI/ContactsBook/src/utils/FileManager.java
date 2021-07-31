/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class FileManager implements PersistenceI{

    @Override
    public boolean create(String data, String table) {
        //TODO insert data in the file table
        return true;
    }

    @Override
    public String read(String table) {
        //TODO read data from file "table"
        return "{}";
    }

    @Override
    public boolean update(String search, String data, String table) {
        //Todo update data in the file table according to the searchString
        return true;
    }
    

    @Override
    public boolean delete(String search, String table) {
        //TODO delete a record from table according to the searchString
        return true;
    }

    @Override
    public String find(String search, String table) {
        //TODO find a record in the table file according ro SearchStrring
        return "{}";
    }


    
    
}
