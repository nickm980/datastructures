package basic.interfaces;

public interface IList<T> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    void add(T e);

    T remove(Object o);

    void clear();

    T get(int index);

    void set(int index, T element);

    void add(int index, T element);

    T remove(int index);

    int indexOf(Object o);
}