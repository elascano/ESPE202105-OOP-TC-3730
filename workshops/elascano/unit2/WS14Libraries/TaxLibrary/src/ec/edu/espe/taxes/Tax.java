/** Copyright ESPE-DECC
 */
package ec.edu.espe.taxes;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Tax {

    private static float ivaPercentage = 12.0F;

    public static float computeIva(float amount) {
        float ivaValue = amount * ivaPercentage / 100;
        return ivaValue;
    }

    public static float computeTotalPrice(float amount) {
        float totalPrice;
        totalPrice = amount + computeIva(amount);
        return totalPrice;
    }

}
