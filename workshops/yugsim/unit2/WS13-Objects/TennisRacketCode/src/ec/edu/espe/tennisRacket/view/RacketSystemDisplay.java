/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tennisRacket.view;

import ec.edu.espe.tennisRacket.model.*;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import java.util.ArrayList;
/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class RacketSystemDisplay {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String color;
        String material;
        String racketBrand;
        float length;
        float width;
        String jsonTennisRacket = "";
        
        System.out.println("WS13-Objects, \n"
                        + "Pamela Yugsi");
        
        System.out.println("Introduce the color of the racket: ");
        color = read.next();
        System.out.println("Introduce the material of the racket: ");
        material = read.next();
        System.out.println("Introduce the brand of the racket: ");
        racketBrand = read.next();
        System.out.println("Introduce length of the racket: ");
        length = read.nextFloat();
        System.out.println("Introduce width of the racket: ");
        width = read.nextFloat();
        
        ArrayList<String> tennisracketArray = new ArrayList();
        TennisRacket tennisRacket = new TennisRacket(color, material, racketBrand, length, width);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        jsonTennisRacket = gson.toJson(tennisRacket);
        FileManager.save("./files/Tennis racket list.json", jsonTennisRacket);
        tennisracketArray = FileManager.findAll("./files/Tennis racket list.json");
    }
}