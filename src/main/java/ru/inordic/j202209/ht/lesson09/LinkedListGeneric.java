package ru.inordic.j202209.ht.lesson09;

public class LinkedListGeneric<T> {
    private T value;
    private LinkedListGeneric<Integer> positionLink;

    public LinkedListGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedListGeneric getPositionLink() {
        return positionLink;
    }

    public void setPositionLink(LinkedListGeneric positionLink) {
        this.positionLink = positionLink;
    }
}
