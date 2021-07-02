/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.game.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.game.model.Game;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class GameSystem {

    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("./files/GamesList.json");
        Scanner data = new Scanner(System.in);
        String title;
        String creativeCompany;
        String typeGame;
        String yearOfLaunch;
        String jsonGame = "";
        int counter;

        System.out.println("WS13Object");
        System.out.println("Programmer name:Andres Maximiliano Galarza Tufiño");
        System.out.println("Career:Telecomunications Engineering");
        System.out.println("Nrc:3730");
        System.out.println("Enter the number of games");
        counter = data.nextInt();
        Game games[] = new Game[counter];
        for (int i = 0; i < counter; i++) {
            System.out.println("Enter the game data: ");
            System.out.println("Enter the title: ");
            title = data.next();
            System.out.println("Enter the creativeCompany: ");
            creativeCompany = data.next();
            System.out.println("Enter the typeGame: ");
            typeGame = data.next();
            System.out.println("Enter the yearOfLaunch: ");
            yearOfLaunch = data.next();
            games[i] = new Game(title, creativeCompany, typeGame, yearOfLaunch);

        }

        System.out.println("Data of all Games entered: ");
        for (int i = 0; i < counter; i++) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            jsonGame = gson.toJson(games[i]);

            Game game1;
            game1 = gson.fromJson(jsonGame, Game.class);
            jsonGame = gson.toJson(games);

            System.out.println("jsonGame ->" + jsonGame);

            System.out.println(games[i].getTitle() + " " + games[i].getCreativeCompany() + " " + games[i].getTypeGame() + " " + games[i].getYearOfLaunch());
            System.out.println("\n");
        }

        try {
            file.append(jsonGame);
            file.flush();
            file.close();

        } catch (IOException e) {
        }

    }

}
