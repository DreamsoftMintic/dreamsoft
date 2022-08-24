package com.dreamsoft.ingresosegresos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class IngresosEgresosApplication {

    public static void main(String[] args) {

        SpringApplication.run(IngresosEgresosApplication.class, args);
        Empresa Colanta = new Empresa("Colanta","San Pedro - Antioquia", "3333333", 1234);
        Empleado contable = new Empleado("Juan Restrepo", "j.restrepo@colanta.co",Colanta, "operario");
        Empleado gerente = new Empleado("Ana Martinez", "a.martinez@colanta.co",Colanta, "administrador");
        MovimientoDinero ingreso1 = new MovimientoDinero(1000000,true,"Venta Leche", LocalDate.now(), contable);
        MovimientoDinero egreso1 = new MovimientoDinero(200000,false,"Insumos", LocalDate.now(), gerente);

        Colanta.descipcion();
        System.out.println("---------------");
        contable.descipcion();
        System.out.println("---------------");
        gerente.descipcion();
        System.out.println("---------------");
        ingreso1.descipcion();
        System.out.println("---------------");
        egreso1.descipcion();

        ingreso1.setIngreso(false);
        System.out.println("---------------");
        ingreso1.descipcion();

    }


}
