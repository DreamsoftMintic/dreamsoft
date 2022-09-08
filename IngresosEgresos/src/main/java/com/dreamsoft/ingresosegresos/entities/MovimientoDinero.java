package com.dreamsoft.ingresosegresos.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movimiento_dinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "monto")
    private double monto;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "fecha_movimiento")
    private LocalDate fechaMovimiento;
    @Column(name = "fecha_cr")
    private LocalDate fechaCr;
    @Column(name = "fecha_upd")
    private LocalDate fechaUpd;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Empresa.class)
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Empleado.class)
    @JoinColumn(name = "empleado_id", nullable = false)
    private Empleado empleado;

    public MovimientoDinero(){

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFechaCr(LocalDate fechaCr) {
        this.fechaCr = fechaCr;
    }

    public void setFechaUpd(LocalDate fechaUpd) {
        this.fechaUpd = fechaUpd;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "id=" + id +
                ", monto=" + monto +
                ", concepto='" + concepto + '\'' +
                ", fechaMovimiento=" + fechaMovimiento +
                ", fechaCr=" + fechaCr +
                ", fechaUpd=" + fechaUpd +
                ", empresa=" + empresa +
                ", empleado=" + empleado +
                '}';
    }
}
