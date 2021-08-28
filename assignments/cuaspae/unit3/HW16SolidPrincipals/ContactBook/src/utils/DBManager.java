/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import ec.edu.espe.book.model.Book;




/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public interface DBManager {
    
    public boolean connect(String conectionString);

    public boolean add(Book book);

    public String read(String table);

    public void update(String searchInfo, String table, String data);

    public boolean delete(String searchInfo, String table);

    public String find(String serachInfo, String table);   
   
}
