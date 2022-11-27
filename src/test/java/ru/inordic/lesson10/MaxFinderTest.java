package ru.inordic.lesson10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import ru.inordic.j202209.ht.lesson10.MaxFinder;

class MaxFinderTest {

    @Test
    void test() {
        final MaxFinder finder = new MaxFinder();
        Assertions.assertEquals(5, finder.maxFind(new int[]{5, 2, 0}));
        Assertions.assertEquals(15, finder.maxFind(new int[]{5, 15, 0}));
        Assertions.assertEquals(100, finder.maxFind(new int[]{-10, 15, -10, 20, 100, 0}));
        Assertions.assertThrows(Exception.class, new Executable() {
            public void execute() throws Throwable {
                finder.maxFind(new int[]{});
            }
        });
    }

}