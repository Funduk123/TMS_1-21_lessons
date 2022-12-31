public class Main {
    public static void main(String[] args) {

        //   Создайте класс Phone, который содержит переменные number, model и weight.
        //   Создайте три экземпляра этого класса.

        Phone phone1 = new Phone("+375 33 1241512", "Xiaomi", "215");
        Phone phone2 = new Phone("+375 29 6512512", "Samsung", "145");
        Phone phone3 = new Phone("+375 44 7654754", "iPhone", "195");

        //   Выведите на консоль значения их переменных.

        System.out.println();
        System.out.println("_______________________");
        phone1.information();
        System.out.println();

        phone2.information();
        System.out.println();

        phone3.information();

        //   Добавить в класс Phone методы:
        //   receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
        //   getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.

        System.out.println();
        System.out.println("_______________________");
        phone1.receiveCall("Данила");
        phone1.setNumber("+375 44 1512325");
        System.out.println(phone1.getNumber());
        System.out.println();

        phone2.receiveCall("Роман");
        phone2.setNumber("+375 29 5154735");
        System.out.println(phone2.getNumber());
        System.out.println();

        phone3.receiveCall("Георгий");
        phone3.setNumber("+375 33 4632411");
        System.out.println(phone3.getNumber());
        System.out.println();
        System.out.println("_______________________");

        //   Добавьте перегруженный метод receiveCall, который принимает два
        //   параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.

        Phone phone4 = new Phone();
        phone4.receiveCall("Незнакомец", "+375 25 1111111");
        System.out.println();
        System.out.println("__________________________________");

        //   Создать метод sendMessage с аргументами переменной длины. Данный
        //   метод принимает на вход номера телефонов, которым будет отправлено
        //   сообщение. Метод выводит на консоль номера этих телефонов.

        Phone phone = new Phone();
        phone.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());
    }
}