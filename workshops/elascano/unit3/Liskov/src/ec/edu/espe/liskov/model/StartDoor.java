

package ec.edu.espe.liskov.model;

/**
 *
 * @author Josué Moreno
 */
public class StartDoor extends Door{

    public StartDoor(Coordinate coordinate, int horizontalVertical, boolean open) {
        super(coordinate, horizontalVertical, open);
    }
    
    public boolean startGame(){
        System.out.println("starting the game");
        return true;
    }
}
