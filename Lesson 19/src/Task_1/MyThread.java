package Task_1;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Поток " + getName() + " запущен.");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (isAlive()) {
            int i = (int) (Math.random() * 5) + 1;
            System.out.println("Поток " + getName() + " будет активен ещё " + i + " секунд(-у/-ы)...");
            try {
                TimeUnit.SECONDS.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Поток " + getName() + " завершен.");
        System.out.println();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
