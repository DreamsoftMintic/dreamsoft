package com.dreamsoft.ingresosegresos.modelo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idMovimientoDinero;
    @Column(name = "monto")
    private double monto;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "fechaMovimiento")
    private LocalDate fechaMovimiento;
    @Column(name = "fechaCr")
    private LocalDate fechaCr;
    @Column(name = "fechaUpd")
    private LocalDate fechaUpd;

    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false)
    private Empresa empresaEmpleado;
    @ManyToOne
    @JoinColumn(name = "idEmpleado", nullable = false)
    private Empleado empleado;

    public MovimientoDinero(double monto, String concepto, LocalDate fechaMovimiento, Empleado empleado) {
        this.monto = monto;
        this.concepto = concepto;
        this.fechaMovimiento = fechaMovimiento;
        this.empleado = empleado;
        this.fechaCr = LocalDate.now();
        this.fechaUpd = LocalDate.now();
    }

    public double getMonto() {
        return monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public LocalDate getFechaMovimiento() {
        return fechaMovimiento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public LocalDate getFechaCr() {
        return fechaCr;
    }

    public LocalDate getFechaUpd() {
        return fechaUpd;
    }

    public void setMonto(double monto) {
        this.monto = monto;
        this.fechaUpd = LocalDate.now();
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
        this.fechaUpd = LocalDate.now();
    }

    public void setFechaMovimiento(LocalDate fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
        this.fechaUpd = LocalDate.now();
    }

    /*public void descipcion() {
        System.out.println("Descripcion Movimiento Dinero");
        System.out.println("Monto " + this.monto);
        System.out.println("Concepto: " + this.concepto);
        System.out.println("Fecha movimiento: " + this.fechaMovimiento);
        System.out.println("Registrado por: " + this.empleado.getNombreEmpleado());
        System.out.println("Fecha creacion en sistema: " + this.fechaCr);
        System.out.println("Fecha actualizacion en sistema: " + this.fechaUpd);
    }
    */
}
