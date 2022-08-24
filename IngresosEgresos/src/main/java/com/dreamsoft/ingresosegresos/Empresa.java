package com.dreamsoft.ingresosegresos;

public class Empresa {
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private int NIT;

    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, int NIT) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NIT = NIT;
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

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public void descipcion(){
        System.out.println("Empresa: " + this.nombreEmpresa);
        System.out.println("Direccion: " + this.direccionEmpresa);
        System.out.println("Telefono: " + this.telefonoEmpresa);
        System.out.println("NIT: " + this.NIT);
    }
}
