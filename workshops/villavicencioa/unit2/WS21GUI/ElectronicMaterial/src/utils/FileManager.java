/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class FileManager implements PersistenceI{

    @Override
    public boolean create(String data, String table) {
        //TODO inserte data in the file table
        return true;
    }

    @Override
    public String read(String table) {
     //TODO read all data from file "table"
       return "{}";
    }

    @Override
    public boolean update(String searchString, String date, String table) {
        //TODO update data in the file table according to the searchString
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from table according to searchString
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find record in the table file according to searchString
        return "{}";
    }
    
}
