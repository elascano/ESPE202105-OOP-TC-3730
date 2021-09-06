/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SortApp.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class DataController {

    public int[] ChangeVector(ArrayList<Integer> arrInt) {
        int vect[] = new int[arrInt.size()];
        for (int i = 0; i < arrInt.size(); i++) {
            vect[i] = arrInt.get(i);
        }
        return vect;
    }

    public ArrayList<Integer> CreateArray(ArrayList<String> arrStr) {
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        for (int i = 0; i < arrStr.size(); i++) {
            arrInt.add(Integer.parseInt(arrStr.get(i)));
        }
        return arrInt;
    }

    public ArrayList<String> JoinArray(ArrayList<String> arrStr, int value) {
        for (int i = 0; i < value; i++) {
            arrStr.add(JOptionPane.showInputDialog("Escriba su " + (i + 1) + " valor del arreglo: "));
        }
        return arrStr;
    }

}
