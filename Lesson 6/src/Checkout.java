import java.util.Scanner;
public class Checkout {
    Scanner sc = new Scanner(System.in);

    public void checkout() {
        System.out.println("Введите номер задания (1 - 2): ");
        int number = sc.nextInt();
        if (number == 1) {
            Task.task();
        } else {
            Additional_task.additional_task();
        }
    }
}
