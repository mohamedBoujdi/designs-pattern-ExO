package org.example.strategy;

import java.util.Arrays;
import java.util.Collections;

public class FilterA implements FilterStrategy {
    public int[] filter(int[] data) {
        System.out.println("Filter A");
        //filter array data in java
       return Arrays.stream(data).filter(x -> x == 0).toArray();
    }
}
