package com.softtek.presentacion;

import com.softtek.modelo.Bateria;
import com.softtek.modelo.Flauta;
import com.softtek.modelo.Guitarra;
import com.softtek.modelo.InstrumentoMusical;

public class Ej4 {
    public static void main(String[] args){
        InstrumentoMusical guido = new Guitarra("Fender", "nylon" );
        InstrumentoMusical bataca = new Bateria("Millenium", 5);
        InstrumentoMusical ham = new Flauta("Hohner", "madera");

        InstrumentoMusical[] listaInstrumentos = {
                guido,
                bataca,
                ham
        };

        for (InstrumentoMusical instrumento: listaInstrumentos
             ) {

            System.out.println(instrumento.emitirSonido());
        }
    }
}
