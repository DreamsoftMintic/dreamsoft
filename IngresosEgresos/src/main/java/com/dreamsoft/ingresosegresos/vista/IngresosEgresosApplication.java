package com.dreamsoft.ingresosegresos.vista;

import com.dreamsoft.ingresosegresos.modelo.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class IngresosEgresosApplication {

    public static void main(String[] args) {


        SpringApplication.run(IngresosEgresosApplication.class, args);

        // Esto debe ser escrito en el front end para que sea solo dos opciones
        Rol admin = new Rol("Administrador");
        Rol op = new Rol("Operativo");

        //creacion de perfil

        Perfil juan = new Perfil("1234", "Foto1.jpg","1112233","juan.restrepo", "juan1234");
        Perfil ana = new Perfil("1235", "Foto2.jpg","1112233","ana.martinez", "ana1234");

        //creacion empresa
        Empresa Colanta = new Empresa("Colanta","San Pedro - Antioquia", "3333333", 1234);
        //creacion empleados
        Empleado contable = new Empleado("Juan Restrepo", 7654321,"j.restrepo@colanta.co", Colanta, op, juan);
        Empleado gerente = new Empleado("Ana Martinez", 87654321,"a.martinez@colanta.co",Colanta, admin, ana);
        //creacion ingreso y egreso
        MovimientoDinero ingreso1 = new MovimientoDinero(1000000,true,"Venta Leche", LocalDate.of(2022,07,25), contable);
        MovimientoDinero egreso1 = new MovimientoDinero(200000,false,"Insumos", LocalDate.of(2022,07,26), gerente);

        //Prueba
        Colanta.descipcion();
        System.out.println("---------------");
        juan.descipcion();
        System.out.println("---------------");
        contable.descipcion();
        System.out.println("---------------");
        ana.descipcion();
        System.out.println("---------------");
        gerente.descipcion();
        System.out.println("---------------");
        ingreso1.descipcion();
        System.out.println("---------------");
        egreso1.descipcion();
        //prueba modificando ingreso por egreso
        ingreso1.setIngreso(false);
        System.out.println("---------------");
        ingreso1.descipcion();


    }


}
