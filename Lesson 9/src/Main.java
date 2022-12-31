public class Main {
    public static void main(String[] args) {

        //  Создайте класс, который описывает вектор в двумерной системе координат.

        //  Создайте класс, который описывает вектор в трехмерной системе координат.

        //  У каждого класса должны быть:
        //  - конструктор с параметрами в виде списка координат (например, x, y, z);
        //  - метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
        //  - метод, вычисляющий скалярное произведение;
        //  - метод сложения векторов;
        //  - метод разности векторов;
        //  - статический метод, который принимает целое число N,
        //  и возвращает массив случайных векторов размером N.

        //  Предусмотреть метод для вывода информации о векторе.

        //  Каждый из классов должен иметь константу, содержащею описание вектора.
        //  Например, "Это вектор для двумерной системы координат".
        //  Эта константа так же должна выводиться в методе для вывода информации о векторе.

        TwoDimensionalCS v2d = new TwoDimensionalCS("OA",2,3);
        v2d.twoVectorLength();

        TwoDimensionalCS.scalarProduct(2,3,4,5);
        TwoDimensionalCS.sumVector(2,3,4,5);
        TwoDimensionalCS.subtractVector(2,3,4,5);
        TwoDimensionalCS.createMas(3);

        ThreeDimensionalCS v3d = new ThreeDimensionalCS("OB",1,2,3);
        v3d.threeVectorLength();

        ThreeDimensionalCS.scalarProduct(1,2,3,4,5,6);
        ThreeDimensionalCS.sumVector(1,2,3,4,5,6);
        ThreeDimensionalCS.subtractVector(1,2,3, 4,5,6);
        ThreeDimensionalCS.createMas(5);

        TwoDimensionalCS.information(10,20);
        ThreeDimensionalCS.information(15,25,35);
    }
}