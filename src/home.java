/**
 * Created by Lena on 07.04.2015.
 */
public class home {
    public static void main(String args[]) {
        double P = 17.0;
        double S = 35.0;

        if (S < 0 || P < 0) {
            System.out.println("Dannie ne verny");
        } else {
            double a;
            double b;
            double D = P * P - 16 * S;
            if (D < 0) {
                System.out.println("Dannie ne verny");
            } else {
                a = (P + Math.sqrt(D)) / 4;
                b = S / a;
                System.out.println("Storona a= " + a);
                System.out.println("Storona b= " + b);
            }
        }
    }
}
