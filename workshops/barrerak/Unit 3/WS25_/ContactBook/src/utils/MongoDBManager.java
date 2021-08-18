/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class MongoDBManager implements DBManager{

    @Override
    public boolean add(String data, String table) {
        return true;
    }

    @Override
    public String read(String table) {
      return "[(),(),()]";
    }

    @Override
    public void update(String searchInfo, String data) {
     
    }

    @Override
    public boolean delete(String searchInfo, String table) {
       return true;
    }

    @Override
    public String find(String searchinfo, String table) {
       return "[(),()]";
    }

    @Override
    public Boolean connect(String connectionString) {
        return true;
    }
    
}
