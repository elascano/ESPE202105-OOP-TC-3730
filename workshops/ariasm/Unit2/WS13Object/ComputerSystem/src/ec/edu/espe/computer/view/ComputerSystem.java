/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.computer.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.computer.model.Computer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class ComputerSystem {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String processor;
        int ram;
        int storage;
        String refrigeration;
        String graphiccard;
        String jsonComputer = "";

        System.out.println("Marco_Arias_WS13Object");
        System.out.println("\tComputer");
        System.out.println("Enter processor: ");
        processor = read.next();
        System.out.println("Enter the amount of RAM: ");
        ram = read.nextInt();
        System.out.println("Enter the amount of storage: ");
        storage = read.nextInt();
        System.out.println("Enter the type of refrigeration: ");
        refrigeration = read.next();
        System.out.println("Enter graphics card: ");
        graphiccard = read.next();

        ArrayList<String> computerArray = new ArrayList();
        Computer computer = new Computer(processor, ram, storage, refrigeration, graphiccard);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        jsonComputer = gson.toJson(computer);
        FileManager.save("./files/ComputerList.json", jsonComputer);
        computerArray = FileManager.findAll("./files/ComputerList.json");
    }
}
