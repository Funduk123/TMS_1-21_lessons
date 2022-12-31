import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Написать программу для вывода на консоль названия дня недели по введенной дате.
        System.out.println("Введите дату в формате: dd.MM.yyyy");
        String date1 = sc.nextLine();
        SimpleDateFormat dateForm = new SimpleDateFormat("dd.MM.yyyy"); // Задаю формат для даты
        try {
            Date parsingDate = dateForm.parse(date1); // Преобразую введенную строку в дату
            System.out.println(new SimpleDateFormat("EEEE").format(parsingDate));
            System.out.println("------------------------------------");
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("------------------------------------");
        }

        // 2. Написать программу для вывода на экран дату следующего вторника.

        Calendar calendar = new GregorianCalendar();
        Date data2 = calendar.getTime();
        System.out.println("Сегодня: " + dateForm.format(data2));
        if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
            while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
                calendar.add(Calendar.DAY_OF_WEEK, 1);
            }
        } else calendar.add(Calendar.DAY_OF_WEEK, 7);
        data2 = calendar.getTime();
        System.out.println("Следующий вторник будет: " + dateForm.format(data2));
        System.out.println("------------------------------------");

        // 3. Создать обобщенный функциональный интерфейс.
        // Написать класс с одним методом.
        // В этом методе реализуйте логику:
        // - если в консоль введена цифра 1, то: использования интерфейса со
        // строковым типом и передать в метод интерфейса логику реверса
        // строки(вывода строки в обратном порядке).

        System.out.println("Введите 1 для реверса строки:");
        while (true) {
            String i = sc.nextLine();
            try {
                int num = Integer.parseInt(i);
                if (num == 1) {
                    System.out.println("Введите строку:");
                    String str = sc.nextLine();
                    Custom<Reverse, String> custom = Reverse::new;
                    System.out.println(custom.doSome(str));
                    break;
                } else System.out.println("Вы ввели не 1, попробуйте снова!");
            } catch (NumberFormatException e) {
                System.out.println("Это даже не число. Пробуйте снова!");
            }
        }
            sc.close();
    }
}