package lessons.lesson_05;

import java.util.concurrent.CountDownLatch;

public class MainTask {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Task task = new Task(0);
        CountDownLatch cdl = new CountDownLatch(3);
        task.setCdl(cdl);
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
        cdl.await();
        System.out.println(task.getValue());
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + "ms.");
    }
}
