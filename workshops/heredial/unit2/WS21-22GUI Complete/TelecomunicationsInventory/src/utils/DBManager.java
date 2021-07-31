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
public class DBManager implements Persistence{
    public void connect(String database,String user, String password){
        
    }

    @Override
    public boolean create(String data, String table) {
        
        //TODO insert data in the database collection table.
        return true;
        
    }

    @Override
    public String read(String table) {
        
        //TODO read data from the database collection "table".
        return "{}";
   
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data in the the database collection table acording to the searchString.
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from database collection accordign to searching.
        return true;
    }

    @Override
    public String find(String searchString, String table) {
     //TODO find a record in the table database collection accoording to searchString
     return "{}";
    }
    
    
    
}
