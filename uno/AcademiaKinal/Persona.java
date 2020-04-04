package org.danielgarcia.academiakinal.models;

import javax.sound.sampled.SourceDataLine;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;

    public Persona() {
        System.out.println("{\"nombre\" : " + this.nombre + ",\"apellido\" : \"" + this.apellido);
    }

    public Persona(String nombre, String apellido, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        System.out.println("{\"nombre\" :\"" + this.nombre + "\",\"apellido\" : \"" + this.apellido +"\"}");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}