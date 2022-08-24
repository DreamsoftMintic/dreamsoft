package com.dreamsoft.ingresosegresos;

import java.time.LocalDate;

public class MovimientoDinero {
    private double monto;
    private boolean ingreso;
    private String concepto;
    private LocalDate fecha;
    private Empleado empleado;

    public MovimientoDinero(double monto, boolean ingreso, String concepto, LocalDate fecha, Empleado empleado) {
        if (ingreso == true){
            this.monto = monto;
        }else{
            this.monto = -monto;
        }
        this.ingreso = ingreso;
        this.concepto = concepto;
        this.fecha = fecha;
        this.empleado = empleado;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
        if (ingreso == true){
            this.monto = this.monto;
        }else{
            this.monto = -this.monto;
        }
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void descipcion() {
        System.out.println("Monto " + this.monto);
        System.out.println("Ingreso: " + this.ingreso);
        System.out.println("Concepto: " + this.concepto);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Registrado por: " + this.empleado.getNombreEmpleado());
    }
}
