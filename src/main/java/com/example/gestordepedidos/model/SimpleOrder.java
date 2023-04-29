package com.example.gestordepedidos.model;

import java.util.List;
public class SimpleOrder extends Order {
    private List<OrderItem> orderItems;

    public SimpleOrder(int orderId, Client client, PaymentAccount paymentAccount, boolean isConfirmed, List<OrderItem> orderItems) {
        super(orderId, client, paymentAccount, false, isConfirmed);
        this.orderItems = orderItems;
    }

    @Override
    public int getTotalProductQuantity() {
        int total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getQuantity();
        }
        return total;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    public double getTotalPrice() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
