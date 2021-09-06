/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author AnitaQ
 */
public interface DBManager {
    
    public boolean add(String data, String table);
    public void update(String searchInfo, String table, String data);
    
}
