package com.example.YoutubersLol.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.YoutubersLol.Repositories.jugadorRepository;
import com.example.YoutubersLol.models.jugadorModel;

@Service
public class jugadorservice {
@Autowired
jugadorRepository jugadoresRepository;
//Buscar todos los registros
public ArrayList<jugadorModel> obtenerjugadores(){
    return (ArrayList<jugadorModel>) jugadoresRepository.findAll();
}
public Optional<jugadorModel>obtenerporId(Integer Id){
    return jugadoresRepository.findById(Id);
}
//Metodo para guardaxr el jugador 
public jugadorModel guardar(jugadorModel jugador){
    return jugadoresRepository.save(jugador);
}
public boolean eliminar(Integer Id){
    try {
        jugadoresRepository.deleteById(Id);
        return true;
    } catch (Exception e) {
        return false;
    }
}
}