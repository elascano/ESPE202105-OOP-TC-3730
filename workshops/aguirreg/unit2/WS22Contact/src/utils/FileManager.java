/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class FileManager implements PersistenceI{

    @Override
    public boolean create(String data, String table) {
       return true; 
    }
    
    @Override
    public String read(String table) {
        return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        return "{}";
    }
        
}

