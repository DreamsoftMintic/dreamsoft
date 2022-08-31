package com.dreamsoft.ingresosegresos.DAO;
import com.dreamsoft.ingresosegresos.Entity.Empleado;
import com.dreamsoft.ingresosegresos.Entity.Empresa;
import com.sun.xml.bind.annotation.OverrideAnnotationOf;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAOImpl {

    //lista de Empleados
    List<Empleado> empleado;

    //inicializar los objetos empleado y añadirlos a la lista
    public EmpleadoDaoImpl(){
        empleado =new ArrayList<>();
        Empleado empleado1 =new Empleado("jeyson",1232,"jeyson@gmail.com", .getEmpresaEmpleado(), .empleado1.getRol());

        Empleado empleado2 =new Empleado("Leandro",1232,"leandro@gmail.com");
        empleado.add(empleado1);
        empleado.add(empleado2);
    }
    //Obtener todos los empleados
    @Override
    public List<Empleado> listarEmpleado(){
        return empleado;
    }

    //obtener un empleado por documento
    @Override
    public Empleado listarEmpleado(int documento){
        return empleado.get(documento);
    }

    //actualizar un empleado
    @Override
    public void actualizarEmpleado(Empleado empleado){
        empleado.get(empleado.getDocumento()).setNombre(empleado.getNombreEmpleado());
        empleado.get(empleado.getDocumento()).setCorreo(empleado.getCorreoEmpleado());
        System.out.println("Empleado con documento: "+empleado.getIdEmpleado()+" actualizado satisfactoriamente");
    }

    //eliminar un empleado por documento
    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleado.remove(empleado.getDocumento());
        System.out.println("Empleado con documento: "+empleado.getIdEmpleado()+" eliminado satisfactoriamente");
    }

}
