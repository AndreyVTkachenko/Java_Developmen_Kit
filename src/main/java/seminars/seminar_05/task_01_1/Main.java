package seminars.seminar_05.task_01_1;

/*
В рамках выполнения задачи необходимо:
Создать два класса ObjectA, ObjectB
Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB
 */

public class Main {
    public static void main(String[] args) {

        Object objectA = new Object();
        Object objectB = new Object();

        Thread threadA = new Thread(() -> {
            synchronized (objectA) {
                System.out.println("Ожидаем объект В");
                synchronized (objectB) {
                    System.out.println("Ожидаем объект А");
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (objectB) {
                System.out.println("Ожидаем объект A");
                synchronized (objectA) {
                    System.out.println("Ожидаем объект B");
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}
