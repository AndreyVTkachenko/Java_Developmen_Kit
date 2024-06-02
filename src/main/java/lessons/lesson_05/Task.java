package lessons.lesson_05;

import java.util.concurrent.CountDownLatch;

public class Task implements Runnable{

    private int value;
    private CountDownLatch cdl;

    public Task(int value) {
        this.value = value;
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    public synchronized void inc() { // synchronized - синхронизация потоков
        value++;
    }

    /* или так, что предпочтительнее по времени:
    public void inc() {
        synchronized (Task.class) {
            value++;
        }
    }
    */


    public int getValue() {
        return value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            inc();
        }
        cdl.countDown();
    }

    @Override
    public String toString() {
        return String.format("(%s)", value);
    }
}
