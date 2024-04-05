package com.softtek.presentacion;

import com.softtek.modelo.Cuadrado;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Triangulo;

public class Ej3 {

    public static void main(String[] args){
        Cuadrado cPeque = new Cuadrado();
        Cuadrado cMediano = new Cuadrado(0, 3,2);
        Triangulo tPeque = new Triangulo();
        Triangulo tMediano = new Triangulo(0,3,5,6);
        Figura[] listaFiguras = {
                cPeque,
                cMediano,
                tPeque,
                tMediano
        };

        cPeque.setLado(3);
        tPeque.setBase(3);
        tPeque.setAltura(2);

        for (Figura figuras: listaFiguras
             ) {

            System.out.println(figuras.calcularArea());
        }
    }




}
