import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        double c = Math.hypot(legA,legB);
        double altC = Math.sqrt((legA*legA) + (legB*legB));

        // System.out.println(c);
        // System.out.println(c);
        return c;
    }
}

Pythagorean pyth = new Pythagorean();
double a = 2;
double a = 3;
double c = 
