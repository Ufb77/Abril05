package com.softtek.presentacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import static java.time.temporal.ChronoUnit.*;

public class Ej1Fechas {

    public static void main(String [] args){

        //Declarar la fecha de inicio del curso y le sumamos 10 días

        LocalDate fechaInicio = LocalDate.parse("2024-04-01");
        System.out.println("10 días tras inicio del curso: " + fechaInicio.plusDays(10));

        //Declarar la fecha de hoy con la zona horaria por defecto
        LocalDateTime fechaHoy = LocalDateTime.now();
        System.out.println("Fecha de hoy: " +fechaHoy);

        //Declarar la fecha de hoy con la zona horaria de “Australia/Sydney”
        LocalDateTime australia = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Fecha y tiempo de Australia: " + australia);

        //Cual es el día 100 de 2024
        LocalDate fecha100 = LocalDate.of(2024,01,01);
        System.out.println("Día 100 de 2024: " + fecha100.plusDays(99));

        //Definir una fecha para navidad y otra para noche vieja y compararlas
        //con los métodos isBefore isAfter


        LocalDate navidad = LocalDate.of(2024,12,25);
        LocalDate nocheVieja = LocalDate.of(2024,12,31);

        System.out.println("Navidad antes de Noche Vieja " + navidad.isBefore(nocheVieja));
        System.out.println("Noche vieja después de Navidad " + nocheVieja.isAfter(navidad));

        //Calcular la fecha resultante sumando 35 semanas al 15 de marzo de
        //2024.

        LocalDate semanaMas35 = LocalDate.of(2024, 03, 15);

        System.out.println("Fecha resultante después de 35 semanas: " + semanaMas35.plusWeeks(35));

        //Calcular los años trabajados en una empresa de un empleado que inició
        //a trabajar el 6 de Julio de 2012

        LocalDate fechaInicioTrabajo = LocalDate.of(2012, 07, 06);
        System.out.println("Años trabajados: " + LocalDate.now().minusYears(fechaInicioTrabajo.getYear()).getYear());

        //Calcular la edad de una persona que nació el 7 de agosto de 2007
        LocalDate fechaNacimiento = LocalDate.of(2007,8,07);
        System.out.println("Edad de la persona en años: " + LocalDate.now().minusYears(fechaNacimiento.getYear()).getYear());

        //Calcular la fecha en que se tiene que iniciar un proyecto si su duración
        //es 200 días y se tiene que entregar el 2 de octubre de 2024
        LocalDate fechaInicioProyecto = LocalDate.of(2024,10,2);
        System.out.println("Fecha de inicio de proyecto : " + fechaInicioProyecto.minusDays(200));

        //Si un proyecto inicia el 15 de marzo y termina el 20 de octubre cuál es
        //su periodo.

        LocalDate inicioProyecto = LocalDate.parse("2024-03-15");
        LocalDate finProyecto = LocalDate.parse("2024-10-20");

        System.out.println("Días diferencia: " + DAYS.between(inicioProyecto, finProyecto));
        System.out.println("Meses diferencia: " +MONTHS.between(inicioProyecto, finProyecto));
        System.out.println("Años diferencia: " +YEARS.between(inicioProyecto, finProyecto));
    }
}
