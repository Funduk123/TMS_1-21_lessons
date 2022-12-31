package Task_1;

public class Task1 {
    public static void task1() {
        String doc = "5555-qwe-1678-ABC-2a3b";
        DocumentNumber.show(doc);

        // Вывести на экран в одну строку два первых блока по 4 цифры.
        DocumentNumber.showOnlyNumbers(doc);

        // Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        DocumentNumber.replacement(doc);

        // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        DocumentNumber.showNewFormat(doc);

        // Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y"
        // в верхнем регистре (реализовать с помощью класса StringBuilder).
        DocumentNumber.showUpCase(doc);

        // Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит
        // или нет (причем, abc и ABC считается одинаковой последовательностью).
        DocumentNumber.comparison(doc);

        // Проверить начинается ли номер документа с последовательности 555.
        DocumentNumber.doesItStart(doc);

        // Проверить заканчивается ли номер документа на последовательность 1a2b.
        DocumentNumber.doesItEnd(doc);
    }
}
