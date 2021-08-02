/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public interface PersistenceI {
    //CRUD
    public boolean  create(String data, String table);
    public String read(String table);
    public boolean update(String search, String data,String table);
    public boolean delete (String search,String table);
    public String find(String search,String table);
    
}
