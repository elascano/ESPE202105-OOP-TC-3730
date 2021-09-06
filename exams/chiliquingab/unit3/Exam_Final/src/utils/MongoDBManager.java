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
public interface MongoDBManager {
    public boolean create();
    public int[] read(int[] data1, int[] data2);
}
