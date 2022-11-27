package ru.inordic.j202209.ht.lesson09;

public interface LinkedListInterface<T> {

    int size();
    void add(T value);
    void add(T value, int position);
    void replace(T value, int position);
    void removeByIndex(int position);
    boolean removeFirstByValue(T value);
    boolean contains(T value);
    T get(int position);
    void print();
    int getPosition(T value);

}
