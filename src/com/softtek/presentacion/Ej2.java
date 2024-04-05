package com.softtek.presentacion;

import com.softtek.modelo.Empleado;
import com.softtek.modelo.Gerente;
import com.softtek.modelo.Operador;
import com.softtek.modelo.Vendedor;

public class Ej2 {

    public static void main(String[] args){

        Empleado e1 = new Empleado("Pepe", 1000);
        Gerente g1 = new Gerente("Samuel", 1000, 500);
        Vendedor v1 = new Vendedor("Ana", 1000, 30, 2);
        Operador o1 = new Operador("Pepa", 1000, 20, 2);


        System.out.println("Nómina empleado: " + e1.calcularNomina());
        System.out.println("Nómina gerente: " + g1.calcularNomina());
        System.out.println("Nómina vendedor: " + v1.calcularNomina());
        System.out.println("Nómina operador: " + o1.calcularNomina());


    }
}
