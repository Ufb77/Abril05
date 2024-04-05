package com.softtek.modelo;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
