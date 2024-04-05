package com.softtek.modelo;

public class Guitarra extends InstrumentoMusical {

    private String tipoCuerdas;

    public Guitarra() {

    }

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    @Override
    public String emitirSonido() {
        return "Sonido de guitarra";
    }
}
