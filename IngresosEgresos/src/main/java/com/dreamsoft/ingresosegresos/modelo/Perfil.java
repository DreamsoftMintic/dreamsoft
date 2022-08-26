package com.dreamsoft.ingresosegresos.modelo;

import java.time.LocalDate;

public class Perfil {
    private String id;
    private String imagen;
    private String telefono;
    private String usuario;
    private String pass;
    private LocalDate fechaCr;
    private LocalDate fechaUpd;

    public Perfil(String id, String imagen, String telefono, String usuario, String pass) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
        this.usuario = usuario;
        this.pass = pass;
        this.fechaCr = LocalDate.now();
        this.fechaUpd = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getImage() {
        return imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public LocalDate getFechaCr() {
        return fechaCr;
    }

    public LocalDate getFechaUpd() {
        return fechaUpd;
    }

    public void setImage(String imagen) {
        this.imagen = imagen;
        this.fechaUpd = LocalDate.now();
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        this.fechaUpd = LocalDate.now();
    }

    public void setPass(String pass) {
        this.pass = pass;
        this.fechaUpd = LocalDate.now();
    }



    public void descipcion() {
        System.out.println("Descripcion Perfil");
        System.out.println("Id: " + this.id);
        System.out.println("Imagen: " + this.imagen);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Contrasena: " + this.pass);
        System.out.println("Fecha creacion en sistema: " + this.fechaCr);
        System.out.println("Fecha actualizacion en sistema: " + this.fechaUpd);
    }
}
