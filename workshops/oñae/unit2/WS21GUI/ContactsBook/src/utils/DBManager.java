/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;



/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class DBManager implements PersistenceI {
    
public void connect(String database,String user,String password){
    
    
        
 }
     @Override
    public boolean create(String data, String table) {
        //TODO inserte data in the file table
        return true;
        
    }

    @Override
    public String read(String table) {
       //TODO read data from file"table"
       return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data in the file table acording to the searchString
        return true;
    }

    @Override
    public boolean delet(String searchString, String table) {
        //TODO  delet  a record from table acording to searchString
        return true;
        
    }

    @Override
    public String find(String searchString, String table) {
     //TODO  find a record in the table file according to searchString
     return "{}";
    }
        
}
    

