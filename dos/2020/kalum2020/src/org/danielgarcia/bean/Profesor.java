package org.danielgarcia.bean;

import org.danielgarcia.bean.Persona;
import java.util.Date;

public class Profesor extends Persona {
    private int idEmpleado;

    public Profesor() {
    }

    public Profesor(String id, String nombres, String apellidos, Date fechaDeNacimiento, int idEmpleado){
        super(id,nombres,apellidos,fechaDeNacimiento);
        this.idEmpleado = idEmpleado;
    }

    public Profesor(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

}