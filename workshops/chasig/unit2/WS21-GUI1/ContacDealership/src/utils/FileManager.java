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
public class FileManager implements PersistencesI{

    @Override
    public boolean create(String data, String table) {
        //TODO insert data in the file
     return true;
       
    }

    @Override
    public String read(String table) {
        //TODO read data from  file "table"
        return"{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
       //TODO update data in the file tale according to the serchString
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
       //TODO delete a record from table according to seachString
        return true;
    }

    @Override
    public boolean find(String searchString, String table) {
        //TODO delete a record from table according to seachString
        return true;
    }
    
}
