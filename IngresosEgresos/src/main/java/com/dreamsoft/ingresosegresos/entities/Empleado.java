package com.dreamsoft.ingresosegresos.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
//en el modelo entidad-relacion user es la identificacion de tabla empleado
@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
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

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Empresa.class)
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Perfil.class)
    @JoinColumn(name = "perfil_id", nullable=false)
    private Perfil perfil;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<MovimientoDinero> movimientos;

    public Empleado(){

    }
    public Empleado(String nombreEmpleado, int documento, String correoEmpleado, String rol) {
        this.nombreEmpleado = nombreEmpleado;
        this.documento = documento;
        this.correoEmpleado = correoEmpleado;
        this.rol = rol;
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

    public String getRol() {
        return rol;
    }

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

    public void setRol(String rol) {
        this.rol = rol;
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
