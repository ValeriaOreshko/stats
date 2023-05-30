package ru.netology.stats.services;

public class StatsService {
    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //номер месяца, в котором был максимум продаж, то есть осуществлены продажи на минимальную сумму
    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int allSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double average(int[] sales) {
        int sum = allSum(sales);
        double average = (double) sum / sales.length;
        return average;
    }

    public int monthLessAverage(int[] sales) {
        double average = average(sales);
        int monthLess = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthLess = monthLess + 1;
            }
        }
        return monthLess;
    }

    public int monthUnderAverage(int[] sales) {
        double average = average(sales);
        int monthUnder = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthUnder = monthUnder + 1;
            }
        }
        return monthUnder;
    }
}
