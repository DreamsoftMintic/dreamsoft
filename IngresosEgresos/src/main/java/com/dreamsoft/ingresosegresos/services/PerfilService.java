package com.dreamsoft.ingresosegresos.services;



import com.dreamsoft.ingresosegresos.entities.Perfil;
import com.dreamsoft.ingresosegresos.repositories.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository){
        this.perfilRepository = perfilRepository;
    }

    //Servicio para el controlador Get, retorna todos los campos(filas) de la tabla
    public List<Perfil> getPerfil(){
        return this.perfilRepository.findAll();}

    public Perfil getPerfil(long id){
        Optional<Perfil> perfil = this.perfilRepository.findById(id);
        return perfil.orElse(null);
    }

    public List<Perfil> getPerfil(Perfil perfil){
        return this.perfilRepository.findAll();
    }

    public Perfil createPerfil(Perfil perfil){
        return this.perfilRepository.save(perfil);
    }

    public Perfil updatePerfil(Long id, Perfil perfil){
        Optional<Perfil> dbData = this.perfilRepository.findById(id);

        if(dbData.isPresent()){
            Perfil e = dbData.get();
            e.setImagen(perfil.getImagen());
            e.setFechaCr(perfil.getFechaCr());
            e.setFechaUpd(perfil.getFechaUpd());
            e.setPass(perfil.getPass());
            e.setTelefono(perfil.getTelefono());


            this.perfilRepository.save(e);
            return e;
        }

        return null;
    }

    public Boolean deletePerfil(Long id){
        try{
            this.perfilRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }


}
