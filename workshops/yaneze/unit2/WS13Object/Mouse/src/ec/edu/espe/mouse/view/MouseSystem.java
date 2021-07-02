/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mouse.view;

import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.mouse.model.Mouse;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class MouseSystem {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Workshop 13");
        System.out.println("Mouse System Display\nErick Yánez");
        System.out.println("How many Mouse will you save?");
        int counter = read.nextInt();

        for (int i = 0; i < counter; i++) {
            System.out.println("Mouse Specifications");
            Gson gson = new Gson();
            System.out.println("Enter the Model of the Mouse: ");
            String modelOfMouse = read.next();
            System.out.println("Enter the maximun DPI of the Mouse: ");
            int dpi = read.nextInt();
            System.out.println("Enter the Number of Keys of the Mouse: ");
            int numberOfKeys = read.nextInt();
            System.out.println("Enter if its a RGB mouse or not: ");
            String leds = read.next();
            System.out.println("Enter the fabricator of the Mouse: ");
            String fabricator = read.next();
            ArrayList<String> Mouse = new ArrayList();
            Mouse mouse = new Mouse(modelOfMouse, dpi, numberOfKeys, leds, fabricator);
            String MouseDataJson = gson.toJson(mouse);

            FileManager.save("./files/Mouse.json", MouseDataJson);
            Mouse = FileManager.findAll("./files/Mouse.json");
            System.out.println(Mouse);
            System.out.println("Number of Mouse: " + Mouse.size());
        }

    }
}
