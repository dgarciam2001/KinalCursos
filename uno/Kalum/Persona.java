package org.danielgarcia.bean;

import java.util.Date;
import java.util.UUID;

public abstract class Persona {
    private String id;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;

    public Persona() {
        this.id = generarId();
    }

    public Persona(String id, String nombres, String apellidos, Date fechaNacimiento) {
        this.id = generarId();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String generarId(){
        return UUID.randomUUID().toString();
    }

}
