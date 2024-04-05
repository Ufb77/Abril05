package com.softtek.modelo;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) /2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
