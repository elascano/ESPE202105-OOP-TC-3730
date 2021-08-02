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
public class DBManager implements PersistensInterface{
   public void connect(String database, String user, String password){
   
   }
    
    
    @Override
    public boolean create(String data, String table) {
     //inserte data in the database table
      return true; }

    @Override
    public String read(String table) {
    //TOdo read data from database "table"
    return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
    //TODO update in the database table acording to the searchString
    return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
    
    //Todo delete from database according to searchString
    
    return true;
    
    }

    @Override
    public String find(String searchString, String table) {
    
    //Todo find a record in the table database according searchString
    return "{}";
    }
}
