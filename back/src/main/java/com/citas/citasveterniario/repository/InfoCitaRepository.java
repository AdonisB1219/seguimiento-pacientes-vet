package com.citas.citasveterniario.repository;

import com.citas.citasveterniario.model.InfoCita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InfoCitaRepository extends MongoRepository<InfoCita, String> {

}
