package lessons.lesson_03.task_01;

/*
Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] array = {1, 2.0f, "hello"};
        System.out.println(Arrays.toString(array));

        swap(array, 0, 2);
        System.out.println(Arrays.toString(array));
    }

    private static void swap(Object[] array, int from, int to) {
        Object temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}
