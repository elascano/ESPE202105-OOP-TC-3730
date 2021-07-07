/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FileManager {

    private String name;
    private String lastName;
    private String id;
    private int age;

    public FileManager(String name, String lastName, String id, int age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "FileManager{" + "name= " + getName() + " , lastName= "
                + getLastName() + " , id= " + getId() + " , age= "
                + getAge() + " " + '}';
    }

    public static String add(FileManager read, id iD) throws IOException {
        //TODO code to add (append) new data (String) in a file
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String jsonRead = gson.toJson(read);
        File file = new File("C:/Users/DELL/Desktop/Programacion/"
                + "ESPE202105-OOP-TC-3730/assignments/chiliquingab/unit2/"
                + "HW08Libraries/FileManagerSystem/files/Read.json");

        FileWriter add = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter write = new BufferedWriter(add);
        write.write("\n" + "Client -> " + iD + " " + jsonRead);
        write.close();
        add.close();

        return jsonRead;
    }

    public static void indicate() throws IOException {

        try (FileReader file = new FileReader("C:/Users/DELL/Desktop/"
                + "Programacion/ESPE202105-OOP-TC-3730/assignments/"
                + "chiliquingab/unit2/HW08Libraries/FileManagerSystem/"
                + "files/Read.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }

    public static void find(String search) throws FileNotFoundException, IOException {
        //TODO search for data and return the line
        try (FileReader file = new FileReader("C:/Users/DELL/Desktop/"
                + "Programacion/ESPE202105-OOP-TC-3730/assignments/"
                + "chiliquingab/unit2/HW08Libraries/"
                + "FileManagerSystem/files/Read.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {
                StringTokenizer st = new StringTokenizer(linea, " ,.");
                while (st.hasMoreTokens()) {
                    if (st.nextToken().equalsIgnoreCase(search)) {
                        System.out.println("\n" + linea);
                    }
                }
                linea = br.readLine();
            }
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
