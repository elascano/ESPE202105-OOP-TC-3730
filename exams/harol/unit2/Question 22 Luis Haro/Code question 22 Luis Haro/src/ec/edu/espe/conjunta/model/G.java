package ec.edu.espe.conjunta.model;

/**
 *
 * @author Luis Haro
 */
public class G implements H {//0.5
    public G(J j) {
        System.out.println("G::G(" + j + ")");
    }

    public G() {
    }

    @Override//0 incomplete toString
    public String toString() {
        return "G{" + '}';
    }
}
