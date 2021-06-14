/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class LogicOperators {
 
    public static void main(String[] args) {
       Age a =new Age();
       a.setI(28);
        System.out.println("a.i ->" + a.getB());
        System.out.println("From Class Diagram to Code,\n" + "Andrea Quichimbo");
        
    }

    private static class Age {
        private String b;

        public Age() {
        }

        private String getB() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setI(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
