public class ThreadSafeTester {

    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(() -> {
            ThreadSafe threadSafe = ThreadSafe.getInstance();
            System.out.println("Thread 1: " + threadSafe);
        });


        Thread thread2 = new Thread(() -> {
            ThreadSafe threadSafe = ThreadSafe.getInstance();
            System.out.println("Thread 2: " + threadSafe);
        });

        thread1.start();
        thread2.start();

    }
}
