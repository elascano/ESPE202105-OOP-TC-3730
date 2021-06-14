/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.association.view;
import ec.edu.ec.association.model.*;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class SystemDisplay1 {
    public static void main(String[] args) {
        System.out.println("Hello From System Display, \n" + "Karen Quilumbaquin");
        Person a=new Person();
        Zone b=new Zone();
        Group c=new Group();
        Bonus d=new Bonus();
        SpecialPension e=new SpecialPension();
        
        a.setName("Nicole");
        a.setLastName("Quilumbaquin");
        a.setAge(60);
        b.setName("Quito");
        b.setType(2);
        c.setAgeRange(85);
        c.setGenderType("Femenino");
        d.setAmount(345);
        e.setAmount(125);
        e.setType(2);
        
        System.out.println("a->"+ a.getName());
        System.out.println("a->"+ a.getLastName());
        System.out.println("a->"+ a.getAge());
        System.out.println("b ->"+b.getName());
        System.out.println("b ->"+b.getType());
        System.out.println("c ->"+c.getAgeRange());
        System.out.println("c ->"+c.getGenderType());
        System.out.println("d ->"+d.getAmount());
        System.out.println("e ->"+e.getAmount());
        System.out.println("e ->"+e.getType());
        
    }
    
}
