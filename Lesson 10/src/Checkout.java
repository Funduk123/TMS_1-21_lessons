import Task_1.Task1;
import Task_2.Task2;
import Task_3.Task3;

import java.util.Scanner;
public class Checkout {
    Scanner sc = new Scanner(System.in);

    public void checkout() {
        System.out.println("Введите номер задания (1 - 3): ");
        int number = sc.nextInt();
        switch (number) {
            case 1 -> Task1.task1();
            case 2 -> Task2.task2();
            case 3 -> Task3.task3();
        }
        sc.close();
    }
}