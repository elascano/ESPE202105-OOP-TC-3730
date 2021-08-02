package ec.edu.espe.purchaseandsalesrecordgui.utils;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public abstract class Validation {

    public boolean validateEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public void validateOnlyNumbers(java.awt.event.KeyEvent evt, JTextField txt, JLabel jlb) {
        char character = evt.getKeyChar();

        if (Character.isLetter(character)) {
            txt.setEditable(false);
            jlb.setText("Only Numbers!");
        } else {
            txt.setEditable(true);
        }
    }
    
    public void emptyFields(JPanel pnl){
        JTextField box;
        for (int i = 0; i < pnl.getComponentCount(); i++) {
            if (pnl.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                box = (JTextField) pnl.getComponent(i);
                box.setText("");
            }
        }
    }

    public abstract void emptyFields(java.awt.event.ActionEvent evt, JPanel pnl, JLabel jlbOnlyNumbersCedula, JLabel jlbOnlyNumbersCellphone, JLabel jlbValidateEmail);

    public abstract void emptyFields(java.awt.event.ActionEvent evt, JPanel pnl, JLabel jlbOnlyNumbersCellphone);

    public boolean validateCedula(String cedula) {

        int total = 0;
        int sizeCedula = 10;
        int[] coefficients = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int numberOfProvinces = 24;
        int thirdDigit = 6;

        if (cedula.matches("[0-9]*") && cedula.length() == sizeCedula) {
            int province = Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));
            int digitNumberThree = Integer.parseInt(cedula.charAt(2) + "");

            if ((province > 0 && province <= numberOfProvinces) && digitNumberThree < thirdDigit) {
                int verifiedDigitReceived = Integer.parseInt(cedula.charAt(9) + "");

                for (int i = 0; i < coefficients.length; i++) {
                    int value = Integer.parseInt(coefficients[i] + "") * Integer.parseInt(cedula.charAt(i) + "");
                    total = value >= 10 ? total + (value - 9) : total + value;
                }
                int verifiedDigitObtained = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;

                if (verifiedDigitObtained == verifiedDigitReceived) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

}
