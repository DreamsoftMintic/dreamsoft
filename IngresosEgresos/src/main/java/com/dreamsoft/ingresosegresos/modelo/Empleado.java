package com.dreamsoft.ingresosegresos.modelo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpleado;
    @Column(name = "nombreEmpleado")
    private String nombreEmpleado;
    @Column(name = "documento")
    private int documento;
    @Column(name = "correoEmpleado", unique = true)
    private String correoEmpleado;

    public enum rolename{ ADMIN, OPERARIO ;  }
    @Column(name = "rol")
    private rolename rol;
    @Column(name = "fechaCr")
    private LocalDate fechaCr;
    @Column(name = "fechaUpd")
    private LocalDate fechaUpd;

    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false)
    private Empresa empresaEmpleado;
    @OneToOne
    @JoinColumn(name = "idPerfil", referencedColumnName = "idEmpleado")
    private Perfil perfil;

    @OneToMany(mappedBy = "Empleado")
    private List<MovimientoDinero> movimientos;


    public Empleado(String nombreEmpleado, int documento, String correoEmpleado, Empresa empresaEmpleado, rolename rol, Perfil perfil) {
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

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public rolename getRol() {
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

    public void setRol(rolename rol) {
        this.rol = rol;
        this.fechaUpd = LocalDate.now();
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
        this.fechaUpd = LocalDate.now();
    }

    /*public void descipcion() {
        System.out.println("Descripcion Empleado");
        System.out.println("Empleado: " + this.nombreEmpleado);
        System.out.println("Correo: " + this.correoEmpleado);
        System.out.println("Empresa: " + this.empresaEmpleado.getNombreEmpresa());
        System.out.println("Rol: " + this.rol);
        System.out.println("Perfil: " + this.perfil.getId());
        System.out.println("Fecha creacion en sistema: " + this.fechaCr);
        System.out.println("Fecha actualizacion en sistema: " + this.fechaUpd);
    }

     */
}
