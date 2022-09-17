package com.dreamsoft.ingresosegresos.controllers;



import com.dreamsoft.ingresosegresos.entities.Empleado;
import com.dreamsoft.ingresosegresos.entities.Empresa;
import com.dreamsoft.ingresosegresos.entities.MovimientoDinero;
import com.dreamsoft.ingresosegresos.services.EmpresaService;
import com.dreamsoft.ingresosegresos.services.MovimientoService;
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
public class FrontMovimientosController {

    @Autowired
    MovimientoService service;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    EmpresaService empresaService;

    private final Logger LOG = Logger.getLogger(""+FrontMovimientosController.class);

    @GetMapping("/movimientos/verMovimientos")
    public String viewMovimientos(Model model){
        LOG.log(Level.INFO,"viewMovimientos");
        List<MovimientoDinero> movimientos = this.service.getMovimientos();
        model.addAttribute("movimientos", movimientos);
        return "movimientos/verMovimientos";
    }

    @GetMapping("/movimientos/crearMovimiento")
    public String createMovimiento(Model model){
        LOG.log(Level.INFO,"createMovimiento");
        //movimiento
        MovimientoDinero movimiento = new MovimientoDinero();
        model.addAttribute("movimiento",movimiento);
        //usuario
        List<Empleado> usuarios = usuarioService.getUsuarios();
        model.addAttribute("usuarios",usuarios);
        //empresa
        List<Empresa> empresas = empresaService.getEmpresas();
        model.addAttribute("empresas",empresas);
        return "movimientos/crearMovimiento";
    }

    @PostMapping("/guardarMovimiento")
    public String saveMovimiento(MovimientoDinero movimiento){
        LOG.log(Level.INFO,"saveMovimiento");
        System.out.println(movimiento.toString());
        movimiento.setFechaCr(LocalDate.now());
        movimiento.setFechaUpd(LocalDate.now());
        movimiento = this.service.createMovimiento(movimiento);
        return "redirect:/movimientos/verMovimientos";
    }

    @GetMapping("/movimientos/editarMovimiento")
    public String editMovimiento(Model model){
        LOG.log(Level.INFO,"editMovimiento");
        return "movimientos/editarMovimiento";
    }

    @GetMapping("/movimientos/eliminarMovimiento")
    public String deleteMovimiento(Model model){
        LOG.log(Level.INFO,"deleteMovimiento");
        return "movimientos/eliminarMovimiento";
    }
}
