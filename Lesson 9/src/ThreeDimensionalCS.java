//  Класс, который описывает вектор в трехмерной системе координат.
public class ThreeDimensionalCS {
    private final String name;
    private final int x;
    private final int y;
    private final int z;

    private static final String TEXT = "Этот вектор для трехмерной системы координат";

    //  Конструктор с параметрами в виде списка координат.
    public ThreeDimensionalCS(String name, int x, int y, int z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Вектор: " + name + " (" + x + "; " + y + "; " + z + ")");
    }

    // Метод, вычисляющий длину вектора.
    public void threeVectorLength() {
        System.out.printf("Длина вектора " + this.name + " = %.2f %n ", Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.sqrt(Math.pow(this.z, 2))));
        System.out.println();
    }

    // Метод, вычисляющий скалярное произведение.
    public static void scalarProduct(int x1, int y1, int z1, int x2, int y2, int z2) {
        System.out.println("Скалярное произведение трехмерных векторов: a(" + x1 + "; " + y1 + "; " + z1 + ") и b(" + x2 + "; " + y2 + "; " + z2 + ") равно " + (x1 * x2 + y1 * y2 + z1 * z2));
    }

    // Метод сложения векторов
    public static void sumVector(int x1, int y1, int x2, int y2, int z1, int z2) {
        System.out.println("Сумма векторов: a(" + x1 + "; " + y1 + "; " + z1 + ") и b(" + x2 + "; " + y2 + "; " + z2 + ") равна c(" + (x1 + x2) + "; " + (y1 + y2) + "; " + (z1 + z2) + ")");
    }

    // Метод вычитания векторов
    public static void subtractVector(int x1, int y1, int x2, int y2, int z1, int z2) {
        System.out.println("Разность векторов: a(" + x1 + "; " + y1 + "; " + z1 + ") и b(" + x2 + "; " + y2 + "; " + z2 + ") равна c(" + (x1 - x2) + "; " + (y1 - y2) + "; " + (z1 - z2) + ")");
        System.out.println();
    }

    //  Статический метод, который принимает целое число N,
    //  и возвращает массив случайных векторов размером N.
    public static void createMas(int N) {
        int[] mas = new int[N];
        int kol = 1;
        for (int x : mas) {
            x = (int) (Math.random() * 10) + 1;
            int y = (int) (Math.random() * 10) + 1;
            int z = (int) (Math.random() * 10) + 1;
            System.out.println("Вектор m" + kol + " имеет координаты (" + x + "; " + y + "; " + z + ")");
            kol++;
        }
        System.out.println("___________________________________________________");
    }

    //  Предусмотреть метод для вывода информации о векторе.
    //  Каждый из классов должен иметь константу, содержащею описание вектора.
    //  Например, "Это вектор для двумерной системы координат".
    //  Эта константа так же должна выводиться в методе для вывода информации о векторе.
    public static void information(int x, int y, int z) {
        System.out.println("Информация о векторе");
        System.out.println(TEXT);
        System.out.println("Координаты: (" + x + "; " + y + "; " + z + ")");
        System.out.printf("Длина вектора: %.2f %n ", Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.sqrt(Math.pow(z, 2))));

    }
}
