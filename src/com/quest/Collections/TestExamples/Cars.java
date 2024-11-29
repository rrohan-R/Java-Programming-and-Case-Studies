package com.quest.Collections.TestExamples;

public class Cars implements Comparable<Cars> {
    private String name;
    private String color;
    private double price;
    private int year;

    public Cars(String name, String color, double price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cars [name=" + name + ", color=" + color + ", price=" + price + ", year=" + year + "]";
    }

    @Override
    public int compareTo(Cars o) {
        return year-o.getYear() ;
    }
}
