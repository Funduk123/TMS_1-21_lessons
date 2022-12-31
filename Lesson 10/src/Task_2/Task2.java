package Task_2;
import java.util.Scanner;
public class Task2 {
    public static void task2() {

        Scanner sc = new Scanner(System.in);

        //  Дана строка произвольной длины с произвольными словами.
        //  Найти самое короткое слово в строке и вывести его на экран.
        //  Найти самое длинное слово в строке и вывести его на экран.
        //  Если таких слов несколько, то вывести последнее из них.

        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        Work2.strSplit(str);

        sc.close();
    }
}
