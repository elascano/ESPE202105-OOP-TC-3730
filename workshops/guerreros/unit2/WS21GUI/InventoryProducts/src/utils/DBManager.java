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
public class DBManager implements PersistenceI{
    public void connect(){}
    @Override
    public boolean create(String data, String table) {
        //TODO insete data in the database collection table
       return true;
       
    }

    @Override
    public String read(String table) {
       //TODO read data in the database collection table
        return"{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data in the file table according to the seachString
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete record in the file table
        return true;
    }

    @Override
    public boolean find(String searchString, String table) {
        //TODO find record in the file table according to searchString
        return true;
    } 
    
    
}
