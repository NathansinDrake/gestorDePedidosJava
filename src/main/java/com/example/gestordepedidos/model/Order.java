package com.example.gestordepedidos.model;

public abstract class Order {
    private int orderId;
    private Client client;
    private PaymentAccount paymentAccount;
    private boolean isComposite;
    private boolean isConfirmed;

    public Order(int orderId, Client client, PaymentAccount paymentAccount, boolean isComposite, boolean isConfirmed) {
        this.orderId = orderId;
        this.client = client;
        this.paymentAccount = paymentAccount;
        this.isComposite = isComposite;
        this.isConfirmed = isConfirmed;
    }
    public Order(Client client, PaymentAccount paymentAccount) {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public boolean isComposite() {
        return isComposite;
    }

    public void setComposite(boolean composite) {
        isComposite = composite;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public abstract int getTotalProductQuantity();

    public abstract double getTotalPrice();

}