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
public class FileManager implements PersistenceI{

    @Override
    public boolean create(String data, String table) {
       //TODO insert data in the file table
       return true;
    }

    @Override
    public String read(String table) {
        //TODO read data from file "table"
        return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
       //TODO update data in the file table accordnig to the searchString
       return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record fram table according to serchString
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
