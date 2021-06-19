/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.de.un.cuadrado;

public class CalculoDeUnCuadrado {

        private float lado1;
        private float lado2;
        
        //Constructor

    public CalculoDeUnCuadrado(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public CalculoDeUnCuadrado(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
        
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }    
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
     public float getDiagonal(){
        float diagonal = (float) Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2));
        return diagonal;
    }
}
    
