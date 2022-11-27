package ru.inordic.lesson10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleTest {

    @Test
    void myFirstTest() {
        final List<Integer> list = new ArrayList<Integer>();
        Assertions.assertEquals(0, list.size());
        list.add(10);
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(10, list.get(0));
        list.add(0, -5);
        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals(-5, list.get(0));
        Assertions.assertEquals(10, list.get(1));

        List<Integer> expectedList = new LinkedList<Integer>();
        expectedList.add(-5);
        expectedList.add(10);

        Assertions.assertEquals(expectedList, list);
//
//        list.add(15);
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                new Executable() {
                    public void execute() throws Throwable {
                        list.get(2);
                    }
                });
    }

}
