package com.example.gestordepedidos.model;

import java.util.ArrayList;
import java.util.List;

public class CompositeOrder extends Order {
     List<Order> subOrders;


    public CompositeOrder(Client client, PaymentAccount paymentAccount) {
        super(client, paymentAccount);
        subOrders = new ArrayList<>();
    }

    public void addSubOrder(Order subOrder) {
        subOrders.add(subOrder);
    }

    public List<Order> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<Order> subOrders) {
        this.subOrders = subOrders;
    }

    public int getTotalProductQuantity() {
        int total = 0;
        for (Order order : subOrders) {
            total += order.getTotalProductQuantity();
        }
        return total;
    }

    public void removeSimpleOrder(SimpleOrder simpleOrder) {
        subOrders.remove(simpleOrder);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Order order : subOrders) {
            total += order.getTotalPrice();
        }
        return total;
    }
}