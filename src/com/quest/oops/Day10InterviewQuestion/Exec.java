package com.quest.oops.Day10InterviewQuestion;

import java.util.Scanner;

public class Exec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details for Equity Stock: ");
        System.out.print("Enter Stock Name: ");
        String equityStockName = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String equityStockSymbol = sc.nextLine();
        System.out.print("Sector: ");
        String equitySector = sc.nextLine();
        System.out.print("Number of Days: ");
        int equityDays = sc.nextInt();
        System.out.print("Enter Prices: ");
        int[] equityPrices = new int[equityDays];
        System.out.print("Enter prices: ");
        for (int i = 0; i < equityDays; i++) {
            equityPrices[i] = sc.nextInt();
        }
        System.out.print("\n ");

        EquityStockAnalyzer es=new EquityStockAnalyzer(equityStockName,equityStockSymbol,equityPrices,equitySector);


        System.out.println("Enter details for Commodity Stock: ");
        System.out.print("Enter Commodity Type: ");
        String commodityType = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String commodityStockSymbol = sc.nextLine();
        System.out.print("Number of days: ");
        int commodityDays = sc.nextInt();
        int[] commodityPrices = new int[commodityDays];
        System.out.print("Enter prices: ");
        for (int i = 0; i < commodityDays; i++) {
            commodityPrices[i] = sc.nextInt();
        }
        System.out.print("\n ");

        String commodityStockName = null;
        CommodityStockAnalyzer cs = new CommodityStockAnalyzer(commodityType,commodityStockName,commodityStockSymbol,commodityPrices);
        es.findMaxPrice();
        es.findMaxPrice();
        es.calculateAveragePrice();
        es.findLongestIncreasingTrend();
        es.displayAnalysis();
        cs.findMaxPrice();
        cs.findMaxPrice();
        cs.calculateAveragePrice();
        cs.findLongestIncreasingTrend();
        cs.displayAnalysis();





    }
}
