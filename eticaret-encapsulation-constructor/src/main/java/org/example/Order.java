package org.example;

public class Order {
    private int orderNumber;
    public Order() {
    }
    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
