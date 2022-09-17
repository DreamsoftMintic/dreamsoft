package com.dreamsoft.ingresosegresos.controllers;

import com.dreamsoft.ingresosegresos.entities.Empleado;
import com.dreamsoft.ingresosegresos.entities.Empresa;
import com.dreamsoft.ingresosegresos.entities.Rol;
import com.dreamsoft.ingresosegresos.services.EmpresaService;
import com.dreamsoft.ingresosegresos.services.UsuarioService;
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
public class FrontUsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @Autowired
    EmpresaService empresaService;

    private final Logger LOG = Logger.getLogger(""+FrontUsuarioController.class);

    @GetMapping("/usuarios/verUsuarios")
    public String viewUsuarios(Model model){
        LOG.log(Level.INFO,"viewUsuarios");
        List<Empleado> usuarios = usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "usuarios/verUsuarios";
    }

    @GetMapping("/usuarios/crearUsuario")
    public String createUsuario(Model model){
        LOG.log(Level.INFO,"createUsuario");
        //usuario
        Empleado usuario = new Empleado();
        model.addAttribute("usuario",usuario);
        //empresa
        List<Empresa> empresas = empresaService.getEmpresas();
        model.addAttribute("empresas",empresas);
        return "usuarios/crearUsuario";
    }

    @PostMapping("/guardarUsuario")
    public String saveUsuario(Empleado usuario){
        LOG.log(Level.INFO,"saveUsuario");
        System.out.println(usuario.toString());
        usuario.setFechaCr(LocalDate.now());
        usuario.setFechaUpd(LocalDate.now());
        usuario = usuarioService.createUsuario(usuario);
        return "redirect:/usuarios/verUsuarios";
    }

    @GetMapping("/usuarios/editarUsuario")
    public String editUsuario(Model model){
        LOG.log(Level.INFO,"editUsuario");
        return "usuarios/editarUsuario";
    }

    @GetMapping("/usuarios/eliminarUsuario")
    public String deleteUsuario(Model model){
        LOG.log(Level.INFO,"deleteUsuario");
        return "usuarios/eliminarUsuario";
    }
}
