package com.softtek.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProductoPerecedero extends Producto{

    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    public ProductoPerecedero(String nombre, int cantidad, double pvp,
                              LocalDate fCaducidad, LocalDate fFabricacion) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabricacion = fFabricacion;
    }

    public long tiempoConsumicion(){
        return ChronoUnit.DAYS.between(fFabricacion, fCaducidad);
    }
}
