import Additional_task.Accountant;
import Additional_task.Director;
import Additional_task.Profession;
import Additional_task.Worker;
import Task.Circle;
import Task.Figures;
import Task.Rectangle;
import Task.Triangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //        Основное задание
        //        1. Написать иерархию классов «Фигуры».
        //        Фигура -> Треугольник -> Прямоугольник -> Круг.
        //        Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
        //        Создать массив из 5 фигур.
        //        Вывести на экран сумму периметра всех фигур в массиве.

        System.out.println("_________________________________");

        double sumS = 0;
        double sumP = 0;
        Figures triangle = new Triangle();

        Figures rectangle1 = new Rectangle();
        Figures rectangle2 = new Rectangle();

        Figures circle1 = new Circle();
        Figures circle2 = new Circle();

        Figures[] mas = {triangle, rectangle1, rectangle2, circle1, circle2};
        for (Figures fig : mas) {
            sumS += fig.square();
            sumP += fig.perimeter();
        }
        System.out.printf("Сумма всех площадей = %.2f %n ", sumS);
        System.out.printf("Сумма всех периметров = %.2f %n ", sumP);
        System.out.println("_________________________________");
        System.out.println();

        //        2. Создать классы "Директор", "Рабочий", "Бухгалтер".
        //        Реализовать интерфейс с методом, который печатает название
        //        должности и имплементировать этот метод в созданные классы.

        System.out.println("Введите название организации: ");
        String s = sc.next();

        Profession dir = new Director();
        Profession work = new Worker();
        Profession acc = new Accountant();

        dir.profShow(s);
        work.profShow(s);
        acc.profShow(s);

        sc.close();
    }
}