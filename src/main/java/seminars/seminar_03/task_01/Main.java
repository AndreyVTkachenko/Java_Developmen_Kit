package seminars.seminar_03.task_01;

import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        Task<String, DataInputStream, Integer> task = new Task<>("Текст", new DataInputStream(System.in), 999);
        task.printTask();
    }
}
