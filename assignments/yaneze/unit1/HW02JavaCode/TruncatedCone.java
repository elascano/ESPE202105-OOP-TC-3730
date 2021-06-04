/*
Erick Y nez
POO
Truncated Cone - 1st Program
 */
package truncated.cone;

import java.util.Scanner;

public class TruncatedCone {

    Scanner data = new Scanner(System.in);

    public TruncatedCone() {

        double MajorBaseRadius, MinorBaseRadius, generatrix, TotalArea, height;
        double LateralArea, Volume;

        System.out.println("Erick Y nez, HM03: Areas and Volume of a Truncated Cone");

        System.out.println("Enter the Major Base Radius of the Truncated Cone: ");
        MajorBaseRadius = data.nextDouble();
        System.out.println("Enter the Minor Base Radius of the Truncated Cone: ");
        MinorBaseRadius = data.nextDouble();
        System.out.println("Enter the generatrix of the Truncated Cone ");
        generatrix = data.nextDouble();
        System.out.println("Enter the height of the Truncated Cone: ");
        height = data.nextDouble();

        TotalArea = Math.PI * (generatrix * (MajorBaseRadius + MinorBaseRadius) + Math.pow(MajorBaseRadius, 2) + Math.pow(MinorBaseRadius, 2));
        LateralArea = Math.PI * (MajorBaseRadius + MinorBaseRadius) * generatrix;
        Volume = (Math.PI * height * (Math.pow(MajorBaseRadius, 2) + Math.pow(MinorBaseRadius, 2) + MajorBaseRadius * MinorBaseRadius)) / 3;

        System.out.println("The Total Area of the Truncated Cone is: " + TotalArea);
        System.out.println("The Lateral Area of the Truncated Cone is: " + LateralArea);
        System.out.println("The Volume of the Truncated Cone is: " + Volume);

    }

    public static void main(String[] args) {
        TruncatedCone solve = new TruncatedCone();
    }
}
