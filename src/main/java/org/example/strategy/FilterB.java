package org.example.strategy;

import java.util.Arrays;

public class FilterB implements FilterStrategy {
    public int[] filter(int[] data) {
        System.out.println("Filter B");
        //filter array data in java
        data = Arrays.stream(data).filter(x -> x == 1).toArray();
        return data;
    }
}

