package com.quest.oops.bookstoreInventoryManagement;

import java.util.Scanner;

public class BookstoreInventoryManagement {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter atleast 5 books: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter title: ");
            String title = sc.next();
            System.out.println("Enter author: ");
            String author = sc.next();
            System.out.println("Enter price: ");
            double price = sc.nextDouble();
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Is this a special edition book? (yes/no): ");
            String isSpecialBook = sc.next();
            if (isSpecialBook.equalsIgnoreCase("yes")) {
                System.out.print("Please enter the special feature: ");
                String specialFeature = sc.next();
                books[i] = new SpecialEditionBook(title, author, price, quantity, specialFeature);
            } else {
                books[i] = new Book(title, author, price, quantity);
            }
        }
        System.out.println("The books available are: ");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("There are 5 books available as shown.\nEnter the the book you want to purchase (1-5): ");
        int bookIndex = sc.nextInt() - 1;
        System.out.println("Enter the quantity you want to purchase: ");
        int quantity = sc.nextInt();
        books[bookIndex].checkStock(quantity);

        System.out.print("\nEnter a price threshold to display books priced above it: ");
        double priceThreshold = sc.nextDouble();
        System.out.println("Books priced above $" + priceThreshold + ":");
        AFunctionalInterface aFunctionalInterface = (book) -> book.getPrice() > priceThreshold;
        for (Book book : books) {
            if (aFunctionalInterface.functionalInterfaceMethod(book)) {
                System.out.println(book.getTitle());
            }
        }
        System.out.println("\nDiscounted Prices of All Books:");
        for (Book book : books) {
            System.out.println(book.getTitle()+" : "+ book.discountPrice());
        }


    }


}

