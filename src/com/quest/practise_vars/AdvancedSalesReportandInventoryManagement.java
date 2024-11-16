package com.quest.practise_vars;

import java.util.Scanner;

public class AdvancedSalesReportandInventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        String[] products = new String[n];
        System.out.println("Enter the products: ");
        for (int i = 0; i < n; i++) {
            products[i] = sc.next();
        }

        int[][] inventory = new int[n][2];
        System.out.println("Enter the inventory: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                inventory[i][j] = sc.nextInt();
            }
        }
        int[] quantitiesSold = new int[n];
        System.out.println("Enter the quantities sold: ");
        for (int i = 0; i < n; i++) {
            quantitiesSold[i] = sc.nextInt();
        }


        generateSalesReport(products, inventory, quantitiesSold);
        inventoryStorageCheck(products, inventory, quantitiesSold);
        restockingInventory(products, inventory, quantitiesSold);
        salesSummary(products, inventory, quantitiesSold);
        outOfStock(products, inventory, quantitiesSold);
    }

    //Sales Report
    public static void generateSalesReport(String[] products, int[][] inventory, int[] quantitiesSold) {
        int[] revenue = new int[products.length];
        int totalRevenue = 0;
        for (int i = 0; i < inventory.length; i++) {
            int price = inventory[i][1];
            revenue[i] = price * quantitiesSold[i];
            totalRevenue += revenue[i];

        }
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + products[i] + " sold " + quantitiesSold[i] + " units at price " + revenue[i]);
        }
        System.out.println("Total revenue: " + totalRevenue);
    }

    //Inventory Shortage Check
    public static void inventoryStorageCheck(String[] products, int[][] inventory, int[] quantitiesSold) {
        for (int i = 0; i < products.length; i++) {
            if (inventory[i][0] < quantitiesSold[i]) {
                System.out.println("Warning: Insufficient stock for " + products[i] + " Sold " + quantitiesSold[i] + " units, but only " + inventory[i][0] + " units were available.");
                break;
            }


        }


    }

    public static void restockingInventory(String[] products,int[][] inventory, int[] quantitiesSold) {
        for (int i = 0; i < products.length; i++) {
            inventory[i][0] -= quantitiesSold[i];
            if (inventory[i][0] < 30) {
                inventory[i][0] +=50;
                System.out.println("Restocking "+products[i]+" with 50 units.");
                System.out.println("Updated stock for "+products[i]+": "+inventory[i][0]+" units.");
            }

        }
    }
    public static void salesSummary(String[] products, int[][] inventory, int[] quantitiesSold) {
        int min=0;
        int max=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sales Summary: ");
        System.out.println("Enter the price range (e.g., from 100 to 500)");
        System.out.println("Enter minimum price:");
        min = sc.nextInt();
        System.out.println("Enter maximum price:");
        max = sc.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (inventory[i][1] >= min && inventory[i][1] <= max) {
                System.out.println("Product: " + products[i] + ", generated revenue of :"+inventory[i][1]+"Rs");

            }
            else {
                System.out.println("Thera are no products within this range");
            }

        }
    }
    public static void outOfStock(String[] products, int[][] inventory, int[] quantitiesSold) {
        for (int i = 0; i < products.length; i++) {
            if (inventory[i][0] ==0) {
                System.out.println("Product is out of stock, it is unavailable for purchase");
            }
        }
    }

}
