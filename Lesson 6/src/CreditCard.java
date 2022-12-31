import java.util.Scanner;
public class CreditCard {
    Scanner sc = new Scanner(System.in);
    String number;
    double balance;

    public CreditCard(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void replenishment() {
        System.out.println("________________________________");
        System.out.println("Введите сумму пополнения: ");
        double b = sc.nextDouble();
        this.balance = this.balance + b;
        System.out.println("Баланс карты: " + this.balance);
        System.out.println("________________________________");
    }

    public void writeOff() {
        System.out.println("________________________________");
        System.out.println("Введите сумму списания: ");
        double b = sc.nextDouble();
        this.balance = this.balance - b;
        System.out.println("Баланс карты: " + this.balance);
        System.out.println("________________________________");
    }

    public void information() {
        System.out.println("________________________________");
        System.out.println("Информация о карте");
        System.out.println("Номер карты: " + this.number);
        System.out.println("Баланс карты: " + this.balance);
        System.out.println("________________________________");
    }
}

