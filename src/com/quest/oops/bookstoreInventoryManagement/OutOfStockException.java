package com.quest.oops.bookstoreInventoryManagement;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException(String message) {
        super(message);
    }
}
