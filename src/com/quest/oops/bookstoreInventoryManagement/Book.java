package com.quest.oops.bookstoreInventoryManagement;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;
    public static final double DISCOUNT_PERCENTAGE = 0.5;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void checkStock(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("The item " + title + " is out of stock");
        }
        stock -= quantity;
        System.out.println("Purchase successful for: " + title + ". Remaining stock: " + stock);
    }
    public double discountPrice() {
        return price-(price*DISCOUNT_PERCENTAGE);
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
