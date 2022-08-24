package com.dreamsoft.ingresosegresos;

public class Empleado {
    private String nombreEmpleado;
    private String correoEmpleado;
    private Empresa empresaEmpleado;
    private String rol;

    public Empleado(String nombreEmpleado, String correoEmpleado, Empresa empresaEmpleado, String rol) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rol = rol;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void descipcion() {
        System.out.println("Empleado: " + this.nombreEmpleado);
        System.out.println("Correo: " + this.correoEmpleado);
        System.out.println("Empresa: " + this.empresaEmpleado.getNombreEmpresa());
        System.out.println("Rol: " + this.rol);
    }
}
