package oops;

class Math{
    public final double secret = 10;
}
class ComplexMath extends Math{
    public final double secret = 20;
}
public class InfiniteMath extends ComplexMath{
    public final double secret = 30;

    public static void main(String[] numbers) {
        Math math1 = new InfiniteMath();
        InfiniteMath math2 = new InfiniteMath();
        ComplexMath math3 = new InfiniteMath();
        Math math4 = new Math();

        System.out.println(math1.secret);
        System.out.println(math2.secret);
        System.out.println(math3.secret);
        System.out.println(math4.secret);

    }
}