package ec.edu.espe.liskov.model;

/**
 *
 * @author Josué Moreno
 */
public class Door {

    Coordinate coordinate;
    int horizontalVertical;
    boolean open;

    public Door(Coordinate coordinate, int horizontalVertical,boolean open) {
        this.coordinate = coordinate;
        this.horizontalVertical = horizontalVertical;
        this.open = open;
    }

    public void open() {
        System.out.println("opening the door");
        open = true;
    }

    public void close() {
        System.out.println("closing the door");
        open = false;
    }

}
