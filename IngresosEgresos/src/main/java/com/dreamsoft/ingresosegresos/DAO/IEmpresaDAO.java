package com.dreamsoft.ingresosegresos.DAO;

import com.dreamsoft.ingresosegresos.Entity.Empresa;


public interface IEmpresaDAO {
    public default list<Empresa> listarEmpresa();
}
