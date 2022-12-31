package Task_1;

import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Поток " + Thread.currentThread().getName() + " запущен.");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Thread.currentThread().isAlive()) {
            System.out.println("Поток " + Thread.currentThread().getName() + " активен...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " завершен.");
        System.out.println();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
