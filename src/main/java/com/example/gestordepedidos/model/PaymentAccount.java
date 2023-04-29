package com.example.gestordepedidos.model;

import java.util.ArrayList;
import java.util.List;

public class PaymentAccount {
    private CreditCard creditCard;
    private  double availableBalance;
    private List<Order> orderList;

    public PaymentAccount(CreditCard creditCard, double availableBalance) {
        this.creditCard = creditCard;
        this.availableBalance = availableBalance;
        this.orderList = new ArrayList<>();
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void addOrder(Order order) {
        this.orderList.add(order);
    }
}