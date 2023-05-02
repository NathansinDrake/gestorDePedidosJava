package com.example.gestordepedidos.model;

import java.util.ArrayList;
import java.util.List;

public class CollectionSystem {
    private  List<PaymentAccount> paymentAccounts;

    public CollectionSystem() {
        this.paymentAccounts = new ArrayList<>();
    }

    public void addPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccounts.add(paymentAccount);
    }

    public void chargeClients() {
        for (PaymentAccount paymentAccount : paymentAccounts) {
            if (paymentAccount.getOrderList().size() > 0) {
                double totalAmount = 0;
                for (Order order : paymentAccount.getOrderList()) {
                    totalAmount += order.getTotalPrice();
                }
                if (paymentAccount.getAvailableBalance() >= totalAmount) {
                    paymentAccount.setAvailableBalance(paymentAccount.getAvailableBalance() - totalAmount);
                    paymentAccount.getOrderList().forEach(order -> order.setConfirmed(true));
                } else {
                    paymentAccount.getOrderList().forEach(order -> order.setConfirmed(false));
                }
                paymentAccount.getOrderList().clear();
            }
        }
    }
    public List<PaymentAccount> getPaymentAccounts() {
        return paymentAccounts;
    }

    public void setPaymentAccounts(List<PaymentAccount> paymentAccounts) {
        this.paymentAccounts = paymentAccounts;
    }
}