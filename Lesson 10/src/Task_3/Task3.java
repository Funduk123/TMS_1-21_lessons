package Task_3;

import java.util.Scanner;
public class Task3 {
    public static void task3() {

        Scanner sc = new Scanner(System.in);

        //  Дана произвольная строка.
        //  Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
        //  Например, "Hello" -> "HHeelllloo"

        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        Work3.string3(str);
        Work3.string4(str);

        sc.close();
    }
}
