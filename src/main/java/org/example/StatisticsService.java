package org.example;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[1];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }


}
