/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class DBManager implements PersistenceI {
    
    public void connect(String database, String user, String password){
        
    }
     @Override
    public boolean create(String data, String table) {
       //TODO insert data in the data base collection table
       return true;
    }

    @Override
    public String read(String table) {
        //TODO read data from the data base collection  "table"
        return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
       //TODO update data in the data base collection table accordnig to the searchString
       return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a the data base collection  table according to serchString
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find a record in the data base collection table according yo searchString
        return "{}";
    }
    
}
