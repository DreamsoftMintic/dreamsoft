package com.dreamsoft.ingresosegresos.modelo;

import java.time.LocalDate;

public class Empleado {
    private String nombreEmpleado;
    private int documento;
    private String correoEmpleado;
    private Empresa empresaEmpleado;
    private Rol rol;
    private Perfil perfil;
    private LocalDate fechaCr;
    private LocalDate fechaUpd;

    public Empleado(String nombreEmpleado, int documento, String correoEmpleado, Empresa empresaEmpleado, Rol rol, Perfil perfil) {
        this.nombreEmpleado = nombreEmpleado;
        this.documento = documento;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rol = rol;
        this.perfil = perfil;
        this.fechaCr = LocalDate.now();
        this.fechaUpd = LocalDate.now();
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getDocumento() { return documento; }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public Rol getRol() {
        return rol;
    }

    public Perfil getPerfil() { return perfil;  }

    public LocalDate getFechaCr() { return fechaCr; }

    public LocalDate getFechaUpd() { return fechaUpd; }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.fechaUpd = LocalDate.now();
    }

    public void setDocumento(int documento) {
        this.documento = documento;
        this.fechaUpd = LocalDate.now();}

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
        this.fechaUpd = LocalDate.now();
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
        this.fechaUpd = LocalDate.now();
    }

    public void setRol(Rol rol) {
        this.rol = rol;
        this.fechaUpd = LocalDate.now();
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
        this.fechaUpd = LocalDate.now();
    }

    public void descipcion() {
        System.out.println("Descripcion Empleado");
        System.out.println("Empleado: " + this.nombreEmpleado);
        System.out.println("Correo: " + this.correoEmpleado);
        System.out.println("Empresa: " + this.empresaEmpleado.getNombreEmpresa());
        System.out.println("Rol: " + this.rol.getRol());
        System.out.println("Perfil: " + this.perfil.getUsuario());
        System.out.println("Fecha creacion en sistema: " + this.fechaCr);
        System.out.println("Fecha actualizacion en sistema: " + this.fechaUpd);
    }
}
