package ru.inordic.j202209.ht.lesson08;

public class SimplyLinkedList implements LinkedList {
    private IntLinkList start;

    public SimplyLinkedList() {
        start = null;
    }

    public boolean isEmpty() {
        return start == null;
    }

    @Override
    public int size() {
        int result = 0;

        if (!isEmpty()){
            IntLinkList size = start;
            while (size != null) {
                result++;
                size = size.positionLink;
        }
        }
        return result;
    }

    @Override
    public void add (int value){

        IntLinkList addNewValue = new IntLinkList(value);
        addNewValue.positionLink = start;
        start = addNewValue;

    }

    @Override
    public void add (int value, int position) {
            add(value);
            IntLinkList addNewPozition = start;

            if (size() == position+1) { return; }
            int i = size();

            while (addNewPozition != null ) {
                i--;
                if (i + 1 > position) {
                    addNewPozition.value = get(i);
                } else if (i + 1 == position){
                    addNewPozition.value = value;
                }
                addNewPozition = addNewPozition.positionLink;
            }
        }

        @Override
        public void replace ( int value, int position) {
        int posToDelete = getPosition(value);
        if (position == posToDelete) {
            return;
        }
            removeByIndex(posToDelete);
            add(value,position);
        }

        public int getPosition (int value) {
        IntLinkList getPosition = start;
        int k = size();
        while (getPosition != null) {
            k--;
            if (getPosition.value == value){
                return k + 1;
            }
            getPosition = getPosition.positionLink;
        }
        return 0;
        }

        @Override
        public void removeByIndex ( int position) {
            IntLinkList removeByIndex = start;
            IntLinkList back = null;
            int j = size();

            while (removeByIndex.positionLink != null) {
                j--;
                if (j+1 == position) {
                    back.positionLink = removeByIndex.positionLink;
                }
                    back = removeByIndex;
                    removeByIndex = removeByIndex.positionLink;
                }
        }

        @Override
        public boolean removeFirstByValue ( int value){
            IntLinkList contains;
            if (get(1) == value){
                return true;
            }
            return false;
        }

        @Override
        public boolean contains ( int value){
            IntLinkList contains = start;
            while (contains != null){
                if (contains.value == value) {
                    return true;
                } else { contains = contains.positionLink;}
            }
            return false;
        }

        @Override
        public int get (int position){
            IntLinkList getNewPozition = start;
            int t = size();
            while (getNewPozition != null) {
                t--;
                if ( (t+1) == position) {
                    return getNewPozition.value;
                } else {
                    getNewPozition = getNewPozition.positionLink;
                }
            }
            return 0;
        }

        public void print () {
            IntLinkList test = start;
            int j = size();

            while (test != null) {
                j--;
                System.out.println(j + 1 + " element = " + test.positionLink + " - " + test.value);
                test = test.positionLink;
            }
        }
    }
