/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
  * @author Geraldi Chasi Team of Machine ESPE-DCCD
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
        //TODO update in the file table according to the searchString
        return true; 

    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from table according to searchString
        return true; 
    }

    @Override
    public String find(String searchString, String table) {
       //TODO FIND A RECORD IN THE TABLE ACORDING TO SEARCHsTRING 
    return "{}"; 
    }
    
}

