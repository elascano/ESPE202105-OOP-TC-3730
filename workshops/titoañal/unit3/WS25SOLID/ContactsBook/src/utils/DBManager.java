/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public interface DBManager {
    public boolean connect(String connectionString); 

    public boolean add(String data, String table);

    public String read(String table);

    public void update(String searchInfo, String table, String data);

    public boolean delete(String searchInfo, String table);

    public String find(String searchInfo, String table);

}
