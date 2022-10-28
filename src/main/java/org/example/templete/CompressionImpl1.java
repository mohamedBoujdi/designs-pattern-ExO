package org.example.templete;

import java.util.Arrays;

public class CompressionImpl1 extends Compression{
    @Override
    public int[]  compress1(int[] data) {
        System.out.println("Compressing file using algorithm 1");
        //compress array data in java
        data = Arrays.stream(data).map(x -> x + 1).toArray();
        return data;
    }

    @Override
    public int[] compress2(int[] data) {
        System.out.println("Compressing file using algorithm 2");
        //compress array data in java
        data = Arrays.stream(data).map(x -> x + 2).toArray();
        return data;
    }
}
