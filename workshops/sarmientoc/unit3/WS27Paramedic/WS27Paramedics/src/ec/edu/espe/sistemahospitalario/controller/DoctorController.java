/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sistemahospitalario.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dbmanager.MongoDB;
import ec.edu.espe.sistemahospitalario.model.Doctor;
import ec.edu.espe.sistemahospitalario.view.FrmDatabase;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class DoctorController {

    public void addMedic(JTextField txtId, JTextField txtName, JTextField txtDirection, JTextField txtPhone,
            JTextField txtEmail, JRootPane rootPane) {
        if ("".equals(txtId.getText()) || "".equals(txtName.getText()) || "".equals(txtDirection.getText()) || "".equals(txtPhone.getText()) || "".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(rootPane, "There are empty fields!");
        } else {
            FieldController validacionDeDatos = new FieldController() {
            };
            Document document = new Document();
            document.put("id", Integer.parseInt(txtId.getText()));
            document.put("name", txtName.getText());
            document.put("direction", txtDirection.getText());
            document.put("phone", Integer.parseInt(txtPhone.getText()));
            document.put("email", txtEmail.getText());
            int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to save this information?");
            if (saveOption == 0) {
                MongoDB.save(document, "Doctors", FrmDatabase.database);
                JOptionPane.showMessageDialog(rootPane, "Saved!");
            } else if (saveOption == 1) {
                JOptionPane.showMessageDialog(rootPane, "Ok,try again.");
            }

        }

    }

    public void loadTableDoctor(JTable jtbProviderInformation, DefaultTableModel tableModel) {
        tableModel.addColumn("ID Doctor");
        tableModel.addColumn("Name");
        tableModel.addColumn("Direction");
        tableModel.addColumn("Phone");
        tableModel.addColumn("Email");
        jtbProviderInformation.setModel(tableModel);
    }

    public void fillTableDoctor(DefaultTableModel tableModel) throws ParseException {
        String json = MongoDB.completeModel("Doctors", FrmDatabase.database);
        ArrayList<Doctor> doctors = new Gson().fromJson(json, new TypeToken<ArrayList<Doctor>>() {
        }.getType());

        for (Doctor doctor : doctors) {
            String[] rowDoctors = {
                String.valueOf(doctor.getId()),
                doctor.getName(),
                doctor.getDirection(),
                String.valueOf(doctor.getPhone()),
                doctor.getEmail()
            };
            tableModel.addRow(rowDoctors);
        }
    }

    public void loadComboBoxDoctor(JComboBox comboBox, DefaultComboBoxModel comboBoxModel) throws ParseException {
        String json = MongoDB.completeModel("Doctors", FrmDatabase.database);
        ArrayList<Doctor> doctors = new Gson().fromJson(json, new TypeToken<ArrayList<Doctor>>() {
        }.getType());
        for (Doctor doctor : doctors) {
            comboBoxModel.addElement(doctor);
        }
        comboBox.setModel(comboBoxModel);
    }

    public void searchDoctor(JComboBox comboBoxModel, DefaultTableModel tableModel) throws ParseException {
        String json = MongoDB.completeModel("Doctors", FrmDatabase.database);
        ArrayList<Doctor> doctors = new Gson().fromJson(json, new TypeToken<ArrayList<Doctor>>() {
        }.getType());

        Doctor doctor = (Doctor) comboBoxModel.getSelectedItem();

        String[] rowDoctors = {
            String.valueOf(doctor.getId()),
            doctor.getName(),
            doctor.getDirection(),
            String.valueOf(doctor.getPhone()),
            doctor.getEmail()
        };

        tableModel.addRow(rowDoctors);

    }

    public void findDoctor(JComboBox comboBoxModel, JTextField txtName, JTextField txtDirection, JTextField txtPhone,
            JTextField txtEmail) throws ParseException {
        String json = MongoDB.completeModel("Doctors", FrmDatabase.database);
        ArrayList<Doctor> doctors = new Gson().fromJson(json, new TypeToken<ArrayList<Doctor>>() {
        }.getType());
        Doctor doctor = (Doctor) comboBoxModel.getSelectedItem();
        txtName.setText(doctor.getName());
        txtDirection.setText(doctor.getDirection());
        txtPhone.setText(String.valueOf(doctor.getPhone()));
        txtEmail.setText(doctor.getEmail());
    }

    public void updateDoctor(Component rootPane, DefaultComboBoxModel comboBoxModel, JTextField txtName, JTextField txtDirection,
            JTextField txtPhone, JTextField txtEmail) {

        int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to save this information?");
        if (saveOption == 0) {
            Doctor doctor = (Doctor) comboBoxModel.getSelectedItem();
            MongoDB.update("Doctors", "id", doctor.getId(), doctor.getId(), FrmDatabase.database);
            MongoDB.update("Doctors", "name", doctor.getName(), txtName.getText(), FrmDatabase.database);
            MongoDB.update("Doctors", "direction", doctor.getDirection(), txtDirection.getText(), FrmDatabase.database);
            MongoDB.update("Doctors", "phone", doctor.getPhone(), txtPhone.getText(), FrmDatabase.database);
            MongoDB.update("Doctors", "email", doctor.getEmail(), txtEmail.getText(), FrmDatabase.database);
            JOptionPane.showMessageDialog(rootPane, "Updated!.");
        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, try again.");
        }
    }

    public void deleteDoctor(Component rootPane, DefaultComboBoxModel comboBoxModel) {
        int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to save this information?");

        if (saveOption == 0) {
            Doctor doctor = (Doctor) comboBoxModel.getSelectedItem();
            MongoDB.delete("Doctors", "id", doctor.getId(), FrmDatabase.database);
            MongoDB.delete("Doctors", "name", doctor.getName(), FrmDatabase.database);
            MongoDB.delete("Doctors", "direction", doctor.getDirection(), FrmDatabase.database);
            MongoDB.delete("Doctors", "phone", doctor.getPhone(), FrmDatabase.database);
            MongoDB.delete("Doctors", "email", doctor.getEmail(), FrmDatabase.database);

            JOptionPane.showMessageDialog(rootPane, "Deleted!.");
        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, try again.");
        }
    }

}
