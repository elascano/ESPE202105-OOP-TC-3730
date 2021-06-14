/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class SistemDisplay {

    @Override
    public String toString() {
        return "SistemDisplay{" + '}';
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        
        a.setI(28);
        System.out.println("a.i -> " +a.getI()); 
        
        System.out.println("From Class Diagram to Code,\n"
                +"Mayte Chasi"); 
        
        b.setA(345);
       
        System.out.println("A-> " + a );
        
        b.setA(567);
        b.setB(198);
        
        System.out.println("B-> " + b );
        
        c.setF((float) 3.56);
        
        System.out.println("C-> " + c );
        
        d.setI(456);
        
        System.out.println("D-> " + d );
        
        e.setC ((char) 'h');
        
        System.out.println("E-> " + e );
        
        
        System.out.println("F-> " + f );
          
    }  
}
