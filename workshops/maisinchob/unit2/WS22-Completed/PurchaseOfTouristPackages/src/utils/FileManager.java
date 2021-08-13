/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class FileManager implements PersistenceI{

    @Override
    public boolean create(String data, String table) {
        //TODO insert dtaa in the file table
        return true;
    }

    @Override
    public String read(String table) {
        //TODO read data form file "table"
        return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data int the file table according to the searchString
        return true;
    }

    @Override
    public boolean delete(String searchString,  String table) {
        //TODO delete a record form table according to searchString
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find a record in the table file according to sarchString
        return "{}";
    }
    
}
