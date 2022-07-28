package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calculateTheSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = (int) service.fullAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void calculateTheAverageAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = (int) service.middleAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calculateThePeakOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 6;
        int actualMonth = (int) service.peakSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void calculateTheMinOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = (int) service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void numberOfMonthsWithMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expectedNumber = 5;
        int actualNumber = (int) service.lowerMiddle(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void numberOfMonthsWithMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expectedNumber = 5;
        int actualNumber = (int) service.upperMiddle(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}