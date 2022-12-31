package Task_2_and_3;

import java.util.concurrent.locks.ReentrantLock;

public class ReLock implements Runnable {

    Resource resource;
    ReentrantLock locker;
    public ReLock(Resource resource, ReentrantLock lock) {
        this.resource = resource;
        this.locker = lock;
    }

    @Override
    public void run() {

        locker.lock();

        try {
            resource.x = 1;
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), resource.x);
                resource.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        } finally {
            locker.unlock();
        }
    }
}
