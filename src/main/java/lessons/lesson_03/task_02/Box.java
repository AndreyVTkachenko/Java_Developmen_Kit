package lessons.lesson_03.task_02;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> container = new ArrayList<>();

    void add(T fruit) {
        container.add(fruit);
    }

    float getWeight() {
        return (container.isEmpty())
                ? 0
                : container.get(0).getWeight() * container.size();
    }

    boolean compare(Box<?> with) {
        return this.getWeight() == with.getWeight();
    }

    void transferTo(Box<? super T> dest) {
        dest.container.addAll(container);
        container.clear();
    }
}
