package lessons.lesson_04.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Hello", 1, "World", 2);

        // for each
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }

        // Stream
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
