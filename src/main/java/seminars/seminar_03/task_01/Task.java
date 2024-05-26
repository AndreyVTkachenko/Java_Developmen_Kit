package seminars.seminar_03.task_01;

/*
Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K), конструктор,
принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных. Создать метод, выводящий на
консоль имена классов для трех переменных класса. Наложить ограничения на параметры типа: T должен реализовать интерфейс
Comparable (классы оболочки, String), V должен реализовать интерфейс DataInput и расширять класс InputStream, K должен
расширять класс Number.
*/

import java.io.DataInput;
import java.io.InputStream;

public class Task<T extends Comparable<String>, V extends InputStream & DataInput, K extends Number> {
    T t;
    V v;
    K k;

    public Task(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
    public void printTask() {
        System.out.printf("T= %s, V= %s, K= %s", t.getClass().getName(), v.getClass().getName(), k.getClass().getName());
    }
}
