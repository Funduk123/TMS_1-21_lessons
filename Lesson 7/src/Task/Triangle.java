package Task;

public class Triangle implements Figures{
    int a = 3;
    int b = 4;
    int c = 5;

    @Override
    public double square() {
        int p = (a + b + c) / 2;
        System.out.println("Площадь треугольника = " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        System.out.println("Периметр треугольника = " + (a + b + c));
        System.out.println();
        return a + b + c;
    }
}
