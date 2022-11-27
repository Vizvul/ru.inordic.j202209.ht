package ru.inordic.j202209.ht.lesson04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewMassivTest {

    @Test
    void test() {
        final NewMassiv testMassiv = new NewMassiv();
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6,6,7}, testMassiv.newMassiv(new int[]{1,2,3,4,5,6,7}, 6, 6));
    }
}
