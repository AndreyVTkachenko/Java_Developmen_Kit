package seminars.seminar_05.task_03_1;

/*
В рамках выполнения задачи необходимо:
3 бегуна должны прийти к старту гонки
Программа должна гарантировать, что гонка начнется только когда все три участника будут на старте
Программа должна отсчитать “На старт”, “Внимание”, “Марш”
Программа должна завершиться когда все участники закончат гонку.
Подумайте об использовании примитива синхронизации
 */

import seminars.seminar_05.task_02_1.ThreadA;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(4);

        Runner runner1 = new Runner("Вася", cdl);
        Runner runner2 = new Runner("Ваня", cdl);
        Runner runner3 = new Runner("Петя", cdl);

        runner1.start();
        runner2.start();
        runner3.start();

        while (cdl.getCount() != 1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        goGoGo();
        cdl.countDown();
    }

    static void goGoGo() {
        try {
            System.out.println("На старт!");
            Thread.sleep(100);
            System.out.println("Внимание!");
            Thread.sleep(200);
            System.out.println("Марш!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
