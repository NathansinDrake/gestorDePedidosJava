package com.example.gestordepedidos.model;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String address;
    private String email;
    private List<PaymentAccount> paymentAccounts;

    public Client(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.paymentAccounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PaymentAccount> getPaymentAccounts() {
        return paymentAccounts;
    }

    public void setPaymentAccounts(List<PaymentAccount> paymentAccounts) {
        this.paymentAccounts = paymentAccounts;
    }

    public void addAccountPayment(PaymentAccount paymentAccount) {
        this.paymentAccounts.add(paymentAccount);
    }
}
