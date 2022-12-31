import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        // Теперь надо создать свои классы исключений на каждую ситуацию:
        // - Проверить содержит ли номер документа последовательность abc.
        // - Проверить начинается ли номер документа с последовательности 555.
        // - Проверить заканчивается ли номер документа на последовательность 1a2b.

        // Если номер документа не удовлетворяет условию - то "бросить" исключение.
        // В методе класса, в котором будут вызываться эти методы для
        // демонстрации работы, перехватить исключение конструкцией try-catch и
        // в блоке catch вывести сообщение для пользователя (сообщение на консоль).

            // Для тестирования: 5555-qwe-1678-Abc-1a2b
            // Для тестирования: 1234-qwe-1678-abc-1a2b
            // Для тестирования: 5555-qwe-1678-Abc-2a3b

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy");
            String doc = sc.nextLine();
            DocumentNumber.show(doc);
            System.out.println("___________________________________________________");
            try {
                ExcABC.exc(doc);
            } catch (ExcABC num1) {
                System.out.println(num1);
            }
            try {
                Exc555.exc(doc);
            } catch (Exc555 num2) {
                System.out.println(num2);
            }
            try {
                Exc1a2b.exc(doc);
            } catch (Exc1a2b num3) {
                System.out.println(num3);
            }

            System.out.println("___________________________________________________");
            DocumentNumber.showOnlyNumbers(doc);
            DocumentNumber.replacement(doc);
            DocumentNumber.showNewFormat(doc);
            DocumentNumber.showUpCase(doc);
            DocumentNumber.comparison(doc);
            DocumentNumber.doesItStart(doc);
            DocumentNumber.doesItEnd(doc);
        }
    }
}