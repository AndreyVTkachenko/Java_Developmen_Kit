package lessons.lesson_04.set;

import java.util.HashSet;
import java.util.TreeSet;

public class MainHashSet {
    public static void main(String[] args) {
        // Начальная ёмкость по умолчанию - 16, коэффициент загрузки - 0,75
        HashSet defaultConstructor = new HashSet();

        // Конструктор с заданной начальной ёмкостью. Коэффициент загрузки - 0,75
        HashSet constructorWithCapacity = new HashSet(32);

        // Конструктор с заданными начальной ёмкостью и коэффициентом загрузки
        HashSet constructorWithCapacityFactor = new HashSet(32, 0.6f);

        // Конструктор, добавляющий элементы из другой коллекции
        HashSet fromCollection = new HashSet(defaultConstructor);
    }
}
