/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Asus
 */
public class DBManager implements PersistenceI {
   
    public void connect(String database, String user , String password){
        
    }
    @Override
    public boolean create(String data, String table) {
        //TODO insert data in the database collection table
        return true;
    }

    @Override
    public String read(String table) {
        //TODO read data from the database collection "table"
        return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data int the database collection  table according to the searchString
        return true;
    }

    public boolean delete(String searchString,  String table) {
        //TODO delete a record form database  collection table according to searchString
        return true;
    }

    public String find(String searchString, String table) {
        //TODO find a record in the table database collection  according to sarchString
        return "{}";
    }

    @Override
    public boolean delet(String searchString, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String find(String searchString, String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}