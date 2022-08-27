package com.dreamsoft.ingresosegresos.modelo;

import java.time.LocalDate;

public class Empresa {
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private int NIT;
    private LocalDate fechaCr;
    private LocalDate fechaUpd;

    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, int NIT) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NIT = NIT;
        this.fechaCr = LocalDate.now();
        this.fechaUpd = LocalDate.now();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public int getNIT() {
        return NIT;
    }

    public LocalDate getFechaCr() {
        return fechaCr;
    }

    public LocalDate getFechaUpd() {
        return fechaUpd;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.fechaUpd = LocalDate.now();
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
        this.fechaUpd = LocalDate.now();
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
        this.fechaUpd = LocalDate.now();
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
        this.fechaUpd = LocalDate.now();
    }



    public void descipcion(){
        System.out.println("Descripcion Empresa");
        System.out.println("Empresa: " + this.nombreEmpresa);
        System.out.println("Direccion: " + this.direccionEmpresa);
        System.out.println("Telefono: " + this.telefonoEmpresa);
        System.out.println("NIT: " + this.NIT);
        System.out.println("Fecha creacion en sistema: " + this.fechaCr);
        System.out.println("Fecha actualizacion en sistema: " + this.fechaUpd);
    }
}
