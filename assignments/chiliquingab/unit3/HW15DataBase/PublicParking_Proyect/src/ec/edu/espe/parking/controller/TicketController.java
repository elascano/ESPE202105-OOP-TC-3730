/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.parking.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBManager;
import utils.FileManager;
import utils.Persistence;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class TicketController {
    
    private Persistence persistence;
    private Persistence persistence1;
    private Persistence persistence2;
    private String driver;
    private String description;
    private String cars;
    
    public static String CodeNumber() {
        String code = "";
        double d;
        for (int i = 1; i <= 5; i++) {
            d = Math.random() * 10;
            code = code + ((int) d);
            if (i % 3 == 0 && i != 5) {
                code = code + "-";
            }
        }
        return code;
    }

    public void add(String code, String driver, String description, String cars){
        
        persistence = new DBManager(driver, description, cars);
        persistence.create();
        persistence.read(code, driver, cars, description);
        
        persistence1 = new FileManager(driver, description, cars);
        persistence1.create();
        persistence1.read(code, driver, cars, description);
    }
    
    public void find(String searchString){
        
        persistence2 = new DBManager(getDriver(), getDescription(), getCars());
        persistence2.find(searchString);
        
        persistence2 = new FileManager(getDriver(), getDescription(), getCars());
        //persistence2.find(searchString);
        
    }
    
    public void insert(String code){
        FileManager.insert(code);
    }
    
    public static String findUser(String search){
        String code;
        code = FileManager.findUser(search);
        return code;
    }
    
    public static String CarEntry(String search, String checkInTime){
        String time;
        time = FileManager.CarEntry(search, checkInTime);
        return "";
    }
    
    public static String CarExit(String search){
        String time;
        time = FileManager.findUserExit(search);
        return time;
    }
    
    public static String findCode(String code){
        String code1;
        code1 = FileManager.findUser(code);
        return code1;
    }
    
    public static void Data(String data){
        FileWriter add = null;
        try {

            File file = new File("./ Complaints.txt");
            add = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter write = new BufferedWriter(add);
            write.write("\n" + data);
            write.close();
            add.close();

        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                add.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public static String findUserCode(String code){
        String entry = "";
        String linea = null;
       try (FileReader file = new FileReader(".DriverInformation.json");
                BufferedReader br = new BufferedReader(file)) {

            linea = br.readLine();

            while (linea != null) {
                StringTokenizer st = new StringTokenizer(linea, " ,.");
                while (st.hasMoreTokens()) {
                    if (st.nextToken().equalsIgnoreCase(code)) {
                        entry = linea.substring(1);
                    }
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TicketController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return linea;
    }
    

    public TicketController(String driver, String description, String cars) {
        this.driver = driver;
        this.description = description;
        this.cars = cars;
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the cars
     */
    public String getCars() {
        return cars;
    }

    /**
     * @param cars the cars to set
     */
    public void setCars(String cars) {
        this.cars = cars;
    }

}
