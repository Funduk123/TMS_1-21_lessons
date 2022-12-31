package Task_1;

import java.util.concurrent.TimeUnit;

public class JoinRunnable extends Thread {
    public JoinRunnable(String name) {
        super(name);
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Поток " + threadName + " запущен.");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Thread.currentThread().isAlive()) {
            System.out.println("Поток " + threadName + " активен...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Поток " + threadName + " завершен.");
        System.out.println();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
