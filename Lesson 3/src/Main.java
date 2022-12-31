import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Управляющие конструкции

        // Задание № 1. Написать программу для вывода названия поры года по номеру месяца.
        // При решении используйте оператор switch-case.
        System.out.println("Управляющие конструкции № 1");
        uk_1();
        System.out.println("-------------------------");

        // Задание № 2. Написать программу для вывода названия поры года по номеру месяца.
        // При решении используйте оператор if-else-if.
        System.out.println("Управляющие конструкции № 2");
        uk_2();
        System.out.println("-------------------------");

        // Задание № 3. Для введенного числа t (температура на улице) вывести:
        // Если t>–5, то вывести «Тепло».
        // Если –5>= t > –20, то вывести «Нормально».
        // Если –20>= t, то вывести «Холодно».
        System.out.println("Управляющие конструкции № 3");
        uk_3();
        System.out.println("-------------------------");

        // Задание № 4. По введенному номеру определить цвет радуги
        // (1 – красный, 4 – зеленый и т. д.).
        System.out.println("Управляющие конструкции № 4");
        uk_4();
        System.out.println("-------------------------");

//----------------------------------------------------------------------------------------------------

        // Циклы

        // Задание № 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        // При решении используйте операцию инкремента (++).
        System.out.println("Циклы № 1");
        c_1();
        System.out.println();
        System.out.println("-------------------------");

        // Задание № 2. Необходимо вывести на экран числа от 5 до 1.
        // При решении используйте операцию декремента (--).
        System.out.println("Циклы № 2");
        c_2();
        System.out.println();
        System.out.println("-------------------------");

        // Задание № 3. Напишите программу, где пользователь вводит любое целое положительное число.
        // А программа суммирует все числа от 1 до введенного пользователем числа.
        // Для ввода числа воспользуйтесь классом Scanner.
        System.out.println("Циклы № 3");
        c_3();
        System.out.println("-------------------------");

        // Задание № 4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        // В решении используйте цикл while.
        System.out.println("Циклы № 4");
        c_4();
        System.out.println();
        System.out.println("-------------------------");

        // Задание № 5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        System.out.println("Циклы № 5");
        c_5();
        System.out.println();
        System.out.println("-------------------------");

        // Задание № 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        System.out.println("Циклы № 6");
        c_6();
        System.out.println();
        System.out.println("-------------------------");

//----------------------------------------------------------------------------------------------------

        // Дополнительное задание

        // Задание 1. Выведите на экран первые 11 членов последовательности Фибоначчи.
        System.out.println("Дополнительное задание № 1");
        dop_1();
        System.out.println();
        System.out.println("-------------------------");

        // Задание 2. Напишите программу, которая выводит на консоль таблицу умножения.
        System.out.println("Дополнительное задание № 2");
        dop_2();
    }

//----------------------------------------------------------------------------------------------------

    // Управляющие конструкции
    public static void uk_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int a = sc.nextInt();
        switch (a) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Месяца с введённым номером не существует!");
        }
    }

    public static void uk_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int a = sc.nextInt();
        if (a == 1 || a == 2 || a == 12) {
            System.out.println("Зима");
        } else if (a == 3 || a == 4 || a == 5) {
            System.out.println("Весна");
        } else if (a == 6 || a == 7 || a == 8) {
            System.out.println("Лето");
        } else if (a == 9 || a == 10 || a == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Месяца с введённым номером не существует!");
        }

    }

    public static void uk_3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int t = sc.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }

    public static void uk_4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер цвета:");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Жёлтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.out.println("Введен неверный номер!");
        }
    }

//----------------------------------------------------------------------------------------------------

    // Циклы
    public static void c_1() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void c_2() {
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void c_3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int num = sc.nextInt();
        for (int i = num - 1; i > 0; i--) {
            num += i;
        }
        System.out.println(num);
    }

    public static void c_4() {
        int i = 7;
        while (i < 100) {
            System.out.print(i + " ");
            i += 7;
        }
    }

    public static void c_5() {
        for (int i = 0; i > -50; i -= 5) {
            System.out.print(i + " ");
        }
    }

    public static void c_6() {
        int a = 10;
        while (a < 21) {
            System.out.print(a * a + " ");
            a++;
        }
    }

//----------------------------------------------------------------------------------------------------

    // Дополнительное задание
    public static void dop_1() {
        for (int i = 0, a, b = 0, c = 1; i < 11; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }

    public static void dop_2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t\t");
            }
            System.out.println();
        }
    }
}