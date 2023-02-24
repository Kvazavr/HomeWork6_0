package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] data = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();
    @Test
    void minMonthSales() {
        int expected = 9;
        int actual = service.minSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxMonthSales() {
        int expected = 8;
        int actual = service.maxSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumSales() {
        long expected = 180;
        long actual = service.sumSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        long expected = 15;
        long actual = service.averageSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lessThanAverage() {
        int expected = 5;
        int actual = service.lessThanAverageCount(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void greaterThanAverage() {
        int expected = 5;
        int actual = service.greaterThanAverageCount(data);
        Assertions.assertEquals(expected, actual);
    }
}
