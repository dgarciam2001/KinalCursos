package org.danielgarcia.academiakinal.models;

public class Instructor extends Persona {
    private String instructorId;

    public Instructor() {
        super();
    }

    public Instructor(String nombre, String apellido, String sexo, int edad) {
        super(nombre, apellido, sexo, edad);
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

}