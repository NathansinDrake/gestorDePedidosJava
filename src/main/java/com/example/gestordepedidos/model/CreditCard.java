package com.example.gestordepedidos.model;

package model;

public class CreditCard {
    private String cardNumber;
    private String expirationDate;
    private String cardholderName;
    private String cvv;

    public CreditCard(String cardNumber, String expirationDate, String cardholderName, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cardholderName = cardholderName;
        this.cvv = cvv;
    }

    public CreditCard() {
    }

}
