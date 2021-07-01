/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Song.view;
import ec.edu.espe.Song.model.Song;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class SongSystem {
        public static void main(String[] args) {
            String nameAuthor; 
            int time;
            String nameOfSong;
            String nameOfSinger; 
            
        System.out.println("Song System");
        
        System.out.println("Write name of the Author of the song: ");
        nameAuthor = nameAuthor.next();
        
        System.out.println("Write time of duration of the song: ");
        DurationTime = DurationTime.next();
        
        System.out.println("Write neme of the song: ");
        name = name.next();
        
        System.out.println("Write name of singer");
        nameSinger = nameSinger.nextInt();
        

        
        
   
        song = new Song(nameAuthor, DurationTime, nameOfSong, nameSinger);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonBook = gson.toJson(song);
                try {
                    FileWriter file = new FileWriter("./files/Song.json");
                    file.write(jsonSong);
                    file.flush();
                    file.close();

                } catch (IOException e) {
                
                }

     }

   
}
