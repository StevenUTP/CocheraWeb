package com.mycompany.modelo;

public class Cliente {
    private int id;
    private String nombre;
    private String dni;
    private double montoPrestado;
    private double interes;  // en porcentaje
    private double totalPagar;

    // Constructor
    public Cliente(int id, String nombre, String dni, double montoPrestado, double interes) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.montoPrestado = montoPrestado;
        this.interes = interes;
        this.totalPagar = montoPrestado + (montoPrestado * interes / 100);
    }

    // getters y setters para todo

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public double getMontoPrestado() { return montoPrestado; }
    public double getInteres() { return interes; }
    public double getTotalPagar() { return totalPagar; }
}
