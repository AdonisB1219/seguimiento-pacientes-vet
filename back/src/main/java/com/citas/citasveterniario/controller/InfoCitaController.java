package com.citas.citasveterniario.controller;

import com.citas.citasveterniario.model.InfoCita;
import com.citas.citasveterniario.repository.InfoCitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api-citas")
public class InfoCitaController {
    @Autowired
    private InfoCitaRepository infoCitaRepository;

    @GetMapping
    public List<InfoCita> getAllCitas(){
        return infoCitaRepository.findAll();
    }

    @GetMapping("/{pacienteId}")
    public InfoCita getCitaById(@PathVariable String pacienteId) throws Exception {
        Optional<InfoCita> opcional = infoCitaRepository.findById(pacienteId);
        if(opcional.isPresent()) return opcional.get();
        else throw new Exception("El id no fue encontrado");
    }

    @PostMapping
    public InfoCita addCita(@RequestBody InfoCita nuevaCita){
        return infoCitaRepository.save(nuevaCita);
    }

    @PutMapping("/{pacienteId}")
    public InfoCita updateCita(@RequestBody InfoCita updatedCita, @PathVariable String pacienteId) throws Exception {
        Optional<InfoCita> opcional = infoCitaRepository.findById(pacienteId);
        if(opcional.isPresent()) {
            InfoCita oldCita = opcional.get();
            if(!updatedCita.getEmail().isEmpty()) oldCita.setEmail(updatedCita.getEmail());
            if(!updatedCita.getNombre().isEmpty()) oldCita.setNombre(updatedCita.getNombre());
            if(!updatedCita.getPropietario().isEmpty()) oldCita.setPropietario(updatedCita.getPropietario());
            if(!updatedCita.getFecha().isEmpty()) oldCita.setFecha(updatedCita.getFecha());
            if(!updatedCita.getSintomas().isEmpty()) oldCita.setSintomas(updatedCita.getSintomas());
            return infoCitaRepository.save(oldCita);
        }
        else throw new Exception("El id no fue encontrado");
    }

    @DeleteMapping("/{pacienteId}")
    public InfoCita deleteCita(@PathVariable String pacienteId) throws Exception {
        Optional<InfoCita> opcional = infoCitaRepository.findById(pacienteId);
        if (opcional.isPresent()){
            infoCitaRepository.deleteById(pacienteId);
            return opcional.get();
        }
        throw new Exception("El id proporcionado no fue localizado");
    }
}
