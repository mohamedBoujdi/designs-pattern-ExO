package org.example;

import org.example.adapter.ImplNonStandard;
import org.example.strategy.FilterStrategy;

public class Client {
    private FilterStrategy filter;

    Client(FilterStrategy filter) {
        this.filter = filter;
    }

    public void setFilter(FilterStrategy filter) {
    }

    public int[] filter(int[] data) {
        return filter.filter(data);
    }
}
