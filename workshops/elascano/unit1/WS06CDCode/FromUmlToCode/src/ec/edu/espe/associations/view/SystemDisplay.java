/** Copyright ESPE-DECC
*/

package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class SystemDisplay {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        

        a.setI(28);
        System.out.println("a.i -> " + a.getI());

        System.out.println("From Class Diagram to Code, \n "
                + "Edison Lascano");
        
        b.setA(567);
        b.setB(198);
        
        System.out.println("a -> " + a);
        
        System.out.println("b -> " + b);
        System.out.println("c -> " + c);
        System.out.println("d -> " + d);
        System.out.println("e -> " + e);
        System.out.println("f -> " + f);
        
    }
}
