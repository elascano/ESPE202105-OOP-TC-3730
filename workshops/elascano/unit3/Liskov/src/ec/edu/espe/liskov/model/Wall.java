

package ec.edu.espe.liskov.model;

/**
 *
 * @author Josué Moreno
 */
public class Wall {
    Coordinate coordinate;
    int horizontalVertical; //horizontal = 0, vertical = 1

    public Wall(Coordinate coordinate, int horizontalVertical) {
        this.coordinate = coordinate;
        this.horizontalVertical = horizontalVertical;
    }
}
