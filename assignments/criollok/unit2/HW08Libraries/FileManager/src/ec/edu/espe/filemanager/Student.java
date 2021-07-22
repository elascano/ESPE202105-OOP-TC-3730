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
import java.io.Writer;
import java.util.StringTokenizer;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class Student {

    public static String information(String name, String lastname, int age, int nrc) {
        return "information{" + " name=" + name + " lastname=" + lastname + " age=" + age + "nrc=" + nrc +'}';
    }

    public static String put(String reference, int id) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
       String Jsonreference = gson.toJson(reference);
       
        File file = new File("C:/Users/Kevin/Desktop/Nivek/ESPE202105-OOP-TC-3730/assignments/criollok/unit2/WS08Libraries/StudentSystem/file/Student.json");
        if (!file.exists()) {
        file.createNewFile();
        }
        FileWriter add = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter write = new BufferedWriter(add);
        write.write("\n" + Jsonreference + " "+id);
        write.close();
        add.close();
        return "";
    }

    public static void search(String inquire)  {
        try (FileReader file = new FileReader("C:/Users/Kevin/Desktop/Nivek/ESPE202105-OOP-TC-3730/assignments/criollok/unit2/WS08Libraries/StudentSystem/file/Student.json");
                BufferedReader present = new BufferedReader(file)) {
            String line = present.readLine();
            while (line != null) {
                StringTokenizer manifest = new StringTokenizer(line, " ,.");
                while (manifest.hasMoreTokens()) {
                    if (manifest.nextToken().equalsIgnoreCase(inquire)) {
                        System.out.println(line);
                    }
                }
                line = present.readLine();
            }
        }catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado " + e.getMessage());
    }catch (IOException e) {
            System.out.println("Error de lectura " + e.getMessage());

}
    }
}
