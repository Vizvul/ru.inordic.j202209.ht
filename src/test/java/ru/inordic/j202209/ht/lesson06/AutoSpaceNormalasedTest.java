package ru.inordic.j202209.ht.lesson06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoSpaceNormalasedTest {

    @Test
    void test1() {

            SpaceNormalased str = new AutoSpaceNormalased();
            String strtest1 = str.normalasedSpace(" , as    as,da   fgfg , ");
            Assertions.assertEquals("as as, da fgfg", strtest1);
            String strtest2 = str.normalasedSpace(" a,   bb  ,c ");
            Assertions.assertEquals( "a, bb, c", strtest2);
            String strtest3 = str.normalasedSpace("a  ,  ,bb  c ,,,,");
            Assertions.assertEquals("a, bb c", strtest3);

        }
    }
