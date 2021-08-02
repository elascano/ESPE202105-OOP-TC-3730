/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class DBManager implements PersistenceI {
    
    
      @Override
    public boolean create(String data, String table) {
       //TODO INSERTE DATA IN THE DATA BASE TABLE
       return true;
       
    }

    @Override
    public String read(String table) {
       //TODO READ DATA FROM DATABASE DATA
       return "{}";
       
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update 
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        
        return true;
        
    }

    @Override
    public String find(String searchString, String table) {
       //TODO find a record in the table database
       
       return "{}";
    }
    
}
