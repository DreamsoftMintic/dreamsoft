package com.dreamsoft.ingresosegresos.DAO;

import com.dreamsoft.ingresosegresos.Entity.Empleado;

import java.util.List;

public interface IEmpleadoDAO {

    //Declaración de metodos para acceder a la base de datos

    List<Empleado> listarEmpleado();
    public Empleado listarEmpleado(int documento);
    public void actualizarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);


}
