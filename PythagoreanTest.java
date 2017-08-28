public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean pyth = new Pythagorean();
        int a = 3;
        int b = 4;
        double c = pyth.calculateHypotenuse(a,b);

        System.out.println(c);

    }
}