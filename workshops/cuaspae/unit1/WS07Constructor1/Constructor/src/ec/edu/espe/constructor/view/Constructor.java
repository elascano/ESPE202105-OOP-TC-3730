package ec.edu.espe.constructor.view;
import ec.edu.espe.constructor.model.Motorcycle;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HELLO FROM USER OBJECT");
        
        Motorcycle motorcycle = new Motorcycle ("GSXR750","BLACK","SUZUKI");
        System.out.println(motorcycle);
    }
    
}
