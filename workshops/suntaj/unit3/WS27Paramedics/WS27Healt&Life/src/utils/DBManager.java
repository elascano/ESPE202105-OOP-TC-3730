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
public interface DBManager {

    public boolean connection();

    public boolean add(String name, Integer age, Integer id, String gener,
            String direction, int numberOfPhone, String ocupation, String email, float weight, String admissionDate);
}
