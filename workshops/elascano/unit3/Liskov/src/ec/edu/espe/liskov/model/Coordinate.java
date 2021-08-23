package ec.edu.espe.liskov.model;

/**
 *
 * @author Josué Moreno
 */
public class Coordinate {

    int x;
    int y;

    public void setPosition(int nextX, int nextY) {
        x = nextX;
        y = nextY;
    }

    public void move(int shiftX, int shiftY) {
        x = x + shiftX;
        y = y + shiftY;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }
}
