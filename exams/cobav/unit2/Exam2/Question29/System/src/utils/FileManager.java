/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Victor Coba Beta Software ESPE-DCCO
 */
public class FileManager implements Persistence{
    
    public void crete(String data, String table) {
       //TODO create the file
    }

    @Override
    public String read(String table) {
        //TODO read the file
        return "";
    }

    @Override
    public String find(String seachString, String table) {
        //TODO find the file
        return "";
    }

    @Override
    public boolean update(String seachString, String data, String table) {
        //TODO update the file
        return true;
    }

    @Override
    public boolean delete(String seacString, String table) {
        return true;
    }

    @Override
    public void create(String date, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}