package com.softtek.modelo;

public class Flauta extends InstrumentoMusical{
    private String material;

    public Flauta() {

    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    @Override
    public String emitirSonido() {
        return "Sonido de flauta";
    }
}
