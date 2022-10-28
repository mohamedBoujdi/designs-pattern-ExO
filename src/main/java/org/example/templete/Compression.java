package org.example.templete;

public abstract class Compression {
    public int[]  compress(int[] data) {
        System.out.println("Compressing file: " + data);
        compress1(data);
        compress2(data);
        System.out.println("Compression completed");
        return data;
    }

    public abstract int[]  compress1(int[] data);
    public abstract int[]  compress2(int[] data);

}
