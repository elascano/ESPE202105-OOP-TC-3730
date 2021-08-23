/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import ec.edu.espe.book.model.Book;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public interface DBManager {

    public boolean connect(String conectionString);

    public boolean add(String name, Integer numberOfFriends, float salary, String email);

    public String read(String table);

    public void update(String searchInfo, String table, String data);

    public boolean delete(String searchInfo, String table);

    public String find(String serachInfo, String table);
    
}
