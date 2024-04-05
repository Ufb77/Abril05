package com.softtek.modelo;

public class Gerente extends Empleado{

    private double bono;

    public Gerente() {
    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    @Override
    public double calcularNomina() {
        return (this.bono + this.sueldo) * this.PORCENTAJE;
    }
}
