package com.quest.oops.Day10InterviewQuestion;

public class CommodityStockAnalyzer extends StockAnalyzer{
    String commodityType;
    public CommodityStockAnalyzer(String commodityType,String stockName, String stockSymbol, int[] prices) {
        super(stockName, stockSymbol, prices);
    }

    @Override
    public int findMaxPrice() {
        int max = prices[0];
        for (int i : prices) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

    @Override
    public int findMinPrice() {
        int min = prices[0];
        for (int i : prices) {
            if (i < min) {
                min = i;
            }
        }
        return min;

    }

    @Override
    public double calculateAveragePrice() {
        float total = 0;
        for (int price : prices) {
            total += price;
        }
        return total / prices.length;
    }


    @Override
    public int[] findLongestIncreasingTrend() {
        int maxLength = 0;
        int ength = 1;
        int start = 0;
        int end = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                ength++;
                if (ength > maxLength) {
                    maxLength = ength;
                    end = i;
                    start = i - ength + 1;
                }
            } else {
                ength = 1;
            }
        }

        return new int[]{start, end, maxLength};

    }

    @Override
    public void displayAnalysis() {
        System.out.println("Commodity Stock Analyzer");
        System.out.println("Stock Name"+stockName);
        System.out.println("Stock Symbol"+stockSymbol);
        System.out.println("Commodity Type: " + commodityType);
        System.out.println("Highest Price: " + findMaxPrice());
        System.out.println("Lowest Price: " + findMinPrice());
        System.out.println("Average Price: " + calculateAveragePrice());
        int[] trend = findLongestIncreasingTrend();
        System.out.println("Longest Increasing Trend: Start Day " + (trend[0] + 1) + ", End Day " + (trend[1] + 1) + ", Length: " + trend[2] + " days");
        System.out.println();

    }
}
