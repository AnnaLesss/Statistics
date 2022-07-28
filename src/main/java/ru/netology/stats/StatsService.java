package ru.netology.stats;

public class StatsService {

    public long fullAmount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public long middleAmount(long[] sales) {
        long sum = 0;
        long middle = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            middle = sum / 12;
        }
        return middle;
    }

    public long peakSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowerMiddle(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < middleAmount(sales)) {
                count++;
            }
        }
        return count;

    }

    public int upperMiddle(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > middleAmount(sales)) {
                count++;
            }
        }
        return count;

    }
}