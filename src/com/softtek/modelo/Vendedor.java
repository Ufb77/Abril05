package com.softtek.modelo;

public class Vendedor extends Empleado{
    private double ventas;
    private double comision;



    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularNomina() {
        return (this.sueldo + this.ventas * comision) * this.PORCENTAJE;

    }
}
