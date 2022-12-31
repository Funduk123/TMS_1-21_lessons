//  Класс, который описывает вектор в двумерной системе координат.
public class TwoDimensionalCS {
    private final String name;
    private final int x;
    private final int y;

    private static final String TEXT = "Этот вектор для двумерной системы координат";

    static {
        System.out.println("___________________________________________________");
    }

    //  Конструктор с параметрами в виде списка координат.
    public TwoDimensionalCS(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        System.out.println("Вектор: " + name + " (" + x + "; " + y + ")");
    }

    // Метод, вычисляющий длину вектора.
    public void twoVectorLength() {
        System.out.printf("Длина вектора " + this.name + " = %.2f %n",  Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)));
        System.out.println();
    }

    // Метод, вычисляющий скалярное произведение.
    public static void scalarProduct(int x1, int y1, int x2, int y2) {
        System.out.println("Скалярное произведение двумерных векторов: a(" + x1 + "; " + y1 + ") и b(" + x2 + "; " + y2 + ") равно " + (x1 * x2 + y1 * y2));
    }

    // Метод сложения векторов
    public static void sumVector(int x1, int y1, int x2, int y2) {
        System.out.println("Сумма векторов: a(" + x1 + "; " + y1 + ") и b(" + x2 + "; " + y2 + ") равна c(" + (x1 + x2) + "; " + (y1 + y2) + ")");
    }

    // Метод вычитания векторов
    public static void subtractVector(int x1, int y1, int x2, int y2) {
        System.out.println("Разность векторов: a(" + x1 + "; " + y1 + ") и b(" + x2 + "; " + y2 + ") равна d(" + (x1 - x2) + "; " + (y1 - y2) + ")");
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
            System.out.println("Вектор m" + kol + " имеет координаты (" + x + "; " + y + ")");
            kol++;
        }
        System.out.println("___________________________________________________");
    }

    //  Предусмотреть метод для вывода информации о векторе.
    //  Каждый из классов должен иметь константу, содержащею описание вектора.
    //  Например, "Это вектор для двумерной системы координат".
    //  Эта константа так же должна выводиться в методе для вывода информации о векторе.
    public static void information(int x, int y) {
        System.out.println("Информация о векторе");
        System.out.println(TEXT);
        System.out.println("Координаты: (" + x + "; " + y + ")");
        System.out.printf("Длина вектора: %.2f %n",  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        System.out.println();
    }
}


