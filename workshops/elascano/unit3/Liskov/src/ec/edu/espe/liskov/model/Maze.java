package ec.edu.espe.liskov.model;

import java.util.ArrayList;

/**
 *
 * @author Josué Moreno
 */
public class Maze {

    Path path;
    int height;
    int width;
    StartDoor startDoor;
    EndDoor endDoor;

    ArrayList<Room> rooms = new ArrayList<>();

     /*
     _ _ _
    S   | |     
     -    
    | | | |     
         -
    | |   E     
     - - -
     */
    
    public Maze(Path path, int height, int width, StartDoor startDoor, EndDoor endDoor, ArrayList<Room> rooms) {
        this.path = path;
        this.height = height;
        this.width = width;
        this.startDoor = startDoor;
        this.endDoor = endDoor;
    }

    public Maze build() {
        return new Maze(path, height, width, startDoor, endDoor, rooms);
    }
    
    public void draw(){
        System.out.println("Drawing the  maze");
        //TODO arrayList of doors
        //OR
        //TODO
    }
}
