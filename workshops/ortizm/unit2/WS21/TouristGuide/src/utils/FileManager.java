/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class FileManager implements PersistensInterface{

    @Override
    public boolean create(String data, String table) {
     //inserte data in the file table
      return true; }

    @Override
    public String read(String table) {
    //TOdo read data from file "table"
    return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
    //TODO update in the file table acording to the searchString
    return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
    
    //Todo delete from table according to searchString
    
    return true;
    
    }

    @Override
    public String find(String searchString, String table) {
    
    //Todo find a record in the table file according searchString
    return "{}";
    }
    
}
