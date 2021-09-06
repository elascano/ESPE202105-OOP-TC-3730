/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public interface MongoDBManager {
    public boolean create();
    public int[] read(int[] data1, int[] data2);
}
