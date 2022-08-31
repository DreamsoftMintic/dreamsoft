package com.dreamsoft.ingresosegresos.Entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPerfil;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "pass")
    private String pass;
    @Column(name = "fecha_cr")
    private LocalDate fechaCr;
    @Column(name = "fecha_upd")
    private LocalDate fechaUpd;

    @OneToOne(mappedBy = "perfil")
    private Empleado empleado;

    public Perfil(long idPefil, String imagen, String telefono, String pass) {
        this.idPerfil = idPerfil;
        this.imagen = imagen;
        this.telefono = telefono;
        this.pass = pass;
        this.fechaCr = LocalDate.now();
        this.fechaUpd = LocalDate.now();
    }

    public long getId() {
        return idPerfil;
    }

    public String getImage() {
        return imagen;
    }

    public String getTelefono() {
        return telefono;
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



    /*public void descipcion() {
        System.out.println("Descripcion Perfil");
        System.out.println("Id: " + this.idPerfil);
        System.out.println("Imagen: " + this.imagen);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Contrasena: " + this.pass);
        System.out.println("Fecha creacion en sistema: " + this.fechaCr);
        System.out.println("Fecha actualizacion en sistema: " + this.fechaUpd);


    }
   */
}
