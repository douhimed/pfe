package org.sqli.pfe.dp.behavioral.strategy;

public class InsertionSort implements SortStrategy{
    @Override
    public String sort(int[] values) {
        return "insertion";
    }
}
