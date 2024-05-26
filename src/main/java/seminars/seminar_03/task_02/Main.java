package seminars.seminar_03.task_02;

/*
Описать собственную коллекцию – список на основе массива. Коллекция должна иметь возможность хранить любые типы данных,
иметь методы добавления и удаления элементов.
 */

public class Main {
    public static void main(String[] args) {
        CollectionEx<String> collectionEx = new CollectionEx<>();
        collectionEx.add("A");
        collectionEx.add("B");
        collectionEx.add("C");
        collectionEx.add("D");
        collectionEx.add("E");
        System.out.println(collectionEx);
        System.out.println("__________________________________");

        collectionEx.delete(3);
        System.out.println(collectionEx);
    }
}
