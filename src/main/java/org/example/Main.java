package org.example;

import org.example.adapter.FilterAdapter;
import org.example.adapter.ImplNonStandard;
import org.example.strategy.FilterStrategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data=new int[]{};
        for (int i=0; i<100; i++) {
            data[i] = random0_1();
        }

        FilterStrategy filter = new FilterAdapter(new ImplNonStandard());
        Client client = new Client(filter);
        int[] filter1 = client.filter((data));
        System.out.println(Arrays.toString(filter1));
    }
    static int random0_1(){
        return Math.random() > 0.5 ? 1 : 0;
    }

}
