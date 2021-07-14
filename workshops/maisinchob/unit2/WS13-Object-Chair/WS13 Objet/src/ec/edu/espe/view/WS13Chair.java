/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.model.Chair;
import com.google.gson.Gson;
import ec.edu.espe.Filemanager.utils.FileManager;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class WS13Chair {

    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("welcome, how many chairs do you want to save?");
        int  counter = input.nextInt();
        
        for (int i = 0; 1< counter;i++){
            System.out.println("chair specifications");
            Gson gson = new Gson();
            System.out.println("Enter what composition does it take");
            String composition = input.next();
            System.out.println("Enter the type of design you wear");
            String design = input.next();
            System.out.println("Enter the color of the chair");
            String color = input.next();
            System.out.println("Enter the type of support you have");
            String support = input.next();
            System.out.println("enter the number of people capacity that the chair supports");
            int bearingCapacity = input.nextInt();
            ArrayList<String> Chair = new ArrayList();
            Chair chair = new Chair(composition, design, color, support, bearingCapacity);
            String ChairDataJson = gson.toJson(chair);
            
            FileManager.save("./files/Chair.json",ChairDataJson);
            Chair = FileManager.findAll("./files/Chair.json");
            System.out.println(Chair);
            System.out.println("Number of Chairs: " + Chair.size());
        }
        
    }
    
}
