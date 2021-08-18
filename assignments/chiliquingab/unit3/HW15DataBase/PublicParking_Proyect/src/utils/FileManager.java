/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FileManager implements Persistence {

    private String driver;
    private String description;
    private String cars;

    @Override
    public boolean create() {
        //TODO insert data in the file table
        File file = new File("./ DriverInformation.json");
        return true;
    }

    @Override
    public String read(String code, String driver, String description, String cars) {
        FileWriter add = null;
        try {
            //TODO read data from file "table"
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            String car = gson.toJson(cars);
            String drivers = gson.toJson(driver);
            String descriptions = gson.toJson(description);

            File file = new File("./ DriverInformation.json");
            add = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter write = new BufferedWriter(add);
            write.write("\n" + code + " " + drivers + car + descriptions);
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
        return "";
    }

    @Override
    public boolean update(String data) {
        //TODO update data in the file according to the searchString
        
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
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from table according to searchString
        return true;
    }

    @Override
    public String find(String searchString) {
        //TODO find a record in the table file according to searchString
        String h_entry = null;
        try (FileReader file = new FileReader("./ DriverInformation.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {

                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {

                    if (st.nextToken().equalsIgnoreCase(searchString)) {

                        //h_entry = linea.substring(35, 36);
                        //System.out.println(h_entry);
                    }
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h_entry;
    }
    
    public static String findCode(String code){
        String linea1 = "";
        try (FileReader file = new FileReader("./ DriverInformation.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {

                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {

                    if (st.nextToken().equalsIgnoreCase(code)) {
                        linea1 = linea;
                    }
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return linea1;
    }

    public static String insert(String code) {
        FileWriter add = null;
        try {

            File file = new File("./ UserDriver.json");
            add = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter write = new BufferedWriter(add);
            write.write("\n" + code);
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
        return "";
    }

    public static String CarEntry(String search, String checkInTime) {
        String entry = "";
        try (FileReader file = new FileReader("./ UserDriver.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {

                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {

                    if (st.nextToken().equalsIgnoreCase(search)) {
                        try (FileWriter fw = new FileWriter("./ UserDriverEntry.json", true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                PrintWriter out = new PrintWriter(bw)) {
                            out.write("\n" + search + " " + checkInTime);
                        } catch (IOException e) {
                        }
                    }
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public static String findUser(String search) {

        String entry = null;
        try (FileReader file = new FileReader("./ UserDriver.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {

                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {

                    if (st.nextToken().equalsIgnoreCase(search)) {
                        entry = linea.substring(0, 6);
                        
                    }
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entry;
    }
    
    public static String findUserExit(String search) {

        String time = null;
        try (FileReader file = new FileReader("./ UserDriverEntry.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {

                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {

                    if (st.nextToken().equalsIgnoreCase(search)) {
                        time = linea.substring(7, 12);//811-54  347-62
                    }
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return time;
    }

    public FileManager(String driver, String description, String cars) {
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
