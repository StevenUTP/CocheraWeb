package com.mycompany.modelo;

public class Cliente {
    private String id;
    private String nombre;
    private String dni;
    private String placa;
    private String horaIngreso;
    private String horaSalida;
    private String cochera;
    private double montoPorMinuto;
    private double montoTotal;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor completo
    public Cliente(String id, String nombre, String dni, String placa, String horaIngreso, String horaSalida,
                   String cochera, double montoPorMinuto, double montoTotal) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.placa = placa;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.cochera = cochera;
        this.montoPorMinuto = montoPorMinuto;
        this.montoTotal = montoTotal;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getCochera() {
        return cochera;
    }

    public void setCochera(String cochera) {
        this.cochera = cochera;
    }

    public double getMontoPorMinuto() {
        return montoPorMinuto;
    }

    public void setMontoPorMinuto(double montoPorMinuto) {
        this.montoPorMinuto = montoPorMinuto;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " - " + placa;
    }
}
