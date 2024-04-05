package com.softtek.presentacion;

import com.softtek.modelo.Producto;
import com.softtek.modelo.ProductoPerecedero;

import java.time.LocalDate;

public class Ej1 {

    public static void main(String[] args){
        Producto p0 = new Producto("PS5", 5, 500);
        ProductoPerecedero p1 = new ProductoPerecedero("Leche", 2, 3, LocalDate.now(), LocalDate.parse("2024-03-01"));

        System.out.println(p0.cantidadAPagar());

        System.out.println(p1.cantidadAPagar());

        System.out.println(p1.tiempoConsumicion());
    }




}
