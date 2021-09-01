/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sistemahospitalario.controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public abstract class FieldController {
    
    public boolean validarEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public boolean validarCedula(String cedula) {
        int total = 0;
        int tamanoCedula = 10;
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int numeroDeProvincias = 24;
        int tercerDigito = 6;

        if (cedula.matches("[0-9]*") && cedula.length() == tamanoCedula) {
            int provincia = Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));
            int digitoNumeroTres = Integer.parseInt(cedula.charAt(2) + "");

            if ((provincia > 0 && provincia <= numeroDeProvincias) && digitoNumeroTres < tercerDigito) {
                int digitoDeVerificacion = Integer.parseInt(cedula.charAt(9) + "");

                for (int i = 0; i < coeficientes.length; i++) {
                    int value = Integer.parseInt(coeficientes[i] + "") * Integer.parseInt(cedula.charAt(i) + "");
                    total = value >= 10 ? total + (value - 9) : total + value;
                }
                int verificacion = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;

                if (verificacion == digitoDeVerificacion) {
                    return true;
                }
            }
            return false;
        }
        return false;
    } 
    
    public void validarSoloNumeros(java.awt.event.KeyEvent evt, JTextField txt, JLabel jlb) {
        char character = evt.getKeyChar();

        if (Character.isLetter(character)) {
            txt.setEditable(false);
            jlb.setText("Solo números.");
        } else {
            txt.setEditable(true);
        }
    }
    
    public void validarSoloLetras(java.awt.event.KeyEvent evt, JTextField txt, JLabel jlb) {
        char validar = evt.getKeyChar();        
        if (Character.isDigit(validar)) {
            txt.setEditable(false);
            jlb.setText("Solo letras.");
        } else {
            txt.setEditable(true);
        }
    }
}
