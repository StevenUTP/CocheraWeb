package com.mycompany.modelo;


import java.time.LocalDate;

public class Prestamo {
    private int id;
    private Cliente cliente;
    private double monto;
    private LocalDate fecha;

    public Prestamo(int id, Cliente cliente, double monto, LocalDate fecha) {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public double getMonto() { return monto; }
    public LocalDate getFecha() { return fecha; }

    public void setId(int id) { this.id = id; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public void setMonto(double monto) { this.monto = monto; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    @Override
    public String toString() {
        return cliente.getNombre() + " - S/" + monto + " - " + fecha;
    }
}
