
package calculo.de.un.cuadrado;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        CalculoDeUnCuadrado c1;
        float lado1,lado2;
        
        lado1= Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        lado2= Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));
        
        if(lado1 == lado2){ //Es un cuadrado
            c1= new CalculoDeUnCuadrado(lado1);
        }
        else{
            c1 = new CalculoDeUnCuadrado(lado1, lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El Area es: "+c1.getArea());
        System.out.println("La diagonal es: "+c1.getDiagonal());
        
        
}
}

        

