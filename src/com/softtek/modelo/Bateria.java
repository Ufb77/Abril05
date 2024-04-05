package com.softtek.modelo;

public class Bateria extends InstrumentoMusical {
    private int noPlatillos;

    public Bateria() {

    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    @Override
    public String emitirSonido() {
        return "Sonido de batería";
    }
}
