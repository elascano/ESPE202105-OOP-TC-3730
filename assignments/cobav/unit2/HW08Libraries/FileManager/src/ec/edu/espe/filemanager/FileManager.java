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

    static int lineasTotales;
    static int totalCoincidencias;

    public static String read(String name, String lastName, String age) {
        return "FileManager{" + "name=" + name + ", lastName=" + lastName + "age=" + age + '}';
    }

    public static String add(String Read, String id) throws IOException {
        //TODO code to add (append) new data (String) in a file
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String jsonRead = gson.toJson(Read);
        File file = new File("C:/Users/Vctor/Desktop/Trabajo/2/1/HW08Libraries/FileManagerSystem/files/Read.json");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter add = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter write = new BufferedWriter(add);
        write.write("\nID -> " + id + " " + jsonRead);
        write.close();
        add.close();

        System.out.println("\nLa informacion ha sido guardada");
        return jsonRead;
    }

    public static void find(String search) {
        //TODO search for data and return the line

        try (FileReader file = new FileReader("C:/Users/Vctor/Desktop/Trabajo/2/1/HW08Libraries/FileManagerSystem/files/Read.json");
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
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura " + e.getMessage());
        }
    }
}
