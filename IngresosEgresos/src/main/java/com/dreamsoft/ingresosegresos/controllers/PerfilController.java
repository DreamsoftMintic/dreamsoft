package com.dreamsoft.ingresosegresos.controllers;

import com.dreamsoft.ingresosegresos.entities.Empresa;
import com.dreamsoft.ingresosegresos.entities.Perfil;
import com.dreamsoft.ingresosegresos.services.PerfilService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PerfilController {
    PerfilService service;

    public PerfilController(PerfilService services) {

        this.service = services;
    }
    //controlador Get, retorna todos los campos(filas) de la tabla
    @GetMapping("/perfil")
    public List<Perfil> getPerfiles() {
        return this.service.getPerfiles();
    }
    //Controlador Get con id especifico, retorna solo un campo(fila) de la tabla
    @GetMapping("/perfil/{id}")
    public Perfil getPerfil(@PathVariable("id") long id){
        return this.service.getPerfil(id);
    }
    //controlador Post, crea un campo(fila) en la tabla
    @PostMapping("/perfil")
    public Perfil createPerfil(@RequestBody Perfil perfil){
        return  this.service.createPerfil(perfil);
    }
    //controlador Delete, elimina un campo(fila) en la tabla
    @DeleteMapping("/perfil/{id}")
    public Boolean deletePerfil(@PathVariable("id") long id){
        return this.service.deletePerfil(id);
    }
    //controlador Put, actualiza un campo(fila) en la tabla. Actualiza todos los atributos, si un atributo no es mencionado se declara como null
    @PutMapping("/perfil/{id}")
    public Perfil updatePerfil(@PathVariable("id") long id, @RequestBody Perfil perfil){
        return this.service.updatePerfil(id,perfil);
    }
    //controlador Patch, actualiza parcialmente uno o varios de los datos de la fila. Actualiza solo los atributos mencionados, los no mencionados se dejan como estaban
    @PatchMapping("/perfil/{id}")
    public Perfil partialUpdatePerfil(@PathVariable("id") Long id, @RequestBody Map<Object, Object> fields){
        return this.service.partialUpdatePerfil(id, fields);
    }



}
