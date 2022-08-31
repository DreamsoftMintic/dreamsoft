package com.dreamsoft.ingresosegresos.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpleado;
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @Column(name = "documento")
    private int documento;
    @Column(name = "correo_empleado", unique = true)
    private String correoEmpleado;
    @Column(name = "rol")
    private String rol;
    @Column(name = "fecha_cr")
    private LocalDate fechaCr;
    @Column(name = "fecha_upd")
    private LocalDate fechaUpd;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresaEmpleado = new Empresa();
    @OneToOne
    @JoinColumn(name = "id_perfil", referencedColumnName = "id_empleado")
    private Perfil perfil;

    @OneToMany(mappedBy = "empleado")
    private List<MovimientoDinero> movimientos;


    public Empleado(String nombreEmpleado, int documento, String correoEmpleado, Empresa empresaEmpleado, String rol, Perfil perfil) {
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

    public String getRol() {
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

    public void setRol(String rol) {
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
