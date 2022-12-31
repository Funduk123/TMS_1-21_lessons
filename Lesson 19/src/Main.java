import Tasks_2_and_3.ReLock;
import Tasks_2_and_3.Resource;
import Tasks_2_and_3.Synchronization;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Основное задание
//        1. Создать три потока Т1, Т2 и Т3
//        Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
//        (используя метод join)

        // С помощью класса Thread
        System.out.println("-------------Потоки класса Thread-------------");
        Task_1.MyThread threadT1 = new Task_1.MyThread();
        threadT1.setName("T1");
        Task_1.MyThread threadT2 = new Task_1.MyThread();
        threadT2.setName("T2");
        Task_1.MyThread threadT3 = new Task_1.MyThread();
        threadT3.setName("T3");

        threadT3.start();
        threadT3.join();

        threadT2.start();
        threadT2.join();

        threadT1.start();
        threadT1.join();


        // С помощью интерфейса Runnable
        System.out.println("----------Потоки интерфейса Runnable----------");
        Task_1.MyRunnable myRunnable = new Task_1.MyRunnable();

        Thread runnableT1 = new Thread(myRunnable);
        runnableT1.setName("T1");
        Thread runnableT2 = new Thread(myRunnable);
        runnableT2.setName("T2");
        Thread runnableT3 = new Thread(myRunnable);
        runnableT3.setName("T3");

        runnableT3.start();
        runnableT3.join();

        runnableT2.start();
        runnableT2.join();

        runnableT1.start();
        runnableT1.join();

        // Task_1.JoinRunnable
        System.out.println("----------Потоки Task_1.JoinRunnable----------");
        Task_1.JoinRunnable t1 = new Task_1.JoinRunnable("T1");
        Task_1.JoinRunnable t2 = new Task_1.JoinRunnable("T2");
        Task_1.JoinRunnable t3 = new Task_1.JoinRunnable("T3");

        t3.start();
        t3.join();

        t2.start();
        t2.join();

        t1.start();
        t1.join();


//        Дополнительное задание

        Resource resource = new Resource();

//        2. Напишите многопоточный ограниченный буфер с использованием
//        ReentrantLock.

        System.out.println("--------ReentrantLock--------");
        ReentrantLock locker = new ReentrantLock();
        for (int i = 1; i < 4; i++) {
            Thread thread1 = new Thread(new ReLock(resource, locker));
            thread1.setName("Thread " + i);
            thread1.start();
            thread1.join();
        }

//        3. Напишите многопоточный ограниченный буфер с использованием
//        synchronized.

        System.out.println("--------Synchronized--------");
        for (int i = 1; i < 4; i++) {
            Thread thread2 = new Thread(new Synchronization(resource));
            thread2.setName("Thread " + i);
            thread2.start();
        }

    }
}