import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        add_task3();
        add_task4();
        sc.close();
    }

    //    1. Создать трехмерный массив из целых чисел.
    //    С помощью циклов "пройти" по всему массиву и увеличить каждый
    //    элемент на заданное число. Пусть число, на которое будет
    //    увеличиваться каждый элемент, задается из консоли.
    private static void task1() {
        System.out.println("\n--------------- Task 1 ---------------");
        int [] [] [] mas = {{{1,2,3},{4,5,6},{7,8,9}}, {{10,11,12}, {13,14,15}, {16,17,18}}, {{19,20,21}, {22,23,24}, {25,26,27}}};
        System.out.println("Исходный массив: ");
        for (int [] [] x3 : mas) {
            for (int [] x2 : x3 ) {
                for (int x1 : x2) {
                    System.out.print(x1 + " ");
                }
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Введите число для увеличения: ");
        int num = sc.nextInt();
        System.out.println("Преобразованный массив: ");
        for (int [] [] x3 : mas) {
            for (int [] x2 : x3 ) {
                for (int x1 : x2) {
                    x1 += num;
                    System.out.print(x1 + " ");
                }
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    //    2. Шахматная доска
    //    Создать программу для раскраски шахматной доски с помощью цикла.
    //    Создать двумерный массив спрингов 8х8. С помощью циклов задать
    //    элементам циклам значения B(Black) или W(White). Результат работы
    //    программы:
    //        W B W B W B W B
    //        B W B W B W B W
    //        W B W B W B W B
    //        B W B W B W B W
    //        W B W B W B W B
    //        B W B W B W B W
    //        W B W B W B W B
    //        B W B W B W B W
    private static void task2() {
        System.out.println("\n--------------- Task 2 ---------------");
        String [][] mas = new String[8][8];
        System.out.println("Шахматная доска: ");
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }


    // Дополнительное задание

    //    3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
    //    всех элементов массива.
    private static void add_task3() {
        System.out.println("\n--------------- Additional task 3 ---------------");
        System.out.println("Введите количество строк массива: ");
        int x = sc.nextInt();
        System.out.println("Введите количество столбов массива: ");
        int y = sc.nextInt();
        int sum = 0;
        int[][] mas = new int[x][y];
        System.out.println("Полученный массив случайных чисел: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * 10);
                sum += mas[i][j];
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов: " + sum);
    }

    //     4. Создайте двумерный массив целых чисел. Отсортируйте элементы в
    //     строках двумерного массива по возрастанию.
    private static void add_task4() {
        System.out.println("\n--------------- Additional task 4 ---------------");
        int [] [] mas = {{3,2,15}, {6,1,4}, {8,7,9}};
        System.out.println("Исходный массив: ");
        for (int[] value : mas) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(value[j] + " ");
            }
            System.out.println();
        }
        boolean sorted1 = false;
        int temp1;
        while (!sorted1) {
            sorted1 = true;
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[0].length - 1; j++) {
                    if (mas[i][j] > mas[i][j + 1]) {
                        temp1 = mas[i][j];
                        mas[i][j] = mas[i][j + 1];
                        mas[i][j + 1] = temp1;
                        sorted1 = false;
                    }
                }
            }
        }
        System.out.println("Отсортированный массив (по строкам): ");
        for (int[] ints : mas) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        boolean sorted2 = false;
        int temp2;
        while (!sorted2) {
            sorted2 = true;
            for (int i = 0; i < mas.length - 1; i++) {
                for (int j = 0; j < mas[0].length; j++) {
                    if (mas[i][j] > mas[i + 1][j]) {
                        temp2 = mas[i][j];
                        mas[i][j] = mas[i + 1][j];
                        mas[i + 1][j] = temp2;
                        sorted2 = false;
                    }
                }
            }
        }
        System.out.println("(Дополнительно) Отсортированный массив (по столбцам и строкам): ");
        for (int[] ma : mas) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(ma[j] + " ");
            }
            System.out.println();
        }
    }
}