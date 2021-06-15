/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors.view;

import constructors.model.Game;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Constructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Game game = new Game();

        game.setName("Wolfenstein II: The New Colossus");
        game.setType("Shooter");
        game.setCreator("MachineGames and Panic Button Games");

        System.out.println("Constructors, \n "
                + "Andres Galarza");

        System.out.println("Game ->" + game);

    }

}
