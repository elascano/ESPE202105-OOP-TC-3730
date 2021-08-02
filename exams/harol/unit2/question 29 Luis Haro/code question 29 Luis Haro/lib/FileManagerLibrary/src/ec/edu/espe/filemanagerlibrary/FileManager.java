/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanagerlibrary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhonatan Lituma
 */
public class FileManager {

    public static FileManager fileManager;

    public FileManager() {
    }

    public static FileManager getInstance() {
        if (fileManager == null) {
            fileManager = new FileManager();
        }
        return fileManager;
    }

    /*
    public static void writeRecord(String record, String fileName) throws IOException {
        //BufferedWriter bw = openFileForWrite(fileName);
        try (FileWriter writer = new FileWriter(new File(fileName), true)) {
            //BufferedWriter bw = openFileForWrite(fileName);
            StringBuilder sb = new StringBuilder();
            sb.append(record);
            writer.write(sb.toString());
            writer.flush();
        }

    }*/
    public static boolean findRecord(String criteria, int column, String fileName) throws IOException {
        List<String> listTemporal = new ArrayList<>();
        BufferedReader reader = openFileForRead(fileName);
        String currentLine = reader.readLine();
        boolean find = false;
        while (currentLine != null) {
            String[] columns = currentLine.split(";");
            if (criteria.equals(columns[column])) {
                listTemporal.add(currentLine);
                find = true;
            }
            currentLine = reader.readLine();
        }
        return find;
    }

    public static String read(String fileName) throws IOException {
        String list = "";
        BufferedReader reader = openFileForRead(fileName);
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            list = list + currentLine;
        }
        return list;
    }

    
    public static FileReader readRecord(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        return fileReader;
    }
    
    public static void writeRecord(String fileName, String record) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(record);
        }
    }


    /*
    public static ArrayList<String> read(String fileName) throws IOException {
        ArrayList<String> listTemporal = new ArrayList<>();
        BufferedReader reader = openFileForRead(fileName);
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            listTemporal.add(currentLine);
        }
        return listTemporal;
    }
     */
    public static void write(List<String> data, String fileName) throws IOException {
        String tmp = data.toString();
        BufferedWriter bw = openFileForWrite(fileName);
        for (String item : data) {
            bw.append(item);
            bw.append("\n");
        }
        bw.close();
    }

    public static void rename(String oldName, String newName) throws IOException {
        File file = new File(oldName);
        File file2 = new File(newName);

        if (file2.exists()) {
            throw new java.io.IOException("File exists");
        }
        boolean success = file.renameTo(file2);
        if (!success) {
            System.out.println("File was not successfully renamed");
        }
    }

    public static boolean createFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
            return true;
        }
        return false;
    }

    public static boolean removeFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.delete()) {
            return true;
        }
        return false;
    }

    public static void fileInitializer(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public static BufferedReader openFileForRead(String fileName) throws IOException {
        fileInitializer(fileName);
        return new BufferedReader(new FileReader(fileName));
    }

    public static BufferedWriter openFileForWrite(String fileName) throws IOException {
        //fileInitializer(fileName);
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        return new BufferedWriter(new FileWriter(fileName, true));
    }

}
