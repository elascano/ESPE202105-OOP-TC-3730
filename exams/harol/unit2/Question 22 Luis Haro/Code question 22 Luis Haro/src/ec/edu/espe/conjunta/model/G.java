package ec.edu.espe.conjunta.model;

/**
 *
 * @author Luis Haro
 */
public class G implements H {
    public G(J j) {
        System.out.println("G::G(" + j + ")");
    }

    public G() {
    }

    @Override
    public String toString() {
        return "G{" + '}';
    }
}
