package ru.inordic.j202209.ht.lesson13;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        AutoSpaceNormalased test = new AutoSpaceNormalased();
        File in = new File("/Users/Stas/Desktop/java/tmp/TestIn.txt");
        File out = new File("/Users/Stas/Desktop/java/tmp1/TestOut.txt");

        test.normalisedSpace(in,out);
    }
}
