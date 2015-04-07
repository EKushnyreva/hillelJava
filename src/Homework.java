/**
 * Created by Lena on 07.04.2015.
 */
public class Homework {
    public static void main(String args[]) {
        double p = 17.0;
        double s = 35.0;


        if (s < 0 || p < 0) {
            System.out.println("Data is not correct");
        } else {
            double a;
            double b;
            double d = p * p - 16 * s;
            if (d < 0) {
                System.out.println("Data is not correct");
            } else {
                a = (p + Math.sqrt(d)) / 4;
                b = s / a;
                System.out.println("Side a= " + a);
                System.out.println("Side b= " + b);
            }
        }
    }
}
