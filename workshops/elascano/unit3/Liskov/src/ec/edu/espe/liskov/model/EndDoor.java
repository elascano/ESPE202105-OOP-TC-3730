package ec.edu.espe.liskov.model;

/**
 *
 * @author Josué Moreno
 */
public class EndDoor extends Door {

    public EndDoor(Coordinate coordinate, int horizontalVertical, boolean open) {
        super(coordinate, horizontalVertical, open);
    }

    public boolean win() {
        System.out.println("you won the game");
        return true;
    }

}
