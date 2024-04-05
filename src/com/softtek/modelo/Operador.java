package com.softtek.modelo;

public class Operador extends Empleado{
    private int piezas;
    private double incentivo;

    public Operador() {
    }

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    @Override
    public double calcularNomina() {
        return ((this.piezas * this.incentivo) + this.sueldo) * this.PORCENTAJE;
    }
}
