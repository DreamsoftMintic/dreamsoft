package com.dreamsoft.ingresosegresos.controllers;

import com.dreamsoft.ingresosegresos.entities.Empresa;
import com.dreamsoft.ingresosegresos.entities.Perfil;
import com.dreamsoft.ingresosegresos.services.PerfilService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerfilController {

    PerfilService service;

    public PerfilController(PerfilService services) {

        this.service = services;
    }

    @GetMapping("/perfil")
    public List<Perfil> getPerfil() {
        return this.service.getPerfil();
    }

    @GetMapping("/perfil/{id}")
    public Perfil getPerfil(@PathVariable("id") long id){
        return this.service.getPerfil(id);

    }

    @PostMapping("/perfil")
    public Perfil createPerfil(@RequestBody Perfil perfil){
        return  this.service.createPerfil(perfil);

    }

    @PutMapping("/perfil/{id}")
    public Perfil updatePerfil(@PathVariable("id") long id, @RequestBody Perfil perfil){
        return this.service.updatePerfil(id,perfil);
    }

    @DeleteMapping("/perfil/{id}")
    public Boolean deletePerfil(@PathVariable("id") long id){
        return this.service.deletePerfil(id);

    }


}
