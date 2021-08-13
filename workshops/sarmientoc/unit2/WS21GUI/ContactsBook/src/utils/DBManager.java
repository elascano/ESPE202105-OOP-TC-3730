/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class DBManager implements PersistenceI {
    
    public void connect(String database, String user, String password){
        
    }
    
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
