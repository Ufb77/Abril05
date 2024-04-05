package com.softtek.modelo;

public class Figura {

    protected int x;
    protected int y;

    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calcularArea(){
        return this.x * this.y;
    };


}
