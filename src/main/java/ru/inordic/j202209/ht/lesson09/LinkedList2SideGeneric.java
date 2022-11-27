package ru.inordic.j202209.ht.lesson09;

public class LinkedList2SideGeneric<T> implements LinkedListInterface<T> {
    LinkedListGeneric<Integer> start;
    LinkedListGeneric<Integer> next;
    int endItemNumber = 0;

    public LinkedList2SideGeneric() {
        start = null;
    }

    @Override
    public int size(){
        return endItemNumber;
    }

    @Override
    public void add(T value){
        LinkedListGeneric<Integer> add = new LinkedListGeneric(value);
        endItemNumber++;
        add.setPositionLink(null);
        if(start == null) {
            start = add;
        } else { next.setPositionLink(add); }
        next = add;
    }

    @Override
    public void add(T value, int position){
        LinkedListGeneric<Integer> addValuePosition = start;
        LinkedListGeneric<Integer> backValuePosition = null;
        if (position == endItemNumber +1) {
            add(value);
            return;
        }
        if (position > endItemNumber +1) {
            System.out.println("Позиция больше чем размер листа");
            return;
        }
        int i = 0;
        while (addValuePosition != null) {
            i++;
            if(i == position) {
                LinkedListGeneric<Integer> newAdd = new LinkedListGeneric(value);
                backValuePosition.setPositionLink(newAdd);
                newAdd.setPositionLink(addValuePosition);
            }
            backValuePosition = addValuePosition;
            addValuePosition = addValuePosition.getPositionLink();
        }
    endItemNumber++;
    }
    @Override
    public void replace(T value, int position){
        LinkedListGeneric<Integer> replaceValuePosition = start;
        int j = 0;
        while (replaceValuePosition != null){
            j++;
            if(replaceValuePosition.getValue() == value) {
                removeByIndex(j);
                add(value, position);
            }
            replaceValuePosition = replaceValuePosition.getPositionLink();
        }

    }
    @Override
    public void removeByIndex(int position){
        LinkedListGeneric<Integer> removeByIndex = start;
        LinkedListGeneric<Integer> toChang = null;
        int i = 0;
        if (endItemNumber < position) {
            System.out.println("Нет такого элемента");
            return;
        }
        while (removeByIndex != null) {
            i++;
            if (i == position && position == endItemNumber) { toChang.setPositionLink(null); }
            if (i == position + 1) { toChang.setPositionLink(removeByIndex); }
            if (i != position) {toChang = removeByIndex;}
            removeByIndex = removeByIndex.getPositionLink();
        }
        endItemNumber--;
    }

    @Override
    public boolean removeFirstByValue(T value){
    return true;
    }
    @Override
    public boolean contains(T value){
        boolean result = false;
        LinkedListGeneric<Integer> contains = start;
        while (contains != null) {
            if (contains.getValue() == value) { result = true; }
            contains = contains.getPositionLink();
        }
    return result;
    }

    @Override
    public T get(int position){
        LinkedListGeneric<Integer> getValue = start;
        int i = 0;
        T result = null;
        while (getValue != null) {
            i++;
            if (i == position) { result = (T) getValue.getValue(); }
            getValue = getValue.getPositionLink();
        }
    return result;
    }

    @Override
    public void print(){
        LinkedListGeneric<Integer> print = start;
        int i = 0;
        while (print != null) {
            i++;
            System.out.println(i + " " + print.getValue() + " " + print.getPositionLink());
            print = print.getPositionLink();
        }
    }
    @Override
    public int getPosition(T value) {
        int result = 0;
        int i = 0;
        LinkedListGeneric<Integer> getPosition = start;
        while (getPosition != null) {
            i++;
            if (getPosition.getValue() == value) { result = i; }
            getPosition = getPosition.getPositionLink();
        }
    return result;
    }

}
