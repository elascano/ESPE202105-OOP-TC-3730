/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.model;

import java.util.Date;


/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class Cow extends FarmAnimal{
    int age;

    public Cow(int id, String breed, Date bornOn, int age) {
        super(id, breed, bornOn);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString() + "age=" + age + '}';
    }
    
    
}
