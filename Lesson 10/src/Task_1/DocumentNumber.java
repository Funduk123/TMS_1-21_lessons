package Task_1;

public class DocumentNumber {

    public static void show(String str) {
        System.out.println("Номер документа: " + str);
        System.out.println();
    }

    // Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void showOnlyNumbers (String str) {
        System.out.println("Два блока по 4 цифры: " + str.substring(0,4) + str.substring(8,13));
        System.out.println();
    }

    // Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public static void replacement (String str) {
        String[] mas = str.split("-");
        System.out.println("Замена: " + str.replace(mas[1], "***").replace(mas[3], "***"));
        System.out.println();
    }

    // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static void showNewFormat (String str) {
        String[] mas = str.toLowerCase().split("-");
        System.out.println("Новый формат: " + mas[1] + "/" + mas[3] + "/" + mas[4].charAt(1) + "/" + mas[4].charAt(3));
        System.out.println();
    }

    // Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y"
    // в верхнем регистре (реализовать с помощью класса StringBuilder).
    public static void showUpCase(String str) {
        StringBuilder strB = new StringBuilder();
        System.out.println("Letters: " + strB.append(str.toUpperCase().replace("-","/")).delete(0,5).delete(4,9).delete(8,9).deleteCharAt(9). insert(9, "/"));
        System.out.println();
    }

    // Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит
    // или нет (причем, abc и ABC считается одинаковой последовательностью).
    public static void comparison (String str) {
        if (str.contains("abc") || str.contains("ABC")) {
            System.out.println("Содержит");
        }  else { System.out.println("Не содержит"); }
    }

    // Проверить начинается ли номер документа с последовательности 555.
    public static void doesItStart (String str) {
        if (str.startsWith("555")) {
            System.out.println("Начинается");
        } else { System.out.println("Не начинается"); }
    }

    // Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void doesItEnd (String str) {
        if (str.endsWith("1a2b")) {
            System.out.println("Заканчивается");
        } else { System.out.println("Не заканчивается"); }
    }
}
