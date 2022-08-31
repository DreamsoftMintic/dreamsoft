package com.dreamsoft.ingresosegresos.DAODemo;

import com.dreamsoft.ingresosegresos.DAO.EmpleadoDAOImpl;
import com.dreamsoft.ingresosegresos.DAO.IEmpleadoDAO;
import com.dreamsoft.ingresosegresos.Entity.Empleado;

public class DaoDemo {

    public static void main(String[] args) {
        // objeto para manipular el dao
        IEmpleadoDAO empleadoDAO = new EmpleadoDAOImpl();

        // imprimir los empleados
        empleadoDAO.listarEmpleado().forEach(System.out::println);

        // obtner un empleados
        Empleado empleado = empleadoDAO.listarEmpleado(0);
        empleado.setCorreoEmpleado("evaristo@gmail.com");

        //actualizar empleados
        empleadoDAO.actualizarEmpleado(empleado);

        // imprimir los empleados
        System.out.println("*****");
        empleadoDAO.listarEmpleado().forEach(System.out::println);

    }


}
