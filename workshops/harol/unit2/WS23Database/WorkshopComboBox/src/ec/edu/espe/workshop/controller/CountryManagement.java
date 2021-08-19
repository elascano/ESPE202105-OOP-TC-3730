/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.workshop.controller;

import ec.edu.espe.workshop.model.Country;
import ec.edu.espe.workshop.view.FrmDatabaseSetup;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class CountryManagement {

    MongoDBManagement mongoDB = new MongoDBManagement();

    public void cargarComboBox(JComboBox comboBox, DefaultComboBoxModel comboBoxModel) throws ParseException {
        ArrayList<Country> countries = new ArrayList<>();
        Gson gson = new Gson();
        String json = mongoDB.completeModel("Countries", FrmDatabaseSetup.database);
        java.lang.reflect.Type countryType = new TypeToken<ArrayList<Country>>() {
        }.getType();
        countries = gson.fromJson(json, countryType);
        for (Country country : countries) {
            comboBoxModel.addElement(country);
        }        
        comboBox.setModel(comboBoxModel);
    }
}
