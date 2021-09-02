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
public class MongoDBManager implements DBManager{

    @Override
    public boolean add(String data, String table) {
        return true;
    }

    @Override
    public void update(String searchInfo, String table, String data) {
    }
    
}
