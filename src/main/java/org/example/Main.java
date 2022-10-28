package org.example;

import org.example.adapter.FilterAdapter;
import org.example.adapter.ImplNonStandard;
import org.example.strategy.FilterA;
import org.example.strategy.FilterB;
import org.example.strategy.FilterStrategy;
import org.example.templete.Compression;
import org.example.templete.CompressionImpl1;

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

        FilterStrategy filter2 = new FilterA();
        client.setFilter(filter2);

        int[] filter3 = client.filter((data));
        System.out.println(Arrays.toString(filter3));

        FilterStrategy filter4 = new FilterB();
        client.setFilter(filter4);

        //compression
        int[] filter5 = client.filter((data));
        System.out.println(Arrays.toString(filter5));
        Compression compression1 = new CompressionImpl1();
        compression1.compress(filter5);

        System.out.println(Arrays.toString(filter5));

        Compression compression2 = new CompressionImpl1();
        compression2.compress(filter5);

        System.out.println(Arrays.toString(filter5));


    }
    static int random0_1(){
        return Math.random() > 0.5 ? 1 : 0;
    }

}
