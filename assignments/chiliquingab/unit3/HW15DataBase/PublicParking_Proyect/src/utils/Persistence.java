/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public interface Persistence {
    //CRUD
    public boolean create();
    public String read(String code, String drivers, String cars, String description);
    public boolean update(String data); 
    public boolean delete(String searchString, String table);
    public String find(String searchString);
}
