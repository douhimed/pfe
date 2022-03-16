package org.sqli.pfe.dp.behavioral.strategy;

public class QuickSort implements SortStrategy{
    @Override
    public String sort(int[] values) {
        return "quick";
    }
}