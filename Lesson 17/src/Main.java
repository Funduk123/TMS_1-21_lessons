import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Основное задание
//        1. Написать программу для проверки на валидность введенного ip адреса.
//        Пусть ip адрес задается с консоли.
//        Программа должна проверять валидность введенного ip адреса с
//        помощью регулярного выражения и выводить результат проверки на экран.

        System.out.println("Введите ip-адрес: ");
        Scanner sc = new Scanner(System.in);
////        String ip = sc.nextLine();
//
        String ip = "1192.161.100.0";

        String regEx = "((25[0-5]|(2[0-4]|[01]?\\d|[1-9]|)\\d)\\.?\\b){4}";
//        String regEx = "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(ip);
        if (Pattern.matches(regEx, ip)) {
            while (matcher.find()) {
                System.out.println(ip.substring(matcher.start(), matcher.end()) + " - valid");
            }
        } else {
            System.out.println(ip + " - invalid");
        }

//                Дополнительное задание
//        2. Программа на вход получает путь к папке (задается через консоль).
//        В заданной папке находятся текстовые файлы (формат txt).
//        Каждый файл содержит произвольный текст. В этом тексте может быть
//        номер документа(один или несколько), емейл и номер телефона.
//        номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy, где x - это
//        любая цифра, а y - это любая буква русского или латинского алфавита
//        номер телефона в формате: +(ХХ)ХХХХХХХ
//        Документ может содержать не всю информацию, т.е. например, может не
//        содержать номер телефона, или другое поле.

        System.out.println("Введите путь к папке: ");
//        String pathSc = sc.nextLine();
//        Path path = Paths.get(pathSc);
        String pathSc = "C:\\Users\\danik\\Desktop\\Courses\\Lesson 17_17.11.2022\\src\\docs";
        System.out.println();

        // Проверка на сущестование папки
        Path path = Paths.get(pathSc);
        while (!Files.exists(path)) {
            System.out.println("Неверный путь к папке! Попробуйте ещё раз.");
            sc.nextLine();
        }

        try {
            List<File> filesInFolder = Files.list(path).filter(Files::isRegularFile).map(Path::toFile).toList();

//            System.out.println("Введите количество файлов для извлечения данных: ");
//            int n = sc.nextInt();
//            if (n < filesInFolder.size())

            for (File file : filesInFolder) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
                    String str;
                    System.out.println("Содержимое файла: " + file.getName());
                    while ((str = bufferedReader.readLine()) != null) {
                        System.out.println(str);
                    }
                    System.out.println("-----------------------------------------------------------------------------------------");
                } catch (IOException e) {
                    System.out.println("Ошибка! Не удалость прочесть файл: " + file.getName());
                }
            }
            System.out.println(filesInFolder);
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


//        Необходимо извлечь информацию из N текстовых документов. Число
//        документов для обработки N задается с консоли.
//        Если в папке содержится меньше документов, чем заданное число -
//        следует обрабатывать все документы.

//        Извлеченную информацию необходимо сохранить в следующую
//        структуру данных:
//        Map<String, Document>, где
//        ключ типа String - это имя документа без расширения,
//        значение типа Document - объект кастомного класса, поля которого
//        содержат извлеченную из текстового документа информацию.

//        Учесть вывод сообщений на случаи если,
//        - на вход передан путь к папке, в которой нет файлов;
//        - все файлы имеют неподходящий формат (следует обрабатывать только тхт файлы);
//        - так же сообщения на случай других исключительных ситуаций.

//        В конце работы программы следует вывести сообщение о том, сколько
//        документов обработано и сколько было документов невалидного формата.
}