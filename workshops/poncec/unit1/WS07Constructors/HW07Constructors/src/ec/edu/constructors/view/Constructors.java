
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.constructors.view;

import ec.edu.constructors.model.Television;

/**
 *
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class Constructors {
    
    public static void main(String[] args) 
    {
        
        System.out.println("Hello From Television Object");
        
        Television television; 
        television = new Television("Samsung","Grey",65);
        System.out.println(television);
    }
    }
