package lessons.lesson_04.set;

import java.util.Comparator;
import java.util.TreeSet;

public class MainTreeSet {

    // Конструктор по умолчанию
    TreeSet defaultConstructor = new TreeSet<>();

    // Конструктор, добавляющий элементы из другой коллекции
    TreeSet fromCollection = new TreeSet<>(defaultConstructor);

    // Конструктор создаёт пустое дерево, где все добавляемые элементы впоследствии будут отсортированы компаратором
    TreeSet withComparator = new TreeSet(new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    });
}
