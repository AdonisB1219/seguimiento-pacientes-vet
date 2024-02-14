package com.citas.citasveterniario.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="pacientes")
public class InfoCita {
    @Id
    private String id;
    private String nombre="";
    private String propietario="";
    private String email="";
    private String fecha="";
    private String sintomas="";

    public InfoCita() {}

    public InfoCita(String nombre, String propietario, String email, String fecha, String sintomas){
        this.nombre = nombre;
        this.propietario = propietario;
        this.email = email;
        this.fecha = fecha;
        this.sintomas = sintomas;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "InfoCita{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", propietario='" + propietario + '\'' +
                ", email='" + email + '\'' +
                ", fecha='" + fecha + '\'' +
                ", sintomas='" + sintomas + '\'' +
                '}';
    }
}
