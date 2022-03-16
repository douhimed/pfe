package org.sqli.pfe.dp.behavioral.strategy;

public class SortContext {

    private SortStrategy strategy;

    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public String sort(int[] values) {
        return strategy.sort(values);
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
}
