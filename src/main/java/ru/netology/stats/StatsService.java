package ru.netology.stats;

public class StatsService {


    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = sumSales(sales);
        long average = sum / sales.length;

        return average;
    }

    public int lessThanAverageCount(long[] sales) {
        long average = averageSales(sales);
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                result = result + 1;
            }
        }
        return result;
    }

    public int greaterThanAverageCount(long[] sales) {
        long average = averageSales(sales);
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                result = result + 1;
            }
        }
        return result;
    }
}
