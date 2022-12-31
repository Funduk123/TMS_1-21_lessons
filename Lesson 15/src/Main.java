import java.util.*;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------ОСНОВНОЕ ЗАДАНИЕ---------------------");

        // Создание и заполнение коллекции
        Collection<Integer> collection1 = new ArrayList<>();
        int i = 0;
        while (i < 10) {
            int r = (int) (Math.random() * 20 + 1);
            collection1.add(r);
            i++;
        }
        System.out.println("Исходная коллекция чисел: " + collection1);

        // Удаление дубликатов
        Collection<Integer> withoutDuplicates = collection1.stream().distinct().toList();
        System.out.println("Без дубликатов: " + withoutDuplicates);

        // Только четные элементы в диапазоне от 7 до 17
        Collection<Integer> onlyEvenNumbers = collection1.stream().filter(elem -> elem >= 7 && elem <= 17 && elem % 2 == 0).toList();
        System.out.println("Четные от 7 до 17: " + onlyEvenNumbers);

        // Умножение каждого элемента на 2
        Collection<Integer> doubling = collection1.stream().map(elem -> elem * 2).toList();
        System.out.println("Удвоенные элементы: " + doubling);

        // Сортировка и вывод первых 4-х элементов
        Collection<Integer> sortedAndFirst = collection1.stream().sorted().limit(4).toList();
        System.out.println("Первые 4 элемента после сортировки: " + sortedAndFirst);

        // Вывод количества элементов в стриме
        Stream<Integer> stream1 = collection1.stream();
        System.out.println("Количество элементов в стриме: " + stream1.count());

        // Вывод среднего арифметического всех чисел в стриме
        Stream<Integer> stream2 = collection1.stream();
        double sum = 0;
        for (int elem : collection1) {
            sum += elem;
        }
        System.out.println("Среднее арифметическое: " + sum / stream2.count());

        System.out.println();
        System.out.println("--------------------ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ--------------------");

        // Создание коллекции класса ArrayList со значениями имен всех студентов в группе
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Даник");
        collection2.add("Юлия");
        collection2.add("Мария");
        collection2.add("Роман");
        collection2.add("Валерия");
        collection2.add("даник");
        collection2.add("Яна");
        collection2.add("Александра");
        collection2.add("Святослав");
        collection2.add("Ольга");
        collection2.add("Ирина");
        collection2.add("Александр");
        collection2.add("Ольга");
        collection2.add("Глеб");
        collection2.add("Денис");
        collection2.add("Дмитрий");

        System.out.println("Исходная коллекция имён: " + collection2);

        // Возврат количества людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
        Stream<String> sameNames = collection2.stream();
        System.out.println("Количество одинаковых имён: " + sameNames.filter(name -> name.equals("Даник") || name.equals("даник")).count());

        // Вывод всех имён, начинающихся на "а" (вне зависимости от верхнего/нижнего регистра букв)
        Stream<String> namesStartingWithA = collection2.stream();
        System.out.println("Имена, начинающиеся на 'А' или 'а': " + namesStartingWithA.filter(name -> name.startsWith("А") || name.startsWith("а")).toList());
    }
}