package com.softtek.modelo;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected final double PORCENTAJE = 0.75;

    public Empleado() {
    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    public double calcularNomina(){
        return this.sueldo * this.PORCENTAJE;
    }
}
