/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.washingmachine;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class WashingMachine {
    public static String lavar(){ 
        String encendido="lavando";
        return encendido;
    }
    public static String remojar(float capacidad, String niveldeagua,int temporizador,String tipodelavado){ 
       String encendido="remojando";
        return encendido;
    }
    public static String exprimir(float capacidad,int temporizador){ 
        String encendido="exprimiendo";
        return encendido;
    }
    
}
