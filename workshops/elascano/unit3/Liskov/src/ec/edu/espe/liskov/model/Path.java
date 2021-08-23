package ec.edu.espe.liskov.model;

import java.util.ArrayList;

/**
 *
 * @author Josué Moreno
 */
public class Path {

    Maze maze; //?
    //from maze I get the rooms and the size the of the maze 
    ArrayList<Door> doors; //?

    /*
     _ _ _
    S   | |     
     -    
    | | | |     
         -
    | |   E     
     - - -
     */
    ArrayList<Path> generate() {

        System.out.println("Generating the path");
        connectStartWithEnd();
        //TODO loop for doors( if open)
        //TODO use the coordinate of ever door to build the path
        //TODO use the position (horizontal vertical) to build the path
        return new ArrayList<Path>();

    }

    boolean validate() {
        System.out.println("Val");
        return true;
    }

    boolean connectStartWithEnd() {
        System.out.println("connecting entrance with exit");
        return true;
    }

    boolean verifySinglePath() {
        System.out.println("verify tha is only one path in the maze");
        return true;
    }
}
