package Task;

public class Rectangle implements Figures {
    int a = (int) (Math.random() * 10) + 1;
    int b = (int) (Math.random() * 10) + 1;

    @Override
    public double square() {
        System.out.println("Площадь прямоугольника = " + (a * b));
        return a * b;
    }

    @Override
    public double perimeter() {
        System.out.println("Периметр прямоугольника = " + (a + b) * 2);
        System.out.println();
        return (a + b) * 2;
    }
}
