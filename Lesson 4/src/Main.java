import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        add_task4();
        add_task5();
        add_task6();
        add_task7();
        sc.close();
    }

    //    0. Создайте массив целых чисел. Напишете программу, которая выводит
    //    сообщение о том, входит ли заданное число в массив или нет.
    //    Пусть число для поиска задается с консоли (класс Scanner).
    private static void task0() {
        System.out.println("\n--------------- Task 0 ---------------");
        int[] a = {5,1,9,3,4,6,10,8,2,9};
        String found = "Не входит";
        System.out.println("Массив: " + Arrays.toString(a));
        System.out.println("Введите число для проверки: ");
        int b = sc.nextInt();
        for (int x : a) {
            if (x == b) {
                found = "Входит";
                break;
            }
        }
        System.out.println(found);
    }

    //    1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
    //    Пусть число задается с консоли (класс Scanner).
    //    Если такого числа нет - выведите сообщения об этом.
    //    В результате должен быть новый массив без указанного числа.
    private static void task1() {
        System.out.println("\n--------------- Task 1 ---------------");
        Integer[] a = {0,10,2,3,5,7,8,3,2,5,8,7,10};
        List<Integer> a_list = new ArrayList<>(Arrays.asList(a)); //   Создание списка "a_list" на основе массива "a"
        System.out.println("Исходный массив: " + Arrays.toString(a));
        System.out.println("Введите число, которое хотите удалить из массива: ");
        int b = sc.nextInt();
        boolean c = false;
        for (Integer x : a) {
            if (x == b) {
                a_list.remove(x); // Удаление введенного числа из массива
                c = true;
            }
        }
        if (!c) {
            System.out.println("Введённого числа нет в массиве");
        }
        a = a_list.toArray(new Integer[0]);   // Преобразование списка в массив
        System.out.println("Новый массив: " + Arrays.toString(a));
    }

    //    2. Создайте и заполните массив случайным числами и выведете
    //    максимальное, минимальное и среднее значение.
    //    Для генерации случайного числа используйте метод Math.random().
    //    Пусть будет возможность создавать массив произвольного размера.
    //    Пусть размер массива вводится с консоли.
    private static void task2() {
        System.out.println("\n--------------- Task 2 ---------------");
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        double sr = 0;
        int [] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 5); // Рандомные числа из промежутка [0; 5)
            sr += mas[i];
        }
        sr = sr / size;
        System.out.println("Полученный массив: " + Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println("Максимальное значение: " + mas[size - 1]);
        System.out.println("Минимальное значение: " + mas[0]);
        System.out.println("Среднее арифметическое: " + sr);
    }

    //    3. Создайте 2 массива из 5 чисел.
    //    Выведите массивы на консоль в двух отдельных строках.
    //    Посчитайте среднее арифметическое элементов каждого массива и
    //    сообщите, для какого из массивов это значение оказалось больше (либо
    //    сообщите, что их средние арифметические равны).
    private static void task3() {
        System.out.println("\n--------------- Task 3 ---------------");
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        double sr1 = 0, sr2 = 0;
        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 10);
            mas2[i] = (int) (Math.random() * 10);
            sr1 += mas1[i];
            sr2 += mas2[i];
        }
        System.out.println("Массив № 1: " + Arrays.toString(mas1));
        System.out.println("Массив № 2: " + Arrays.toString(mas2));
        sr1 = sr1 / 5;
        sr2 = sr2 / 5;
        System.out.println("Среднее арифметическое массива № 1: " + sr1);
        System.out.println("Среднее арифметическое массива № 2: " + sr2);
        if (sr1 > sr2) {
            System.out.println("Больше у массива № 1");
        } else if (sr1 < sr2) {
            System.out.println("Больше у массива № 2");
        } else { System.out.println("Равны"); }
    }


    // Дополнительное задание

    //    4. Создайте массив из n случайных целых чисел и выведите его на экран.
    //    Размер массива пусть задается с консоли и размер массива может быть
    //    больше 5 и меньше или равно 10.
    //    Если n не удовлетворяет условию - выведите сообщение об этом.
    //    Если пользователь ввёл не подходящее число, то программа должна
    //    просить пользователя повторить ввод.
    //    Создайте второй массив только из чётных элементов первого массива,
    //    если они там есть, и вывести его на экран.
    private static void add_task4() {
        System.out.println("\n--------------- Additional task 4 ---------------");
        System.out.println("Введите размер массива: ");
        int n = 0;
        while (n <= 5 || n > 10) {
                n = sc.nextInt();
                if (n <= 5 || n > 10) {
                    System.out.println("Введенное число быть больше 5 и меньше или равно 10. Повторите ввод:");
                }
            }
        int[] mas1 = new int[n];
        int kol = 0;
        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * 10);
            if (mas1[i] % 2 == 0) {
                if (mas1[i] != 0) {
                    kol++;
                }
            }
        }
        if (kol == 0) {
            System.out.println("Четных чисел нет");
        } else {
            int[] mas2 = new int[kol];
            for (int k = 0, j = 0; k < n; k++) {
                if (mas1[k] % 2 == 0) {
                    if (mas1[k] != 0) {
                        mas2[j] = mas1[k];
                        j++;
                    }
                }
            }
            System.out.println("Исходный массив: " + Arrays.toString(mas1));
            System.out.println("Массив четных чисел: " + Arrays.toString(mas2)); // Дополнительно убрал нули
        }

    }

    //     5. Создайте массив и заполните массив.
    //     Выведите массив на экран в строку.
    //     Замените каждый элемент с нечётным индексом на ноль.
    //     Снова выведете массив на экран на отдельной строке.
    private static void add_task5() {
        System.out.println("\n--------------- Additional task 5 ---------------");
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(mas));
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                mas[i] = 0;
            }
        }
        System.out.println("Преобразованный массив: " + Arrays.toString(mas));
    }

    //     6. Создайте массив строк. Заполните его произвольными именами людей.
    //     Отсортируйте массив.
    //     Результат выведите на консоль.
    private static void add_task6() {
        System.out.println("\n--------------- Additional task 6 ---------------");
        String[] mas = {"Ваня", "Александр", "Данила", "Глеб", "Борис"};
        System.out.println("Исходный массив: " + Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println("Отсортированный массив: " + Arrays.toString(mas));
    }

    // 7.Реализуйте алгоритм сортировки пузырьком.
    private static void add_task7() {
        System.out.println("\n--------------- Additional task 7 ---------------");
        int[] mas = {3,8,1,4,8,7,4,5,9,2};
        System.out.println("Исходный массив: " + Arrays.toString(mas));
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i+1]) {
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Массив после пузырька: " + Arrays.toString(mas));
    }
}