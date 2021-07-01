/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Song.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.Song.model.Song;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Json {

    public static void main(String[] args) throws IOException {
        System.out.println ("Save data in Json file (Song), \n"
            + "Fernanda Cadena");   
        
   String name;
   String nameAuthor; 
   int time;
   String nameSinger;
   
   
        Scanner read = new Scanner(System.in);
        ArrayList<String> sg = new ArrayList();
        

        System.out.print("Enter the name of the song. \n");
        name = read.next();
        System.out.print("Enter the name of the song's author. \n");
        nameAuthor = read.next();
        System.out.print("Enter the length of the song in minutes. \n");
        time = read.nextInt();
        System.out.print("Enter the name of the person who sings that song. \n");
        nameSinger = read.next();  
       
        Song song = new Song(name,nameAuthor,time,nameSinger);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson= gsonBuilder.create();
        String SongDataJson = gson.toJson(song);
        FileManager.save("./file/Song/Song.json", SongDataJson);
        sg = FileManager.findAll("./file/Song/Song.json");
        System.out.println(sg);
        
    }
}
