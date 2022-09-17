package com.dreamsoft.ingresosegresos.controllers;

import com.dreamsoft.ingresosegresos.entities.Empleado;
import com.dreamsoft.ingresosegresos.entities.Empresa;
import com.dreamsoft.ingresosegresos.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class FrontEmpresaController {

    @Autowired
    EmpresaService service;

    private final Logger LOG = Logger.getLogger(""+FrontEmpresaController.class);

    @GetMapping("/empresas/verEmpresas")
    public String viewEmpresas(Model model){
        LOG.log(Level.INFO,"viewEmpresas");
        List<Empresa> empresas = this.service.getEmpresas();
        model.addAttribute("empresas", empresas);
        return "empresas/verEmpresas";
    }

    @GetMapping("/empresas/crearEmpresa")
    public String createEmpresa(Model model){
        LOG.log(Level.INFO,"createEmpresa");
        Empresa empresa = new Empresa();
        model.addAttribute("empresa",empresa);
        return "empresas/crearEmpresa";
    }

    @PostMapping("/guardarEmpresa")
    public String saveEmpresa(Empresa empresa){
        LOG.log(Level.INFO,"saveEmpresa");
        System.out.println(empresa.toString());
        empresa.setFechaCr(LocalDate.now());
        empresa.setFechaUpd(LocalDate.now());
        empresa = this.service.createEmpresa(empresa);
        return "redirect:/empresas/verEmpresas";
    }

    @GetMapping("/empresas/editarEmpresa")
    public String editEmpresa(Model model){
        LOG.log(Level.INFO,"editEmpresa");
        return "empresas/editarEmpresa";
    }

    @GetMapping("/empresas/eliminarEmpresa")
    public String deleteEmpresa(Model model){
        LOG.log(Level.INFO,"deleteEmpresa");
        return "empresas/eliminarEmpresa";
    }


}
