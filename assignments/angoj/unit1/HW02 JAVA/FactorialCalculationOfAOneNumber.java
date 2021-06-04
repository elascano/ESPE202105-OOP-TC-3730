/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.calculation.of.a.one.number;
import java .util.Scanner;
/**
 *
 * @author Johny Javier Ango
 */
public class FactorialCalculationOfAOneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial=1;
        int numero;
        Scanner valor= new Scanner(System.in);
        System.out.println("Enter number: ");
        numero=valor.nextInt();
        for (int i = numero; i > 0; i--){
            factorial=factorial*i;
        
        }
             System.out.println("the factorial is :"+numero+" is: " +factorial);   
    }
    
}
