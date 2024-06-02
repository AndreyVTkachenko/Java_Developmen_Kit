package lessons.lesson_05;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread();
            thread.start();
            thread.join();
        }

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
            thread.join();
        }
    }
}
