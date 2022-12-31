package Task_2_and_3;

public class Synchronization implements Runnable {

    final Resource resource;
    public Synchronization(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        synchronized (resource) {
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
        }
    }
}
