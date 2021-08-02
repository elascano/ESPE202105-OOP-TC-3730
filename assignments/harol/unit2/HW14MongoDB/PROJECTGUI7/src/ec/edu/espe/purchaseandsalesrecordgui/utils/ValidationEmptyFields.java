package ec.edu.espe.purchaseandsalesrecordgui.utils;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class ValidationEmptyFields extends Validation {

    @Override
    public void emptyFields(java.awt.event.ActionEvent evt, JPanel pnl, JLabel jlbOnlyNumbersCedula, JLabel jlbOnlyNumbersCellphone, JLabel jlbValidateEmail) {
        super.emptyFields(pnl);
        jlbOnlyNumbersCedula.setText("");
        jlbOnlyNumbersCellphone.setText("");
        jlbValidateEmail.setText("");
    }

    @Override
    public void emptyFields(ActionEvent evt, JPanel pnl, JLabel jlbOnlyNumbersCellphone) {
        super.emptyFields(pnl);
        jlbOnlyNumbersCellphone.setText("");
    }
    
}
