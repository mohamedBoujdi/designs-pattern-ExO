package org.example.adapter;

import org.example.strategy.FilterStrategy;

public class FilterAdapter implements FilterStrategy {
    private ImplNonStandard filter;

    public FilterAdapter(ImplNonStandard filter) {
        this.filter = filter;
    }

    @Override
    public int[] filter(int[] data) {
        return filter.applyFilter(data);
    }
}
