package com.example.YoutubersLol.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.YoutubersLol.models.jugadorModel;
@Repository
public interface jugadorRepository extends CrudRepository<jugadorModel, Integer> {
    
}
