package ec.edu.espe.liskov.model;

/**
 *
 * @author Josué Moreno
 */
public class Room {

    Wall walls[] = new Wall[3];
    Door doors[] = new Door[3];
    int doorQuantity = 1;
    int wallQuantity = 1;

    // max elements = 4; where every element can be a wall or a door
    // 3 walls , 1 door
    // 2 walls , 2 doors
    // 1 wall  , 3 doors
    public Door[] createDoors(int doorQuantity, Coordinate coordinate[], int horizontalVertical[], boolean open[]) {
        //Control no more than 3
        if (doorQuantity <= 3 && doorQuantity > 0) {
            //TODO verify that the size of the coordinate array is no moreno doorQuantity
            //TODO verify that the size of the horizontalVertical array is no more tah doorQuantity

            this.doorQuantity = doorQuantity;
            System.out.println("building " + doorQuantity + "doors");
            if ((doorQuantity + wallQuantity) <= 4) {
                for (int i = 0; i < this.doorQuantity; i++) {
                    // TODO control walls and doors coordinates and orientation

                    doors[i] = new Door(coordinate[i], horizontalVertical[i], open[i]);
                    doors[i].open();
                }
                return doors;
            } else {
                System.out.println("exceeding number of doors and walls");
                //TODO Exception
                return null;

            }
        } else {
            System.out.println("doing nothing");
            return null;
        }

    }

    public Wall[] createWalls(int wallQuantity, Coordinate coordinate[], int horizontalVertical[]) {
        if (wallQuantity <= 3 && wallQuantity > 0) {
            this.wallQuantity = wallQuantity;
            System.out.println("building" + wallQuantity + " walls");
            if ((doorQuantity + wallQuantity) <= 4) {
                for (int i = 0; i < this.wallQuantity; i++) {
                    // TODO control walls and doors coordinates and orientation
                    walls[i] = new Wall(coordinate[i], horizontalVertical[i]);
                }
                System.out.println(wallQuantity + "walls were built");
                return walls;
            } else {
                System.out.println("exceeding number of doors and walls");
                //TODO Exception
                return null;
            }
        } else {
            System.out.println("Do nothing");
            return null;
        }
    }

    private boolean verifyDoorsAndWalls() {

        return false;
    }
}
