package lessons.lesson_04.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        Collection<Integer> collection = List.of(1, 2, 3, 4, 5);

        ArrayList<Integer> list = new ArrayList<>(collection);

        // [] <- 1
        // [_], [1] <- 2
        // [1], [_ _], [1 _], [1 2] <- 3
        // [1 2], [_ _ _ _], [1 2 _ _], [1 2 3 _] <- 4

        // [1 2 3 4 5] <- 7, index 2
        // [_ _ _ _ _ _ _ _ _ _]
        // [1 2 3 4 5 _ _ _ _ _]
        // [1 2 3 3 4 5 _ _ _ _]
        // [1 2 7 3 4 5 _ _ _ _]

        // list.get(1);
        // list.set(1, 2);
        // list.contains();

        // Пустой конструктор
        LinkedList<String> linkedList = new LinkedList<>();

        // Создаёт список, в который добавляет все элементы другой коллекции Collection
        LinkedList<String> linkedListFromCollection = new LinkedList<>(linkedList);
    }
}
