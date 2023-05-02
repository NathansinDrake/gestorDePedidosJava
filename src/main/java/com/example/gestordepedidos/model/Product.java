package com.example.gestordepedidos.model;

public class Product {
    private int productId;
    private String name;
    private int stock;
    private double price;
    private int quantityInStock;

    public Product() {
    }

    public Product(int productId, String name, int stock, double price, int quantityInStock) {
        this.productId = productId;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(int stock) {
        this.stock = stock;
    }

    public Product(double price) {
        this.price = price;
    }

    public void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new IllegalArgumentException("Not enough stock for product " + name);
        }
        stock -= quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void increaseStock(int quantity) {
        stock += quantity;
    }
}