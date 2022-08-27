package com.dreamsoft.ingresosegresos.modelo;

import java.time.LocalDate;

public class MovimientoDinero {
    private double monto;
    private boolean ingreso;
    private String concepto;
    private LocalDate fechaMovimiento;
    private Empleado empleado;
    private LocalDate fechaCr;
    private LocalDate fechaUpd;
    public MovimientoDinero(double monto, boolean ingreso, String concepto, LocalDate fechaMovimiento, Empleado empleado) {
        if (ingreso == true){
            this.monto = monto;
        }else{
            this.monto = -monto;
        }
        this.ingreso = ingreso;
        this.concepto = concepto;
        this.fechaMovimiento = fechaMovimiento;
        this.empleado = empleado;
        this.fechaCr = LocalDate.now();
        this.fechaUpd = LocalDate.now();
    }

    public double getMonto() {
        return monto;
    }

    public boolean isIngreso() {
        return ingreso;
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

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
        if (ingreso == true){
            this.monto = this.monto;
        }else{
            this.monto = -this.monto;
        }
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

    public void descipcion() {
        System.out.println("Descripcion Movimiento Dinero");
        System.out.println("Monto " + this.monto);
        System.out.println("Ingreso: " + this.ingreso);
        System.out.println("Concepto: " + this.concepto);
        System.out.println("Fecha movimiento: " + this.fechaMovimiento);
        System.out.println("Registrado por: " + this.empleado.getNombreEmpleado());
        System.out.println("Fecha creacion en sistema: " + this.fechaCr);
        System.out.println("Fecha actualizacion en sistema: " + this.fechaUpd);
    }
}
