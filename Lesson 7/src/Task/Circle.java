package Task;

public class Circle implements Figures {
    double pi = 3.14;
    int r = (int) (Math.random() * 10) + 1;
    @Override
    public double square() {
        System.out.printf("Площадь круга = %.2f %n ", pi * Math.pow(r,2));
        return pi * Math.pow(r,2);
    }

    @Override
    public double perimeter() {
        System.out.printf("Периметр круга = %.2f %n ", (2 * pi * r));
        System.out.println();
        return 2 * pi * r;
    }
}
