package org.danielgarcia.academiakinal.models;

public class Estudiante extends Persona {
    public String carnet;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String apellido, String sexo, String carnet, int edad) {
        super(nombre, apellido, sexo, edad);
        this.carnet = carnet;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
}