package org.example.templete;

public class CompressionImpl2 extends Compression{
    @Override
    public int[]  compress1(int[] data) {
        System.out.println("Compressing file using algorithm 1");
        return data;
    }

    @Override
    public int[]  compress2(int[] data) {
        System.out.println("Compressing file using algorithm 2");
        return data;
    }
}
