package org.example.adapter;

import java.util.Arrays;

public class ImplNonStandard {
    public int[] applyFilter(int[] data) {
        System.out.println("Applying old filter");
        //old filter logic
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                data[i] = 0;
            }
        }
        return data;
    }
}
