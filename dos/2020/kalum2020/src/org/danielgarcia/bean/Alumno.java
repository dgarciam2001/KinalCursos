package org.danielgarcia.bean;
import java.util.Date;
import org.danielgarcia.bean.Persona;

public class Alumno extends Persona {

    private String carne;

    public Alumno() {
    }

    public Alumno(String id, String nombres, String apellidos, Date fechaNacimiento, String carne) {
        super(id, nombres, apellidos, fechaNacimiento);
        this.carne = carne;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

}
