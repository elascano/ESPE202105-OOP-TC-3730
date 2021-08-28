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
public interface DBManager {
    public Boolean connect(String connectionString);

    public boolean add(String data, String table);

    public String read(String table);

    public void update(String searchInfo, String data);

    public boolean delete(String searchInfo, String table);

    public String find(String searchinfo, String table);

    
}
