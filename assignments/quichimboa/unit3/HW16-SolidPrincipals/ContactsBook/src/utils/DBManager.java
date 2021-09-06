/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Andrea Quichimbo PROGRAM BUILDER ESPE-DCCO
 */
public interface DBManager {

    public boolean connect(String connectionString);
    
    public boolean add(String data, String table);

    public String read(String table);

    public void update(String searchInfo, String table, String data);

    public boolean delete(String searchInfo, String table);

    public String find(String searchInfo, String table);
}
