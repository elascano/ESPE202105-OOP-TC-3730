/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.djcontroler.view;

import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.djcontroler.model.Controller;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
public class ControllerDj {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("ControllerDJ");
        System.out.println("Alexander Pachacama");
        Scanner read = new Scanner(System.in);
        String jsonController = "";
        Gson gson = new Gson();
        FileWriter file = new FileWriter("./files/Controller.json");
        
        for( int i = 0; i < 2 ;i++) {
        System.out.println("Enter the audiochannel");
        int audiochannel = read.nextInt();
        System.out.println("Enter the model");
        String model = read.next();
        System.out.println("Enter the brand");
        String brand = read.next();
        System.out.println("Enter the color");
        String color = read.next();
        
         ArrayList<String> Controller= new ArrayList();
            Controller controller = new Controller(audiochannel, model,brand,color);
            String ControllerDataJson = gson.toJson(controller);
            FileManager.save("./files/Controller.json", ControllerDataJson);
            Controller  = FileManager.findAll("./files/Controllerdj.json"); 
            System.out.println(Controller); 
            System.out.println("The total is: "+Controller.size());
        }
     }   
}    
        
