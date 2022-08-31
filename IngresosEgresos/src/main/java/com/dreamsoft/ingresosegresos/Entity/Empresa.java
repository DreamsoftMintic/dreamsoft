package com.dreamsoft.ingresosegresos.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpresa;
    @Column(name = "nombre_empresa", unique = true)
    private String nombreEmpresa;
    @Column(name = "direccion_empresa")
    private String direccionEmpresa;
    @Column(name = "telefono_empresa")
    private String telefonoEmpresa;
    @Column(name = "NIT", unique = true)
    private int NIT;
    @Column(name = "fecha_cr")
    private LocalDate fechaCr;
    @Column(name = "fecha_upd")
    private LocalDate fechaUpd;

    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "empresa")
    private List<MovimientoDinero> movimientos;

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

    public long getIdEmpresa() {
        return idEmpresa;
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


/*
    public void descipcion(){
        System.out.println("Descripcion Empresa");
        System.out.println("Empresa: " + this.nombreEmpresa);
        System.out.println("Direccion: " + this.direccionEmpresa);
        System.out.println("Telefono: " + this.telefonoEmpresa);
        System.out.println("NIT: " + this.NIT);
        System.out.println("Fecha creacion en sistema: " + this.fechaCr);
        System.out.println("Fecha actualizacion en sistema: " + this.fechaUpd);
    }

 */
}
