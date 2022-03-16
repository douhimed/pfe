package org.sqli.pfe.dp.behavioral.strategy;

public class BubbleSort implements SortStrategy{
    @Override
    public String sort(int[] values) {
        return "bubble";
    }
}