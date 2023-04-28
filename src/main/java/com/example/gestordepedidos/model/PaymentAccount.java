package com.example.gestordepedidos.model;

import java.util.ArrayList;
import java.util.List;

public class PaymentAccount {
    private TarjetaDeCredito tarjetaDeCredito;
    private double saldoDisponible;
    private List<Pedido> pedidos;

    public PaymentAccount(TarjetaDeCredito tarjetaDeCredito, double saldoDisponible) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        this.saldoDisponible = saldoDisponible;
        this.pedidos = new ArrayList<>();
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}