/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class FileManager implements Persistence{

    @Override
    public boolean create(String data, String table) {
        
        //TODO insert data in the file table
        return true;
        
    }

    @Override
    public String read(String table) {
        
        //TODO read data from file "tabla".
        return "{}";
   
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data in the file table acording to the searchString.
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from table accordign to searching.
        return true;
    }

    @Override
    public String find(String searchString, String table) {
     //TODO find a record in the table file accoording to searchString
     return "{}";
    }
    
    
}
